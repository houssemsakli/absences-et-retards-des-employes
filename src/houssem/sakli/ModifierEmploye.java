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
import static houssem.sakli.Accueil.cnx;
import static houssem.sakli.Navigateur.bdemployes;
import static houssem.sakli.Navigateur.jTable1;
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
import javax.swing.table.DefaultTableModel;
import static jdk.nashorn.internal.objects.ArrayBufferView.length;
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
public class ModifierEmploye extends javax.swing.JFrame {

    Connection c = null;
    PreparedStatement stmt = null;
    ResultSet res=null;
    int xMouse;
    int yMouse;
    Navigateur nn;
    public ModifierEmploye(Navigateur n){
        nn=n;
        initComponents();
        seticon();
        this.setLocationRelativeTo(null); //pour centrer lapp
      
    }
    
        public void modifemployes() throws SQLException, ClassNotFoundException
    {   
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/projetjava";
        c = DriverManager.getConnection(url,"root","xpass121");
        
        int index=jTable1.getSelectedRow();
        String value=(String) jTable1.getModel().getValueAt(index, 0);
        String nomc=nom.getText();
        String prenomc=prenom.getText();
        String matc=matricule.getText();
        String nomentc=cnx.nomentreprise;
        String servicec=(String) jComboBoxService.getSelectedItem();
        String requete = "UPDATE employes SET mat='"+matc+"', nom='"+nomc+"', prenom='"+prenomc+"', service='"+servicec+"' WHERE mat='"+value+"'";
        stmt = c.prepareStatement(requete);
        stmt.execute();
        Employes em=new Employes(matc,nomc,prenomc,nomentc,servicec);
        int i;
        for(i=0;i<bdemployes.size();i++)
        {
            if (bdemployes.get(i).mat.equals(value))
                bdemployes.set(index, em);
        }
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setValueAt(matc, index, 0);
        model.setValueAt(nomc, index, 1);
        model.setValueAt(prenomc, index, 2);
        model.setValueAt(servicec, index, 3);
        
      
    }
        
    private void seticon(){

     setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/houssem/sakli/Icons/Fasttracker.png")));
    
    }

    
        
