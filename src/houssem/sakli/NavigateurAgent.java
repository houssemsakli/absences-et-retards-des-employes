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
import static houssem.sakli.Accueil.bdcomptes;
import static houssem.sakli.Accueil.cnx;
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
import javax.swing.table.DefaultTableModel;
import static jdk.nashorn.internal.objects.ArrayBufferView.length;
import net.proteanit.sql.DbUtils;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import java.text.MessageFormat;
import javax.swing.JTable;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;

/**
 *
 * @author sakli
 */
public class NavigateurAgent extends javax.swing.JFrame {

    Connection c = null;
    PreparedStatement stmt = null;
    ResultSet res=null;
    int xMouse;
    int yMouse;
    static ArrayList<Retard> bdretards=new ArrayList<Retard>();
    static ArrayList<Employes> bdemployes=new ArrayList<Employes>();
    
    public NavigateurAgent() {
        try {
            sauvegardeemployes();
            sauvegarderetards();
            
        } catch (SQLException ex) {
            Logger.getLogger(NavigateurAgent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NavigateurAgent.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        this.setLocationRelativeTo(null); //pour centrer lapp
        try {
            banner();
            
            affichetableemployes();
            calculemploye();
            
        } catch (SQLException ex) {
            Logger.getLogger(NavigateurAgent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NavigateurAgent.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        showTime();
        showDate();
        seticon();
        //System.out.println("size ret: "+bdretards.size());
        //System.out.println(bdretards.get(0).id+" | "+bdretards.get(0).type+" | "+bdretards.get(0).dateabs+" | "+bdretards.get(0).heuredb+" |mat= "+bdretards.get(0).mat);
    }
    
    public void sauvegardeemployes() throws SQLException, ClassNotFoundException
    {   
        Connection con = null;
        ResultSet res2=null;
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/projetjava";
        con = DriverManager.getConnection(url,"root","xpass121");
        String maRequete= "SELECT * FROM employes";
       
        Statement s= con.createStatement();
        res2 = s.executeQuery(maRequete);
        while(res2.next())
        {       
            Employes em=new Employes(res2.getString(1),res2.getString(2),res2.getString(3),res2.getString(4),res2.getString(5));
                bdemployes.add(em);
                
        }
       // int i;
       // for(i=0;i<bdemployes.size();i++)
        //System.out.println(bdemployes.get(i).mat+","+bdemployes.get(i).nom+","+bdemployes.get(i).prenom+","+bdemployes.get(i).service);

    }
    
    public static void affichetableemployes()
    {
        try{
                int i;
                DefaultTableModel model = (DefaultTableModel) jTable8.getModel();
                model.setRowCount(0);
                for (i=0;i<bdemployes.size();i++)
                {
                    if(bdemployes.get(i).nomentreprise.equals(cnx.nomentreprise))
                    {
                        
                        model.addRow(new Object[]{bdemployes.get(i).mat,bdemployes.get(i).nom,bdemployes.get(i).prenom,bdemployes.get(i).service});
                        //System.out.println(bdemployes.get(i).mat+","+bdemployes.get(i).nom+","+bdemployes.get(i).prenom+","+bdemployes.get(i).service);
                    }
                }
        }catch(Exception e)
        {
            System.out.println("Exception: "+e);
        }
    }
    
        public void sauvegarderetards() throws SQLException, ClassNotFoundException
    {   
        Connection con1 = null;
        ResultSet res3=null;
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/projetjava";
        con1 = DriverManager.getConnection(url,"root","xpass121");
        String maRequete= "SELECT * FROM retards";
       
        Statement st= con1.createStatement();
        res3 = st.executeQuery(maRequete);
        while(res3.next())
        {       
            Retard rt=new Retard(res3.getString(1),res3.getString(2),res3.getString(3),res3.getDate(4),res3.getTime(5),res3.getTime(6),res3.getString(7),res3.getString(8),res3.getString(9));
                bdretards.add(rt);
                
        }

    }
        
    public static void affichetableretards()
    {
        try{
                int j;
                DefaultTableModel model2 = (DefaultTableModel) jTable9.getModel();
                model2.setRowCount(0);
                int index2=jTable8.getSelectedRow();
                String value2=(String) jTable8.getModel().getValueAt(index2, 0);

                for (j=0;j<bdretards.size();j++)
                {
                    if(bdretards.get(j).mat.equals(value2))
                    {
                    model2.addRow(new Object[]{bdretards.get(j).id,bdretards.get(j).type,bdretards.get(j).dateabs,bdretards.get(j).heuredb,bdretards.get(j).duree,bdretards.get(j).motif,bdretards.get(j).justificatif,bdretards.get(j).autorise});
                    }
                }
                                    
        }catch(Exception e)
        {
            System.out.println("Exception: "+e);
        }
    }
    
    public void calculemploye()
    {
        DefaultTableModel model = (DefaultTableModel) jTable8.getModel();
        int n=model.getRowCount();
        int i,j,nbab;
        for (i=0;i<n;i++)
        {
            String getmat=(String) jTable8.getModel().getValueAt(i, 0);
            nbab=0;
            for (j=0;j<bdretards.size();j++)
            {
                if (bdretards.get(j).mat.equals(getmat))
                    nbab++;
            }
            model.setValueAt(nbab, i, 4);
        }
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

    
    public void changercnx() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/projetjava";
        c = DriverManager.getConnection(url,"root","xpass121");
        String nomc=nom.getText();
        String prenomc=prenom.getText();
        String genrec=null;
        if (jRadioButtonhomme.isSelected())
            genrec="Homme";
        if (jRadioButtonfemme.isSelected())
            genrec="Femme";
        String emailc=cnx.email;
        String fonctionc=cnx.fonction;
        String mdpc=cnx.mdp;
        String nomentc=cnx.nomentreprise;
        Comptes cp=new Comptes(emailc,nomc,prenomc,genrec,mdpc,fonctionc,nomentc);
        
        String requete = "UPDATE comptesinscrits SET nom='"+nomc+"', prenom='"+prenomc+"', genre='"+genrec+"' WHERE email='"+cnx.email+"'";
        stmt = c.prepareStatement(requete);
        stmt.execute();
        
        int i;
        for(i=0;i<bdcomptes.size();i++)
        {
            if (bdcomptes.get(i).email.equals(cnx.email))
                bdcomptes.set(i, cp);
        }
        cnx=cp;
        jLabelbanner.setText("Bienvenue "+cnx.prenom+" "+cnx.nom+",");
    }
    
    public void changermdp() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/projetjava";
        c = DriverManager.getConnection(url,"root","xpass121");
        String nomc=cnx.nom;
        String prenomc=cnx.prenom;
        String genrec=cnx.genre;
        String emailc=cnx.email;
        String fonctionc=cnx.fonction;
        String mdpc=String.valueOf(jPasswordFieldNouveau.getPassword());
        String nomentc=cnx.nomentreprise;
        Comptes cp=new Comptes(emailc,nomc,prenomc,genrec,mdpc,fonctionc,nomentc);
        
        String requete = "UPDATE comptesinscrits SET mdp='"+mdpc+"' WHERE email='"+cnx.email+"'";
        stmt = c.prepareStatement(requete);
        stmt.execute();
        
        int i;
        for(i=0;i<bdcomptes.size();i++)
        {
            if (bdcomptes.get(i).email.equals(cnx.email))
                bdcomptes.set(i, cp);
        }
        cnx=cp;
    }
    
    private boolean validmdp(String x)
    {
        if (x.length()>=8)
            return true;
        return false;
    }
    
    public void banner() throws SQLException, ClassNotFoundException
    {
        jLabelbanner.setText("Bienvenue "+cnx.prenom+" "+cnx.nom+",");
        if (cnx.nomentreprise!=null)
            jLabelbanner1.setText("Entreprise: "+cnx.nomentreprise);
        else
            jLabelbanner1.setText("Vous n'êtes pas associé à une entreprise.");
    }

   
    
    
    private void seticon(){

     setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/houssem/sakli/Icons/Fasttracker.png")));
    
    }
    void showDate(){
        Date d = new Date();
        SimpleDateFormat dd = new SimpleDateFormat("dd-MM-yyyy");
        //jLabelDate.setText(dd.format(d));
    }

    void showTime(){
        new Timer(0, new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		Date d = new Date();
		SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
//		jLabelTime1.setText(s.format(d));
        }}).start();
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
        Genre2 = new javax.swing.ButtonGroup();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMinimize = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        MouseDrag = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        imprimeremployes = new javax.swing.JLabel();
        imprimer = new javax.swing.JLabel();
        ajouterfiche = new javax.swing.JLabel();
        ajouteremploye = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        checkerror4 = new javax.swing.JLabel();
        checkerror3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        fonction = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        prenom = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jRadioButtonfemme = new javax.swing.JRadioButton();
        jRadioButtonhomme = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPasswordFieldConfirm = new javax.swing.JPasswordField();
        jPasswordFieldNouveau = new javax.swing.JPasswordField();
        jPasswordFieldActuel = new javax.swing.JPasswordField();
        enregistrer1 = new javax.swing.JLabel();
        enregistrer = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabelbanner = new javax.swing.JLabel();
        jLabelbanner1 = new javax.swing.JLabel();
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
        kGradientPanel1.add(jLabelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1238, 8, -1, -1));

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
        kGradientPanel1.add(jLabelMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 8, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/Fasttracker1.png"))); // NOI18N
        logo.setMaximumSize(new java.awt.Dimension(58, 58));
        kGradientPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 60));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tableau de Bord");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1290, -1));

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
        kGradientPanel1.add(MouseDrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 60));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 60));

        jTabbedPane1.setBackground(new java.awt.Color(102, 102, 102));
        jTabbedPane1.setForeground(new java.awt.Color(51, 51, 0));
        jTabbedPane1.setFont(new java.awt.Font("LEMON MILK Bold", 0, 13)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 0), 3, true));
        jScrollPane2.setFont(new java.awt.Font("Source Sans Pro", 0, 18)); // NOI18N

        jTable9.setAutoCreateRowSorter(true);
        jTable9.setBackground(new java.awt.Color(252, 241, 239));
        jTable9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0), 2));
        jTable9.setFont(new java.awt.Font("Source Sans Pro", 0, 18)); // NOI18N
        jTable9.getTableHeader().setFont(new java.awt.Font("Source Sans Pro", 1, 18));
        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Type", "Date", "Heure de début", "Durée", "Motif", "Justificatif", "Autorisation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable9.setAlignmentX(1.0F);
        jTable9.setAlignmentY(1.0F);
        jTable9.setGridColor(new java.awt.Color(102, 102, 0));
        jTable9.setIntercellSpacing(new java.awt.Dimension(2, 2));
        jTable9.setRowHeight(25);
        jScrollPane2.setViewportView(jTable9);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 1040, 250));

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 0), 3, true));
        jScrollPane1.setFont(new java.awt.Font("Source Sans Pro", 0, 18)); // NOI18N

        jTable8.setAutoCreateRowSorter(true);
        jTable8.setBackground(new java.awt.Color(252, 241, 239));
        jTable8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0), 2));
        jTable8.setFont(new java.awt.Font("Source Sans Pro", 0, 18)); // NOI18N
        jTable8.getTableHeader().setFont(new java.awt.Font("Source Sans Pro", 1, 18));
        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricule", "Nom", "Prénom", "Service", "Nombres des A/R", "Durée totale des A/R"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable8.setAlignmentX(1.0F);
        jTable8.setAlignmentY(1.0F);
        jTable8.setGridColor(new java.awt.Color(102, 102, 0));
        jTable8.setIntercellSpacing(new java.awt.Dimension(2, 2));
        jTable8.setRowHeight(25);
        jTable8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable8MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable8);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1040, 250));

        imprimeremployes.setBackground(new java.awt.Color(255, 255, 204));
        imprimeremployes.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        imprimeremployes.setForeground(new java.awt.Color(153, 0, 0));
        imprimeremployes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/imprimer.png"))); // NOI18N
        imprimeremployes.setText("Imprimer");
        imprimeremployes.setToolTipText("");
        imprimeremployes.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 102, 0)));
        imprimeremployes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imprimeremployes.setOpaque(true);
        imprimeremployes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imprimeremployesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imprimeremployesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imprimeremployesMouseExited(evt);
            }
        });
        jPanel1.add(imprimeremployes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 190, 150, 50));

        imprimer.setBackground(new java.awt.Color(255, 255, 204));
        imprimer.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        imprimer.setForeground(new java.awt.Color(153, 0, 0));
        imprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/imprimer.png"))); // NOI18N
        imprimer.setText("Imprimer");
        imprimer.setToolTipText("");
        imprimer.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 102, 0)));
        imprimer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imprimer.setOpaque(true);
        imprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imprimerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imprimerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imprimerMouseExited(evt);
            }
        });
        jPanel1.add(imprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 520, 150, 50));

        ajouterfiche.setBackground(new java.awt.Color(102, 102, 0));
        ajouterfiche.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        ajouterfiche.setForeground(new java.awt.Color(0, 255, 102));
        ajouterfiche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/add.png"))); // NOI18N
        ajouterfiche.setText("Ajouter");
        ajouterfiche.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 51, 0)));
        ajouterfiche.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ajouterfiche.setOpaque(true);
        ajouterfiche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajouterficheMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ajouterficheMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ajouterficheMouseExited(evt);
            }
        });
        jPanel1.add(ajouterfiche, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 430, 150, 50));

        ajouteremploye.setBackground(new java.awt.Color(102, 102, 0));
        ajouteremploye.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        ajouteremploye.setForeground(new java.awt.Color(0, 255, 102));
        ajouteremploye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/add.png"))); // NOI18N
        ajouteremploye.setText("Ajouter");
        ajouteremploye.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 51, 0)));
        ajouteremploye.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ajouteremploye.setOpaque(true);
        ajouteremploye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajouteremployeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ajouteremployeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ajouteremployeMouseExited(evt);
            }
        });
        jPanel1.add(ajouteremploye, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 100, 150, 50));

        jLabel4.setFont(new java.awt.Font("Stabillo Medium", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 0));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 900, 30));

        jLabel2.setFont(new java.awt.Font("Stabillo Medium", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 0));
        jLabel2.setText("Tous les employés");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 30));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 1230, 40));

        jTabbedPane1.addTab("Employes", jPanel1);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkerror4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                checkerror4KeyReleased(evt);
            }
        });
        jPanel3.add(checkerror4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 260, 30, 30));

        checkerror3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                checkerror3KeyReleased(evt);
            }
        });
        jPanel3.add(checkerror3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 190, 30, 30));

        jLabel5.setFont(new java.awt.Font("Stabillo Medium", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 0));
        jLabel5.setText("Changer le mot de passe");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, -1));

        jLabel9.setFont(new java.awt.Font("Kurri Island Caps Italics", 1, 24)); // NOI18N
        jLabel9.setText("Email:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 80, -1));

        email.setFont(new java.awt.Font("Source Sans Pro", 0, 24)); // NOI18N
        email.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 85, 76)));
        email.setEnabled(false);
        email.setText(cnx.email);
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailKeyTyped(evt);
            }
        });
        jPanel3.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 330, -1));

        fonction.setFont(new java.awt.Font("Source Sans Pro", 0, 24)); // NOI18N
        fonction.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 85, 76)));
        fonction.setEnabled(false);
        fonction.setText(cnx.fonction);
        fonction.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fonctionFocusLost(evt);
            }
        });
        fonction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fonctionActionPerformed(evt);
            }
        });
        fonction.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fonctionKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fonctionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fonctionKeyTyped(evt);
            }
        });
        jPanel3.add(fonction, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 240, -1));

        nom.setFont(new java.awt.Font("Source Sans Pro", 0, 24)); // NOI18N
        nom.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 85, 76)));
        nom.setText(cnx.nom);
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
        jPanel3.add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 204, -1));

        prenom.setFont(new java.awt.Font("Source Sans Pro", 0, 24)); // NOI18N
        prenom.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 85, 76)));
        prenom.setText(cnx.prenom);
        prenom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                prenomFocusLost(evt);
            }
        });
        prenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenomActionPerformed(evt);
            }
        });
        prenom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                prenomKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                prenomKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                prenomKeyTyped(evt);
            }
        });
        jPanel3.add(prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 204, -1));

        jLabel10.setFont(new java.awt.Font("Kurri Island Caps Italics", 1, 24)); // NOI18N
        jLabel10.setText("Confirmer le nouveau mot de passe:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 390, -1));

        jLabel11.setFont(new java.awt.Font("Kurri Island Caps Italics", 1, 24)); // NOI18N
        jLabel11.setText("Prénom:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, -1));

        jRadioButtonfemme.setBackground(new java.awt.Color(255, 255, 255));
        Genre2.add(jRadioButtonfemme);
        jRadioButtonfemme.setFont(new java.awt.Font("Source Sans Pro", 0, 24)); // NOI18N
        jRadioButtonfemme.setText("Femme");
        if (cnx.genre.equals("Femme"))
        jRadioButtonfemme.setSelected(true);
        jRadioButtonfemme.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 85, 76)));
        jRadioButtonfemme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonfemme.setFocusPainted(false);
        jRadioButtonfemme.setOpaque(false);
        jRadioButtonfemme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonfemmeActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButtonfemme, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 120, 30));

        jRadioButtonhomme.setBackground(new java.awt.Color(255, 255, 255));
        Genre2.add(jRadioButtonhomme);
        jRadioButtonhomme.setFont(new java.awt.Font("Source Sans Pro", 0, 24)); // NOI18N
        jRadioButtonhomme.setText("Homme");
        if (cnx.genre.equals("Homme"))
        jRadioButtonhomme.setSelected(true);
        jRadioButtonhomme.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 85, 76)));
        jRadioButtonhomme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonhomme.setFocusPainted(false);
        jRadioButtonhomme.setOpaque(false);
        jRadioButtonhomme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonhommeActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButtonhomme, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 120, 30));

        jLabel12.setFont(new java.awt.Font("Kurri Island Caps Italics", 1, 24)); // NOI18N
        jLabel12.setText("Genre:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 80, -1));

        jLabel13.setFont(new java.awt.Font("Kurri Island Caps Italics", 1, 24)); // NOI18N
        jLabel13.setText("Fonction:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 110, -1));

        jLabel6.setFont(new java.awt.Font("Stabillo Medium", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 0));
        jLabel6.setText("Données du compte");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel14.setFont(new java.awt.Font("Kurri Island Caps Italics", 1, 24)); // NOI18N
        jLabel14.setText("Nom:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 120, 60, -1));

        jLabel15.setFont(new java.awt.Font("Kurri Island Caps Italics", 1, 24)); // NOI18N
        jLabel15.setText("Mot de passe actuel:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 230, -1));

        jLabel16.setFont(new java.awt.Font("Kurri Island Caps Italics", 1, 24)); // NOI18N
        jLabel16.setText("Nouveau mot de passe:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 190, 250, -1));

        jPasswordFieldConfirm.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPasswordFieldConfirm.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 85, 76)));
        jPasswordFieldConfirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordFieldConfirmKeyReleased(evt);
            }
        });
        jPanel3.add(jPasswordFieldConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 260, 240, -1));

        jPasswordFieldNouveau.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPasswordFieldNouveau.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 85, 76)));
        jPasswordFieldNouveau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordFieldNouveauKeyReleased(evt);
            }
        });
        jPanel3.add(jPasswordFieldNouveau, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 190, 240, -1));

        jPasswordFieldActuel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPasswordFieldActuel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 85, 76)));
        jPanel3.add(jPasswordFieldActuel, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 120, 240, -1));

        enregistrer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/boutonenregistrer2.png"))); // NOI18N
        enregistrer1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enregistrer1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enregistrer1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enregistrer1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enregistrer1MouseExited(evt);
            }
        });
        jPanel3.add(enregistrer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, 240, 60));

        enregistrer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/boutonenregistrer2.png"))); // NOI18N
        enregistrer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enregistrer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enregistrerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enregistrerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enregistrerMouseExited(evt);
            }
        });
        jPanel3.add(enregistrer, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 240, 60));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 100, 650));

        jTabbedPane1.addTab("Parametres", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 1230, 700));
        jTabbedPane1.getAccessibleContext().setAccessibleName("");

        jLabel3.setBackground(new java.awt.Color(51, 0, 51));
        jLabel3.setFont(new java.awt.Font("Source Sans Pro Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/logout1.png"))); // NOI18N
        jLabel3.setText("Se déconnecter");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 70, 240, 50));

        jLabelbanner.setFont(new java.awt.Font("Stabillo Medium", 1, 36)); // NOI18N
        jLabelbanner.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(jLabelbanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 420, 50));

        jLabelbanner1.setFont(new java.awt.Font("Stabillo Medium", 1, 36)); // NOI18N
        jLabelbanner1.setForeground(new java.awt.Color(255, 255, 0));
        jLabelbanner1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelbanner1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabelbanner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 580, 50));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/background4.jpg"))); // NOI18N
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1290, 800));

        getAccessibleContext().setAccessibleDescription("");

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

    private void MouseDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseDragMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y- yMouse);
    }//GEN-LAST:event_MouseDragMouseDragged

    private void MouseDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseDragMousePressed
        xMouse= evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_MouseDragMousePressed

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setBackground(new java.awt.Color(51, 0, 51));

    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setBackground(new java.awt.Color(219, 125, 169));

    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Accueil acc = new Accueil();
        this.setVisible(false);
        bdemployes.clear();
        bdretards.clear();
        acc.setVisible(true);       
        acc.pack();
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void enregistrerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enregistrerMouseExited
        enregistrer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/boutonenregistrer2.png")));
    }//GEN-LAST:event_enregistrerMouseExited

    private void enregistrerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enregistrerMouseEntered
        enregistrer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/boutonenregistrer.png")));
    }//GEN-LAST:event_enregistrerMouseEntered

    private void enregistrerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enregistrerMouseClicked

        if (validnom(nom.getText())&&validnom(prenom.getText())&&(jRadioButtonhomme.isSelected()||jRadioButtonfemme.isSelected()))
        {
            try {
                changercnx();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(NavigateurAgent.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(NavigateurAgent.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane pane = new JOptionPane("Compte modifié avec succès !");
            JDialog d = pane.createDialog(jPanel3, "SUCCES");
            d.setLocationRelativeTo(jPanel3);
            d.setVisible(true);
        }
        else
        {
            JOptionPane pane = new JOptionPane("Vérifier tous les champs !");
            JDialog d = pane.createDialog(jPanel3, "Erreur");
            d.setLocationRelativeTo(jPanel3);
            d.setVisible(true);
        }
    }//GEN-LAST:event_enregistrerMouseClicked

    private void enregistrer1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enregistrer1MouseExited
        enregistrer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/boutonenregistrer2.png")));
    }//GEN-LAST:event_enregistrer1MouseExited

    private void enregistrer1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enregistrer1MouseEntered
        enregistrer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/boutonenregistrer.png")));
    }//GEN-LAST:event_enregistrer1MouseEntered

    private void enregistrer1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enregistrer1MouseClicked
        if (cnx.mdp.equals(String.valueOf(jPasswordFieldActuel.getPassword()))&&validmdp(String.valueOf(jPasswordFieldNouveau.getPassword()))&&String.valueOf(jPasswordFieldNouveau.getPassword()).equals(String.valueOf(jPasswordFieldConfirm.getPassword())))
        {
            try {
                changermdp();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(NavigateurAgent.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(NavigateurAgent.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane pane = new JOptionPane("Mot de passe modifié avec succès !");
            JDialog d = pane.createDialog(jPanel3, "SUCCES");
            d.setLocationRelativeTo(jPanel3);
            d.setVisible(true);
        }
        else
        if(!cnx.mdp.equals(String.valueOf(jPasswordFieldActuel.getPassword())))
        {
            JOptionPane pane = new JOptionPane("Le mot de passe actuel est incorrect !");
            JDialog d = pane.createDialog(jPanel3, "Erreur");
            d.setLocationRelativeTo(jPanel3);
            d.setVisible(true);
        }
        else
        if(!String.valueOf(jPasswordFieldNouveau.getPassword()).equals(String.valueOf(jPasswordFieldConfirm.getPassword())))
        {
            JOptionPane pane = new JOptionPane("Vérifier que le champ nouveau mot de passe et le champ confirmer le nouveau mot de passe sont identiques !");
            JDialog d = pane.createDialog(jPanel3, "Erreur");
            d.setLocationRelativeTo(jPanel3);
            d.setVisible(true);
        }
        else
        {
            JOptionPane pane = new JOptionPane("Vérifier tous les champs !");
            JDialog d = pane.createDialog(jPanel3, "Erreur");
            d.setLocationRelativeTo(jPanel3);
            d.setVisible(true);
        }
    }//GEN-LAST:event_enregistrer1MouseClicked

    private void jPasswordFieldNouveauKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldNouveauKeyReleased
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
    }//GEN-LAST:event_jPasswordFieldNouveauKeyReleased

    private void jPasswordFieldConfirmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldConfirmKeyReleased
        JTextField src = (JTextField)evt.getSource();
        String mdptxt=src.getText();
        ImageIcon icon = new ImageIcon(getClass().getResource("/houssem/sakli/Icons/error1.png"));
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/houssem/sakli/Icons/valid1.png"));
        if (mdptxt.equals(String.valueOf(jPasswordFieldNouveau.getPassword())))
        {
            checkerror4.setIcon(icon2);
            checkerror4.setToolTipText(null);
        }
        else
        {
            checkerror4.setIcon(icon);
            checkerror4.setToolTipText("Les deux mots de passe ne sont pas identiques !");
        }
    }//GEN-LAST:event_jPasswordFieldConfirmKeyReleased

    private void jRadioButtonhommeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonhommeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonhommeActionPerformed

    private void jRadioButtonfemmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonfemmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonfemmeActionPerformed

    private void prenomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prenomKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomKeyTyped

    private void prenomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prenomKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomKeyReleased

    private void prenomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prenomKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomKeyPressed

    private void prenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomActionPerformed

    private void prenomFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_prenomFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomFocusLost

    private void nomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_nomKeyTyped

    private void nomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_nomKeyReleased

    private void nomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomKeyPressed

    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomActionPerformed

    private void nomFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_nomFocusLost

    private void fonctionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fonctionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_fonctionKeyTyped

    private void fonctionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fonctionKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_fonctionKeyReleased

    private void fonctionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fonctionKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_fonctionKeyPressed

    private void fonctionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fonctionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fonctionActionPerformed

    private void fonctionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fonctionFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_fonctionFocusLost

    private void emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_emailKeyTyped

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_emailKeyReleased

    private void emailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailKeyPressed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFocusLost

    private void checkerror3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkerror3KeyReleased

    }//GEN-LAST:event_checkerror3KeyReleased

    private void checkerror4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkerror4KeyReleased

    }//GEN-LAST:event_checkerror4KeyReleased

    private void ajouteremployeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouteremployeMouseExited
        ajouteremploye.setBackground(new java.awt.Color(102, 102, 0));
        ajouteremploye.setForeground(new java.awt.Color(0, 255, 102));
    }//GEN-LAST:event_ajouteremployeMouseExited

    private void ajouteremployeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouteremployeMouseEntered
        ajouteremploye.setBackground(new java.awt.Color(84, 255, 221));
        ajouteremploye.setForeground(new java.awt.Color(13, 92, 40));
    }//GEN-LAST:event_ajouteremployeMouseEntered

    private void ajouteremployeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouteremployeMouseClicked
        if (cnx.nomentreprise==null)
        {
            JOptionPane pane = new JOptionPane("Vous ne pouvez pas ajouter des employés car vous n'êtes pas associé à une entreprise !");
            JDialog d = pane.createDialog(jPanel1, "ERREUR");
            d.setLocationRelativeTo(jPanel1);
            d.setVisible(true);
        }
        else
        {
            AjoutEmployeA nv = new AjoutEmployeA(this);
            this.setEnabled(false);
            nv.setVisible(true);
            nv.pack();
        }
    }//GEN-LAST:event_ajouteremployeMouseClicked

    private void ajouterficheMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterficheMouseExited
        ajouterfiche.setBackground(new java.awt.Color(102, 102, 0));
        ajouterfiche.setForeground(new java.awt.Color(0, 255, 102));
    }//GEN-LAST:event_ajouterficheMouseExited

    private void ajouterficheMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterficheMouseEntered
        ajouterfiche.setBackground(new java.awt.Color(84, 255, 221));
        ajouterfiche.setForeground(new java.awt.Color(13, 92, 40));
    }//GEN-LAST:event_ajouterficheMouseEntered

    private void ajouterficheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterficheMouseClicked
        if (jTable8.getSelectedRow()==-1)
        {
            JOptionPane pane = new JOptionPane("Sélectionner un employé tout d'abord !");
            JDialog d = pane.createDialog(jPanel1, "ERREUR");
            d.setLocationRelativeTo(jPanel1);
            d.setVisible(true);
        }
        else
        {
            AjoutRetardA nr = new AjoutRetardA(this);
            this.setEnabled(false);
            nr.setVisible(true);
            nr.pack();
        }
    }//GEN-LAST:event_ajouterficheMouseClicked

    private void jTable8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable8MouseClicked

        int j;
        int index2=jTable8.getSelectedRow();
        String value2=(String) jTable8.getModel().getValueAt(index2, 0);
        for (j=0;j<bdemployes.size();j++)
        if (bdemployes.get(j).mat.equals(value2))
        jLabel4.setText("Les absences et les retards de "+bdemployes.get(j).prenom+" "+bdemployes.get(j).nom);

        affichetableretards();
    }//GEN-LAST:event_jTable8MouseClicked

    private void imprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imprimerMouseClicked
        int j;
        int index2=jTable8.getSelectedRow();
        
        Employes emp=null;
        if (index2!=-1)
        {
            String value2=(String) jTable8.getModel().getValueAt(index2, 0);
            for (j=0;j<bdemployes.size();j++)
            if (bdemployes.get(j).mat.equals(value2))
            emp=bdemployes.get(j);
            MessageFormat header = new MessageFormat("Tableau des Absences et retards de "+emp.prenom+" "+emp.nom+":");
            MessageFormat footer = new MessageFormat("Page{0,number,integer}");
            try {
                jTable9.print(JTable.PrintMode.FIT_WIDTH, header, footer);

            } catch (java.awt.print.PrinterException e) {
                JOptionPane pane = new JOptionPane("Erreur d'impression !");
                JDialog d = pane.createDialog(jPanel1, "ERREUR");
                d.setLocationRelativeTo(jPanel1);
                d.setVisible(true);
            }
        }
        else
        {
                JOptionPane pane = new JOptionPane("Sélectionner un employé tout d'abord !");
                JDialog d = pane.createDialog(jPanel1, "ERREUR");
                d.setLocationRelativeTo(jPanel1);
                d.setVisible(true);
        }
    }//GEN-LAST:event_imprimerMouseClicked

    private void imprimerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imprimerMouseEntered
        imprimer.setBackground(new java.awt.Color(148, 148, 53));
        imprimer.setForeground(new java.awt.Color(79, 50, 5));
    }//GEN-LAST:event_imprimerMouseEntered

    private void imprimerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imprimerMouseExited
        imprimer.setBackground(new java.awt.Color(255, 255, 204));
        imprimer.setForeground(new java.awt.Color(153, 0, 0));
    }//GEN-LAST:event_imprimerMouseExited

    private void imprimeremployesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imprimeremployesMouseClicked

            MessageFormat header = new MessageFormat("Tableau des Employés dans l''entreprise "+cnx.nomentreprise+":");
            MessageFormat footer = new MessageFormat("Page{0,number,integer}");
            try {
                jTable8.print(JTable.PrintMode.FIT_WIDTH, header, footer);

            } catch (java.awt.print.PrinterException e) {
                JOptionPane pane = new JOptionPane("Erreur d'impression !");
                JDialog d = pane.createDialog(jPanel1, "ERREUR");
                d.setLocationRelativeTo(jPanel1);
                d.setVisible(true);
            }
    }//GEN-LAST:event_imprimeremployesMouseClicked

    private void imprimeremployesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imprimeremployesMouseEntered
        imprimeremployes.setBackground(new java.awt.Color(148, 148, 53));
        imprimeremployes.setForeground(new java.awt.Color(79, 50, 5));
    }//GEN-LAST:event_imprimeremployesMouseEntered

    private void imprimeremployesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imprimeremployesMouseExited
        imprimeremployes.setBackground(new java.awt.Color(255, 255, 204));
        imprimeremployes.setForeground(new java.awt.Color(153, 0, 0));
    }//GEN-LAST:event_imprimeremployesMouseExited

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
            java.util.logging.Logger.getLogger(NavigateurAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NavigateurAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NavigateurAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NavigateurAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {              
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch(Exception ignored){                  } //Take composents of windows not java
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NavigateurAgent().setVisible(true);
                
            }
            
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Fonction;
    private javax.swing.ButtonGroup Genre;
    private javax.swing.ButtonGroup Genre2;
    private javax.swing.JLabel MouseDrag;
    private javax.swing.JLabel ajouteremploye;
    private javax.swing.JLabel ajouterfiche;
    private javax.swing.JLabel checkerror3;
    private javax.swing.JLabel checkerror4;
    private javax.swing.JTextField email;
    private javax.swing.JLabel enregistrer;
    private javax.swing.JLabel enregistrer1;
    private javax.swing.JTextField fonction;
    private javax.swing.JLabel imprimer;
    private javax.swing.JLabel imprimeremployes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JLabel jLabelbanner;
    private javax.swing.JLabel jLabelbanner1;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordFieldActuel;
    private javax.swing.JPasswordField jPasswordFieldConfirm;
    private javax.swing.JPasswordField jPasswordFieldNouveau;
    private javax.swing.JRadioButton jRadioButtonfemme;
    private javax.swing.JRadioButton jRadioButtonhomme;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JTable jTable8;
    public static javax.swing.JTable jTable9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField prenom;
    // End of variables declaration//GEN-END:variables
}
