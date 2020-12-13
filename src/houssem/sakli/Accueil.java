/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houssem.sakli;

import java.sql.*;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static houssem.sakli.Test.c;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.event.DocumentListener;
import static jdk.nashorn.internal.objects.ArrayBufferView.length;

/**
 *
 * @author sakli
 */
public class Accueil extends javax.swing.JFrame {

    Connection c = null;
    PreparedStatement stmt = null;
    ResultSet res=null;
    int xMouse;
    int yMouse;
    static Comptes cnx=null;
    static ArrayList<Comptes> bdcomptes=new ArrayList<Comptes>();
    public Accueil(){
        try {
            bdcomptes.clear();
            sauvegardecomptes();
        } catch (SQLException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        this.setLocationRelativeTo(null); //pour centrer lapp
        jPanel1.setBackground(new Color(255,255,204,90));
        jPanel2.setBackground(new Color(29,218,183,90));
        showTime();
        showDate();
        seticon();

    }
    public boolean verifycnx(String xe, String xmdp) throws SQLException, ClassNotFoundException
    {       
            int i;
            for(i=0;i<bdcomptes.size();i++)
            {
                if (bdcomptes.get(i).email.equals(xe)&&bdcomptes.get(i).mdp.equals(xmdp))
                return true;
            }
            return false;
    }
    
    public Comptes getcnxvalue() throws SQLException, ClassNotFoundException
    {
        int i;
        
        if (emailexist(email2.getText()))
        {
            for(i=0;i<bdcomptes.size();i++)
                if (bdcomptes.get(i).email.equals(email2.getText()))
                    return bdcomptes.get(i);
        }
        return null;
    }
    
    public void sauvegardecomptes() throws SQLException, ClassNotFoundException
    {   
        
        Connection con=null;
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/projetjava";
        con = DriverManager.getConnection(url,"root","xpass121");
        String maRequete= "SELECT * FROM comptesinscrits";
       
        Statement s= con.createStatement();
        int i,j;
        res = s.executeQuery(maRequete);
        while(res.next())
        {       
            Comptes cp=new Comptes(res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7));
            bdcomptes.add(cp);
        }
        /*System.out.println("Size: "+bdcomptes.size());
        for(j=0;j<bdcomptes.size();j++)
        System.out.println(bdcomptes.get(j).email+","+bdcomptes.get(j).nom+","+bdcomptes.get(j).prenom+","+bdcomptes.get(j).genre+","+bdcomptes.get(j).mdp+","+bdcomptes.get(j).fonction+","+bdcomptes.get(j).nomentreprise);*/
    }
    
    public boolean emailexist(String x) throws SQLException, ClassNotFoundException
    {
        
        int i;
        for(i=0;i<bdcomptes.size();i++)
        {
            if (bdcomptes.get(i).email.equals(x))
                return true;
        }
        return false;
    }
    
    public void ajoutcompte() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/projetjava";
        c = DriverManager.getConnection(url,"root","xpass121");
        //System.out.println("tester l'ecriture des données :");
        //stmt = c.createStatement();
        String nomc=nom.getText();
        String prenomc=prenom.getText();
        String genrec=null;
        if (jRadioButtonhomme.isSelected())
            genrec="Homme";
        if (jRadioButtonfemme.isSelected())
            genrec="Femme";
        String emailc=email.getText();
        String mdpc=String.valueOf(mdp.getPassword());
        String fonctionc=null;
        if (jRadioButtonpdg.isSelected())
            fonctionc="PDG / Responsable";
        if (jRadioButtonagent.isSelected())
            fonctionc="Agent du service";
        String nomentc=null;
        if (jRadioButtonpdg.isSelected())
            nomentc=noment.getText();
        
        //String requete = "insert into comptesinscrits values ("+emailc+","+nomc+","+prenomc+","+genrec+","+mdpc+","+fonctionc+","+nomentc+")";
        String requete = "insert into comptesinscrits(email,nom,prenom,genre,mdp,fonction,nomentreprise) values(?,?,?,?,?,?,?)";
        stmt = c.prepareStatement(requete);
        stmt.setString(1, emailc);
        stmt.setString(2, nomc);
        stmt.setString(3, prenomc);
        stmt.setString(4, genrec);
        stmt.setString(5, mdpc);
        stmt.setString(6, fonctionc);
        stmt.setString(7, nomentc);
        