    public boolean matriculeexist(String x) throws SQLException, ClassNotFoundException
    {
        
        int i;
        for(i=0;i<bdemployes.size();i++)
        {
            if (bdemployes.get(i).mat.equals(x))
                return true;
        }
        return false;
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
    
    private boolean validmatricule(String x)
    {
        int i;
        if (x.length()<=6)
            return false;
        for (i=0;i<x.length();i++)
        {
            if(!(Character.isDigit(x.charAt(i))||(x.charAt(i)==KeyEvent.VK_BACK_SPACE)||x.charAt(i)==KeyEvent.VK_DELETE))
                return false;
        }
        
        return true;
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
        jLabel1 = new javax.swing.JLabel();
        MouseDrag = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        checkerror2 = new javax.swing.JLabel();
        checkerror1 = new javax.swing.JLabel();
        checkerror = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        entreprise = new javax.swing.JTextField();
        matricule = new javax.swing.JTextField();
        prenom = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxService = new javax.swing.JComboBox<>();
        annuler = new javax.swing.JLabel();
        modifier = new javax.swing.JLabel();
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
        kGradientPanel1.add(jLabelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 8, -1, -1));

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
        kGradientPanel1.add(jLabelMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 8, -1, -1));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modification Employé");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 320, 40));

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
        kGradientPanel1.add(MouseDrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 60));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 60));

        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(checkerror2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 35, 35));
        jPanel3.add(checkerror1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 35, 35));
        jPanel3.add(checkerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 35, 35));

        jLabel12.setFont(new java.awt.Font("Kurri Island Caps Italics", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Service:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 90, -1));

        jLabel9.setFont(new java.awt.Font("Kurri Island Caps Italics", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Matricule:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel13.setFont(new java.awt.Font("Kurri Island Caps Italics", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Entreprise:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        entreprise.setFont(new java.awt.Font("Source Sans Pro", 0, 24)); // NOI18N
        entreprise.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 85, 76)));
        entreprise.setEnabled(false);
        entreprise.setText(cnx.nomentreprise);
        entreprise.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                entrepriseFocusLost(evt);
            }
        });
        entreprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrepriseActionPerformed(evt);
            }
        });
        entreprise.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                entrepriseKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                entrepriseKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                entrepriseKeyTyped(evt);
            }
        });
        jPanel3.add(entreprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 220, 35));

        matricule.setFont(new java.awt.Font("Source Sans Pro", 0, 24)); // NOI18N
        matricule.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 85, 76)));
        int index2=jTable1.getSelectedRow();
        String valuemat=(String) jTable1.getModel().getValueAt(index2, 0);
        matricule.setText(valuemat);
        matricule.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                matriculeFocusLost(evt);
            }
        });
        matricule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriculeActionPerformed(evt);
            }
        });
        matricule.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                matriculeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                matriculeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                matriculeKeyTyped(evt);
            }
        });
        jPanel3.add(matricule, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 220, 35));

        prenom.setFont(new java.awt.Font("Source Sans Pro", 0, 24)); // NOI18N
        prenom.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 85, 76)));
        int index1=jTable1.getSelectedRow();
        String valueprenom=(String) jTable1.getModel().getValueAt(index1, 2);
        prenom.setText(valueprenom);
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
        jPanel3.add(prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 220, 35));

        nom.setFont(new java.awt.Font("Source Sans Pro", 0, 24)); // NOI18N
        nom.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 85, 76)));
        int index=jTable1.getSelectedRow();
        String valuenom=(String) jTable1.getModel().getValueAt(index, 1);
        nom.setText(valuenom);
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
        jPanel3.add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 220, 35));

        jLabel11.setFont(new java.awt.Font("Kurri Island Caps Italics", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Prenom:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 90, -1));

        jLabel10.setFont(new java.awt.Font("Kurri Island Caps Italics", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nom:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jComboBoxService.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        jComboBoxService.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sélectionner", "Production", "Achats et Approvisionnement", "Marketing", "Administratif", "Financier", "Ressources humaines", "Qualité", "Logistique", "Recherche et Développement", "Planification et ordonnancement", "Maintenance", "Stock" }));
        int index3=jTable1.getSelectedRow();
        String valueservice=(String) jTable1.getModel().getValueAt(index3, 3);
        int k,indexitem=0,taillecombo=jComboBoxService.getItemCount();
        for(k=0;k<taillecombo;k++)
        {
            if (valueservice.equals(jComboBoxService.getItemAt(k)))
            indexitem=k;
        }
        jComboBoxService.setSelectedIndex(indexitem);
        jComboBoxService.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 85, 76)));
        jPanel3.add(jComboBoxService, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 352, 220, 35));

        annuler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/boutonannuler.png"))); // NOI18N
        annuler.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        annuler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                annulerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                annulerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                annulerMouseExited(evt);
            }
        });
        jPanel3.add(annuler, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 190, 70));

        modifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/boutonmodifier.png"))); // NOI18N
        modifier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifierMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modifierMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modifierMouseExited(evt);
            }
        });
        jPanel3.add(modifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 190, 70));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 420, 570));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/background2.jpg"))); // NOI18N
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 420, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        nn.setEnabled(true);
        this.setVisible(false);
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

    private void nomFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomFocusLost

    }//GEN-LAST:event_nomFocusLost

    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomActionPerformed

    private void nomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomKeyPressed

    }//GEN-LAST:event_nomKeyPressed

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

    private void nomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomKeyTyped

    }//GEN-LAST:event_nomKeyTyped

    private void prenomFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_prenomFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomFocusLost

    private void prenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomActionPerformed

    private void prenomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prenomKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomKeyPressed

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

    private void prenomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prenomKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomKeyTyped

    private void matriculeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_matriculeFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_matriculeFocusLost

    private void matriculeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriculeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matriculeActionPerformed

    private void matriculeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_matriculeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_matriculeKeyPressed

    private void matriculeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_matriculeKeyReleased
        JTextField src = (JTextField)evt.getSource();
        String mattxt=src.getText();
        ImageIcon icon = new ImageIcon(getClass().getResource("/houssem/sakli/Icons/error1.png"));
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/houssem/sakli/Icons/valid1.png"));
        if (validmatricule(mattxt))
        {
                checkerror2.setIcon(icon2);
                checkerror2.setToolTipText(null);
        }
        else
        {
            checkerror2.setIcon(icon);
            checkerror2.setToolTipText("Matricule non valide !");
        }
    }//GEN-LAST:event_matriculeKeyReleased

    private void matriculeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_matriculeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_matriculeKeyTyped

    private void entrepriseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entrepriseFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_entrepriseFocusLost

    private void entrepriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrepriseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entrepriseActionPerformed

    private void entrepriseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entrepriseKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_entrepriseKeyPressed

    private void entrepriseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entrepriseKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_entrepriseKeyReleased

    private void entrepriseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entrepriseKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_entrepriseKeyTyped

    private void annulerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annulerMouseClicked
        nn.setEnabled(true);
        this.setVisible(false);
    }//GEN-LAST:event_annulerMouseClicked

    private void modifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifierMouseClicked
        try {
            int index=jTable1.getSelectedRow();
            String value=(String) jTable1.getModel().getValueAt(index, 0);
            if((matriculeexist(matricule.getText())==false||value.equals(matricule.getText()))&&validnom(nom.getText())&&validnom(prenom.getText())&&validmatricule(matricule.getText())&&(!"Sélectionner".equals((String) jComboBoxService.getSelectedItem())))
            {
                modifemployes();
                JOptionPane pane = new JOptionPane("Employé modifié avec succès !");
                JDialog d = pane.createDialog(jPanel3, "SUCCES");
                d.setLocationRelativeTo(jPanel3);
                d.setVisible(true);
                nn.setEnabled(true);
                this.setVisible(false);
            
            }
            else
                if (matriculeexist(matricule.getText())==true)
                {
                    JOptionPane pane = new JOptionPane("Un employé avec cette matricule existe déja !");
                    JDialog d = pane.createDialog(jPanel3, "ERREUR");
                    d.setLocationRelativeTo(jPanel3);
                    d.setVisible(true);
                }
                else
                {
                    JOptionPane pane = new JOptionPane("Vérifier tous les champs !");
                    JDialog d = pane.createDialog(jPanel3, "ERREUR");
                    d.setLocationRelativeTo(jPanel3);
                    d.setVisible(true);
                }
        } catch (SQLException ex) {
            Logger.getLogger(ModifierEmploye.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ModifierEmploye.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_modifierMouseClicked

    private void modifierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifierMouseEntered
        modifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/boutonmodifier2.png")));
    }//GEN-LAST:event_modifierMouseEntered

    private void modifierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifierMouseExited
        modifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/boutonmodifier.png")));
    }//GEN-LAST:event_modifierMouseExited

    private void annulerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annulerMouseEntered
        annuler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/boutonannuler2.png")));
    }//GEN-LAST:event_annulerMouseEntered

    private void annulerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annulerMouseExited
        annuler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/boutonannuler.png")));
    }//GEN-LAST:event_annulerMouseExited

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
            java.util.logging.Logger.getLogger(ModifierEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifierEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifierEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifierEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {              
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch(Exception ignored){                  } //Take composents of windows not java
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new ModifierEmploye().setVisible(true);
                
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Fonction;
    private javax.swing.ButtonGroup Genre;
    private javax.swing.JLabel MouseDrag;
    private javax.swing.JLabel annuler;
    private javax.swing.JLabel checkerror;
    private javax.swing.JLabel checkerror1;
    private javax.swing.JLabel checkerror2;
    private javax.swing.JTextField entreprise;
    private javax.swing.JComboBox<String> jComboBoxService;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JPanel jPanel3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField matricule;
    private javax.swing.JLabel modifier;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField prenom;
    // End of variables declaration//GEN-END:variables
}