        stmt.execute();
    }
            

    private void seticon(){

     setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/houssem/sakli/Icons/Fasttracker.png")));
    
    }
    void showDate(){
        Date d = new Date();
        SimpleDateFormat dd = new SimpleDateFormat("dd-MM-yyyy");
        jLabelDate.setText(dd.format(d));
    }

    void showTime(){
        new Timer(0, new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		Date d = new Date();
		SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
		jLabelTime1.setText(s.format(d));
        }}).start();
    }
    
    private boolean validnom(String x)
    {
        int i;
        if (x.length()<=3)
            return false;
        for (i=0;i<x.length();i++)
        {
            if(!(Character.isLetter(x.charAt(i))||(x.charAt(i)==KeyEvent.VK_BACK_SPACE)||x.charAt(i)==KeyEvent.VK_DELETE))
                return false;
        }
        
        return true;
    }
    
    private boolean validemail(String x)
    {
        if (x.contains("@")&&x.contains(".")&&x.length()>=8)
            return true;
        return false;
    }
    
    private boolean validmdp(String x)
    {
        if (x.length()>=8)
            return true;
        return false;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Genre = new javax.swing.ButtonGroup();
        Fonction = new javax.swing.ButtonGroup();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMinimize = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        MouseDrag = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel(){
            protected void paintComponent(Graphics g)
            {
                g.setColor( getBackground() );
                g.fillRect(0, 0, getWidth(), getHeight());
                super.paintComponent(g);
            }
        };
        checkerror4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        email2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        mdp2 = new javax.swing.JPasswordField();
        jLabelconnexion = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel(){
            protected void paintComponent(Graphics g)
            {
                g.setColor( getBackground() );
                g.fillRect(0, 0, getWidth(), getHeight());
                super.paintComponent(g);
            }
        };
        checkerror = new javax.swing.JLabel();
        checkerror1 = new javax.swing.JLabel();
        checkerror2 = new javax.swing.JLabel();
        checkerror3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        prenom = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jRadioButtonfemme = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        mdp = new javax.swing.JPasswordField();
        jLabelnoment = new javax.swing.JLabel();
        jRadioButtonagent = new javax.swing.JRadioButton();
        jLabelinscription = new javax.swing.JLabel();
        jRadioButtonhomme = new javax.swing.JRadioButton();
        jRadioButtonpdg = new javax.swing.JRadioButton();
        jLabel29 = new javax.swing.JLabel();
        noment = new javax.swing.JTextField();
        jLabelDate = new javax.swing.JLabel();
        jLabelTime1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Accueil");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        kGradientPanel1.setkEndColor(new java.awt.Color(217, 244, 240));
        kGradientPanel1.setkGradientFocus(3000);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/close3.png"))); // NOI18N
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseReleased(evt);
            }
        });
        kGradientPanel1.add(jLabelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 8, -1, -1));

        jLabelMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/minimize3.png"))); // NOI18N
        jLabelMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseExited(evt);
            }
        });
        kGradientPanel1.add(jLabelMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 8, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/Fasttracker1.png"))); // NOI18N
        logo.setMaximumSize(new java.awt.Dimension(58, 58));
        kGradientPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 60));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Accueil");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 840, -1));

        MouseDrag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MouseDragMouseDragged(evt);
            }
        });
        MouseDrag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MouseDragMousePressed(evt);
            }
        });
        kGradientPanel1.add(MouseDrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 60));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 835, 60));

        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/or6.png"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        jPanel1.setOpaque(false);
        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(checkerror4, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 92, 30, 30));

        jLabel15.setBackground(new java.awt.Color(222, 222, 245));
        jLabel15.setFont(new java.awt.Font("Naughty Monster", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 204));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Connectez-Vous");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 319, 37));

        email2.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        email2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 85, 76)));
        email2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email2ActionPerformed(evt);
            }
        });
        email2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                email2KeyReleased(evt);
            }
        });
        jPanel1.add(email2, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 92, 230, 30));

        jLabel21.setFont(new java.awt.Font("Kurri Island Caps Italics", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Email:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 93, -1, -1));

        jLabel22.setFont(new java.awt.Font("Kurri Island Caps Italics", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Mot de passe:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 141, -1, -1));

        mdp2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 85, 76)));
        mdp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdp2ActionPerformed(evt);
            }
        });
        mdp2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mdp2KeyReleased(evt);
            }
        });
        jPanel1.add(mdp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 140, 230, 30));

        jLabelconnexion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/boutoncnx3-1.png"))); // NOI18N
        jLabelconnexion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelconnexion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelconnexionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelconnexionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelconnexionMousePressed(evt);
            }
        });
        jPanel1.add(jLabelconnexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 150, 50));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 390, 260));

        jPanel2.setOpaque(false);
        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(checkerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 140, 30, 30));
        jPanel2.add(checkerror1, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 90, 30, 30));
        jPanel2.add(checkerror2, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 230, 30, 30));
        jPanel2.add(checkerror3, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 279, 30, 30));

        jLabel8.setFont(new java.awt.Font("Naughty Monster", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 255, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Créer un nouveau compte");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 390, 37));

        nom.setFont(new java.awt.Font("Source Sans Pro", 0, 18)); // NOI18N
        nom.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 85, 76)));
        nom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nomFocusLost(evt);
            }
        });
        nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomActionPerformed(evt);
            }
        });
        nom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nomKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomKeyTyped(evt);
            }
        });
        jPanel2.add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 204, 30));

        jLabel9.setFont(new java.awt.Font("Kurri Island Caps Italics", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nom:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 90, -1, -1));

        prenom.setFont(new java.awt.Font("Source Sans Pro", 0, 18)); // NOI18N
        prenom.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 85, 76)));
        prenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenomActionPerformed(evt);
            }
        });
        prenom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                prenomKeyReleased(evt);
            }
        });
        jPanel2.add(prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 204, 30));

        jLabel16.setFont(new java.awt.Font("Kurri Island Caps Italics", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Prénom:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 138, -1, -1));

        jLabel23.setFont(new java.awt.Font("Kurri Island Caps Italics", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Genre:");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 184, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/femalesmall.png"))); // NOI18N
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/malesmall.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 180, -1, -1));

        jRadioButtonfemme.setBackground(new java.awt.Color(255, 255, 255));
        Genre.add(jRadioButtonfemme);
        jRadioButtonfemme.setFont(new java.awt.Font("Source Sans Pro", 0, 18)); // NOI18N
        jRadioButtonfemme.setForeground(new java.awt.Color(222, 221, 221));
        jRadioButtonfemme.setText("Femme");
        jRadioButtonfemme.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 85, 76)));
        jRadioButtonfemme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonfemme.setOpaque(false);
        jRadioButtonfemme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonfemmeActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButtonfemme, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 182, 100, 30));

        jLabel25.setFont(new java.awt.Font("Kurri Island Caps Italics", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Email:");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 232, -1, -1));

        email.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        email.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 85, 76)));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
        });
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 210, 30));

        jLabel26.setFont(new java.awt.Font("Kurri Island Caps Italics", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Mot de passe:");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 279, -1, -1));

        mdp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 85, 76)));
        mdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdpActionPerformed(evt);
            }
        });
        mdp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mdpKeyReleased(evt);
            }
        });
        jPanel2.add(mdp, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 279, 210, 30));

        jLabelnoment.setFont(new java.awt.Font("Kurri Island Caps Italics", 1, 16)); // NOI18N
        jLabelnoment.setForeground(new java.awt.Color(255, 255, 255));
        jLabelnoment.setText("Nom de l'entreprise:");
        jPanel2.add(jLabelnoment, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 150, -1));

        jRadioButtonagent.setBackground(new java.awt.Color(255, 255, 255));
        Fonction.add(jRadioButtonagent);
        jRadioButtonagent.setFont(new java.awt.Font("Source Sans Pro", 0, 18)); // NOI18N
        jRadioButtonagent.setForeground(new java.awt.Color(222, 221, 221));
        jRadioButtonagent.setText("Agent du service");
        jRadioButtonagent.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 85, 76)));
        jRadioButtonagent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonagent.setFocusPainted(false);
        jRadioButtonagent.setOpaque(false);
        jRadioButtonagent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonagentActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButtonagent, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 200, 30));

        jLabelinscription.setBackground(new java.awt.Color(29, 218, 183));
        jLabelinscription.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/boutonins.png"))); // NOI18N
        jLabelinscription.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelinscription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelinscriptionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelinscriptionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelinscriptionMousePressed(evt);
            }
        });
        jPanel2.add(jLabelinscription, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 150, -1));

        jRadioButtonhomme.setBackground(new java.awt.Color(255, 255, 255));
        Genre.add(jRadioButtonhomme);
        jRadioButtonhomme.setFont(new java.awt.Font("Source Sans Pro", 0, 18)); // NOI18N
        jRadioButtonhomme.setForeground(new java.awt.Color(222, 221, 221));
        jRadioButtonhomme.setText("Homme");
        jRadioButtonhomme.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 85, 76)));
        jRadioButtonhomme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonhomme.setFocusPainted(false);
        jRadioButtonhomme.setOpaque(false);
        jRadioButtonhomme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonhommeActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButtonhomme, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 182, 100, 30));

        jRadioButtonpdg.setBackground(new java.awt.Color(255, 255, 255));
        Fonction.add(jRadioButtonpdg);
        jRadioButtonpdg.setFont(new java.awt.Font("Source Sans Pro", 0, 18)); // NOI18N
        jRadioButtonpdg.setForeground(new java.awt.Color(222, 221, 221));
        jRadioButtonpdg.setSelected(true);
        jRadioButtonpdg.setText("PDG / Responsable");
        jRadioButtonpdg.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 85, 76)));
        jRadioButtonpdg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonpdg.setFocusPainted(false);
        jRadioButtonpdg.setOpaque(false);
        jRadioButtonpdg.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonpdgItemStateChanged(evt);
            }
        });
        jRadioButtonpdg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonpdgActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButtonpdg, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 200, 30));

        jLabel29.setFont(new java.awt.Font("Kurri Island Caps Italics", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Fonction:");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        noment.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        noment.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 85, 76)));
        noment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomentActionPerformed(evt);
            }
        });
        noment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomentKeyReleased(evt);
            }
        });
        jPanel2.add(noment, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 210, 30));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 30, 390, 500));

        jLabelDate.setFont(new java.awt.Font("Harmonious Calendar", 1, 18)); // NOI18N
        jLabelDate.setForeground(new java.awt.Color(153, 255, 255));
        jPanel3.add(jLabelDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, -1, -1));

        jLabelTime1.setFont(new java.awt.Font("DS-Digital", 1, 24)); // NOI18N
        jLabelTime1.setForeground(new java.awt.Color(204, 255, 255));
        jLabelTime1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(jLabelTime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 540, 140, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/credits2.gif"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, 550, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 835, 570));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/background2.jpg"))); // NOI18N
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 840, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizeMouseClicked

    private void jLabelCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseEntered
        jLabelClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/close3v2.png")));
    }//GEN-LAST:event_jLabelCloseMouseEntered

    private void jLabelCloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelCloseMouseReleased

    private void jLabelCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseExited
        jLabelClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/close3.png")));
    }//GEN-LAST:event_jLabelCloseMouseExited

    private void jLabelMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseExited
        jLabelMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/minimize3.png")));
    }//GEN-LAST:event_jLabelMinimizeMouseExited

    private void jLabelMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseEntered
        jLabelMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/minimize3v2.png")));
    }//GEN-LAST:event_jLabelMinimizeMouseEntered

    private void email2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email2ActionPerformed

    private void mdp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mdp2ActionPerformed

    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomActionPerformed

    private void prenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomActionPerformed

    private void jRadioButtonfemmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonfemmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonfemmeActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void mdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mdpActionPerformed

    private void jRadioButtonagentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonagentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonagentActionPerformed

    private void jLabelinscriptionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelinscriptionMouseEntered
        jLabelinscription.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/boutoninsv2.png")));
    }//GEN-LAST:event_jLabelinscriptionMouseEntered

    private void jLabelinscriptionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelinscriptionMouseExited
        jLabelinscription.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/boutonins.png")));
    }//GEN-LAST:event_jLabelinscriptionMouseExited

    private void jLabelconnexionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelconnexionMouseEntered
        jLabelconnexion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/boutoncnxv2.png")));
    }//GEN-LAST:event_jLabelconnexionMouseEntered

    private void jLabelconnexionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelconnexionMouseExited
        jLabelconnexion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/boutoncnx3-1.png")));
    }//GEN-LAST:event_jLabelconnexionMouseExited

    private void nomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomKeyPressed
       /* char c=evt.getKeyChar();
        nomtxt=nomtxt+c;   
        ImageIcon icon = new ImageIcon(getClass().getResource("/houssem/sakli/Icons/error1.png"));
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/houssem/sakli/Icons/valid1.png"));
        int i;
        for (i=0;i<length(nomtxt);i++)
        {
        if(!(Character.isLetter(nomtxt.charAt(i))||(nomtxt.charAt(i)==KeyEvent.VK_BACK_SPACE)||nomtxt.charAt(i)==KeyEvent.VK_DELETE))
        {
            checkerror.setIcon(icon);
            break;
        }
        else    
            checkerror.setIcon(icon2);
        }
        */
        /*char c=evt.getKeyChar();   
        ImageIcon icon = new ImageIcon(getClass().getResource("/houssem/sakli/Icons/error1.png"));
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/houssem/sakli/Icons/valid1.png"));
        if(!(Character.isLetter(c)||(c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE))
        {
            checkerror1.setIcon(icon);
            checkerror.setVisible(false);
        }
        else    
            checkerror.setIcon(icon2);
        if(nom.getText().trim().isEmpty()||nom.getText()==null)
        checkerror.setVisible(true);
*/

    }//GEN-LAST:event_nomKeyPressed

    private void nomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomKeyTyped

    }//GEN-LAST:event_nomKeyTyped

    private void nomFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomFocusLost

    }//GEN-LAST:event_nomFocusLost

    private void nomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomKeyReleased
        JTextField src = (JTextField)evt.getSource();
        String nomtxt=src.getText();
        ImageIcon icon = new ImageIcon(getClass().getResource("/houssem/sakli/Icons/error1.png"));
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/houssem/sakli/Icons/valid1.png"));
        int i;
        for (i=0;i<nomtxt.length();i++)
        {
            if(!(nomtxt.length()>=3&&(Character.isLetter(nomtxt.charAt(i))||(nomtxt.charAt(i)==KeyEvent.VK_BACK_SPACE)||nomtxt.charAt(i)==KeyEvent.VK_DELETE)))
            {
                checkerror1.setIcon(icon);
                checkerror1.setToolTipText("Le nom doit être composé par des lettres seulement et doit contenir au moins 3 lettres !");
                break;
            }
            else
            {
                checkerror1.setIcon(icon2); 
                checkerror1.setToolTipText(null);
            }
        }
    }//GEN-LAST:event_nomKeyReleased

    private void prenomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prenomKeyReleased
        JTextField src = (JTextField)evt.getSource();
        String prenomtxt=src.getText();
        ImageIcon icon = new ImageIcon(getClass().getResource("/houssem/sakli/Icons/error1.png"));
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/houssem/sakli/Icons/valid1.png"));
        int i;
        for (i=0;i<prenomtxt.length();i++)
        {
            if(!(prenomtxt.length()>=3&&(Character.isLetter(prenomtxt.charAt(i))||(prenomtxt.charAt(i)==KeyEvent.VK_BACK_SPACE)||prenomtxt.charAt(i)==KeyEvent.VK_DELETE)))
            {
                checkerror.setIcon(icon);
                checkerror.setToolTipText("Le prénom doit être composé par des lettres seulement et doit contenir au moins 3 lettres !");
                break;
            }
            else
            {
                checkerror.setIcon(icon2); 
                checkerror.setToolTipText(null);
            }
        }
    }//GEN-LAST:event_prenomKeyReleased

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased
        JTextField src = (JTextField)evt.getSource();
        String emailtxt=src.getText();
        ImageIcon icon = new ImageIcon(getClass().getResource("/houssem/sakli/Icons/error1.png"));
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/houssem/sakli/Icons/valid1.png"));
        if (emailtxt.contains("@")&&emailtxt.contains(".")&&emailtxt.length()>=8)
        {
                checkerror2.setIcon(icon2);
                checkerror2.setToolTipText(null);
        }
        else
        {
            checkerror2.setIcon(icon); 
            checkerror2.setToolTipText("Email non valide !");
        }

    }//GEN-LAST:event_emailKeyReleased

    private void mdpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mdpKeyReleased
        JTextField src = (JTextField)evt.getSource();
        String mdptxt=src.getText();
        ImageIcon icon = new ImageIcon(getClass().getResource("/houssem/sakli/Icons/error1.png"));
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/houssem/sakli/Icons/valid1.png"));
        if (mdptxt.length()>=8)
        {
                checkerror3.setIcon(icon2);
                checkerror3.setToolTipText(null);
        }
        else
        {
            checkerror3.setIcon(icon); 
            checkerror3.setToolTipText("Le mot de passe doit contenir au moins 8 caractères !");
        }
    }//GEN-LAST:event_mdpKeyReleased

    private void email2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_email2KeyReleased
        JTextField src = (JTextField)evt.getSource();
        String emailtxt=src.getText();
        ImageIcon icon = new ImageIcon(getClass().getResource("/houssem/sakli/Icons/error1.png"));
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/houssem/sakli/Icons/valid1.png"));
        if (emailtxt.contains("@")&&emailtxt.contains(".")&&emailtxt.length()>=8)
        {
                checkerror4.setIcon(icon2);
                checkerror4.setToolTipText(null);
        }
        else
        {
            checkerror4.setIcon(icon);
            checkerror4.setToolTipText("Email non valide !");
        }
    }//GEN-LAST:event_email2KeyReleased

    private void mdp2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mdp2KeyReleased

    }//GEN-LAST:event_mdp2KeyReleased

    private void MouseDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseDragMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y- yMouse);
    }//GEN-LAST:event_MouseDragMouseDragged

    private void MouseDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseDragMousePressed
        xMouse= evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_MouseDragMousePressed

    private void jRadioButtonhommeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonhommeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonhommeActionPerformed

    private void jRadioButtonpdgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonpdgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonpdgActionPerformed

    private void nomentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomentActionPerformed

    private void nomentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomentKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_nomentKeyReleased

    private void jRadioButtonpdgItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonpdgItemStateChanged
        if (jRadioButtonpdg.isSelected())
        {
            noment.setVisible(true);
            jLabelnoment.setVisible(true);
        }
        else
        {
            noment.setVisible(false);
            jLabelnoment.setVisible(false);
        }
    }//GEN-LAST:event_jRadioButtonpdgItemStateChanged

    private void jLabelinscriptionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelinscriptionMousePressed
        try {
            
            if (emailexist(email.getText())==false&&validnom(nom.getText())&&validnom(prenom.getText())&&validemail(email.getText())&&validmdp(String.valueOf(mdp.getPassword()))&&(validnom(noment.getText())||jRadioButtonagent.isSelected())&&(jRadioButtonhomme.isSelected()||jRadioButtonfemme.isSelected()))
            {
                ajoutcompte();
                //JOptionPane.showMessageDialog(jPanel1, "Votre compte a été créé avec succès !");
                JOptionPane pane = new JOptionPane("Votre compte a été créé avec succès !");
                JDialog d = pane.createDialog(jPanel2, "SUCCES");
                d.setLocationRelativeTo(jPanel2);
                d.setVisible(true);
                String nomc=nom.getText();
                String prenomc=prenom.getText();
                String genrec=null;
                if (jRadioButtonhomme.isSelected())
                genrec="Homme";
                if (jRadioButtonfemme.isSelected())
                genrec="Femme";
                String emailc=email.getText();
                String mdpc=String.valueOf(mdp.getPassword());
                String fonctionc=null;
                if (jRadioButtonpdg.isSelected())
                    fonctionc="PDG / Responsable";
                if (jRadioButtonagent.isSelected())
                    fonctionc="Agent du service";
                String nomentc=null;
                if (jRadioButtonpdg.isSelected())
                    nomentc=noment.getText();
                Comptes cp=new Comptes(emailc,nomc,prenomc,genrec,mdpc,fonctionc,nomentc);
                bdcomptes.add(cp);
            }
            else
                if (emailexist(email.getText())==true)
                {
                    JOptionPane pane = new JOptionPane("Un compte avec cet email existe déja !");
                    JDialog d = pane.createDialog(jPanel2, "ERREUR");
                    d.setLocationRelativeTo(jPanel2);
                    d.setVisible(true);
                }
                else
                {    //JOptionPane.showMessageDialog(jPanel1, "Verifier tous les champs !");
                    JOptionPane pane = new JOptionPane("Verifier tous les champs !");
                    JDialog d = pane.createDialog(jPanel2, "ERREUR");
                    d.setLocationRelativeTo(jPanel2);
                    d.setVisible(true);
                }
        } catch (Exception ex) {
            System.out.println("Erreur sql: "+ex);
        }
        
    }//GEN-LAST:event_jLabelinscriptionMousePressed

    private void jLabelconnexionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelconnexionMousePressed
        try {
            if (verifycnx(email2.getText(),String.valueOf(mdp2.getPassword()))==true)
            {
                    cnx=getcnxvalue();
                    if (cnx.fonction.equals("Agent du service"))
                    {
                        NavigateurAgent nv2 = new NavigateurAgent();
                        nv2.setVisible(true);
                        this.setVisible(false);
                        nv2.pack();                        
                    }    
                    else
                    {
                        Navigateur nv = new Navigateur();
                        nv.setVisible(true);
                        this.setVisible(false);
                        nv.pack();
                    }
            }
            else
            {
                    JOptionPane pane = new JOptionPane("Email ou Mot de passe incorrect !");
                    JDialog d = pane.createDialog(jPanel1, "ERREUR");
                    d.setLocationRelativeTo(jPanel1);
                    d.setVisible(true);
            }
        
        } catch (Exception ex) {
            System.out.println("Exception: "+ex);
        }
    }//GEN-LAST:event_jLabelconnexionMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {              
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch(Exception ignored){                  } //Take composents of windows not java
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Accueil().setVisible(true);
                
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Fonction;
    private javax.swing.ButtonGroup Genre;
    private javax.swing.JLabel MouseDrag;
    private javax.swing.JLabel checkerror;
    private javax.swing.JLabel checkerror1;
    private javax.swing.JLabel checkerror2;
    private javax.swing.JLabel checkerror3;
    private javax.swing.JLabel checkerror4;
    private javax.swing.JTextField email;
    private javax.swing.JTextField email2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JLabel jLabelTime1;
    private javax.swing.JLabel jLabelconnexion;
    private javax.swing.JLabel jLabelinscription;
    private javax.swing.JLabel jLabelnoment;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButtonagent;
    private javax.swing.JRadioButton jRadioButtonfemme;
    private javax.swing.JRadioButton jRadioButtonhomme;
    private javax.swing.JRadioButton jRadioButtonpdg;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField mdp;
    private javax.swing.JPasswordField mdp2;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField noment;
    private javax.swing.JTextField prenom;
    // End of variables declaration//GEN-END:variables
}
