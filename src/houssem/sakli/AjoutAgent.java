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
import static houssem.sakli.Navigateur.bdretards;
import static houssem.sakli.Navigateur.jTable1;
import static houssem.sakli.Navigateur.jTable2;
import static houssem.sakli.Test.c;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import static java.lang.Math.random;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.sql.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
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
import static houssem.sakli.Accueil.bdcomptes;
import static houssem.sakli.Navigateur.jTable5;

/**
 *
 * @author sakli
 */
public class AjoutAgent extends javax.swing.JFrame {

    Connection c = null;
    PreparedStatement stmt = null;
    ResultSet res=null;
    int xMouse;
    int yMouse;
    Navigateur nn;
    public AjoutAgent(Navigateur n){
        nn=n;
        initComponents();
        seticon();
        this.setLocationRelativeTo(null); //pour centrer lapp
        
    }
    
    private boolean validemail(String x)
    {
        if (x.contains("@")&&x.contains(".")&&x.length()>=8)
            return true;
        return false;
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

    }
    
        public void ajoutagent() throws SQLException, ClassNotFoundException
    {   
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/projetjava";
        c = DriverManager.getConnection(url,"root","xpass121");
        
        String emailc=email.getText();
        String requete = "UPDATE comptesinscrits SET nomentreprise='"+cnx.nomentreprise+"' WHERE email='"+emailc+"'";
        stmt = c.prepareStatement(requete);
        stmt.execute();
        bdcomptes.clear();
        sauvegardecomptes();
        int i,n=0;
        for (i=0;i<bdcomptes.size();i++)
        {
            if (emailc.equals(bdcomptes.get(i).email))
                n=i;
        }
        DefaultTableModel model5 = (DefaultTableModel) jTable5.getModel();
        model5.addRow(new Object[]{emailc,bdcomptes.get(n).nom,bdcomptes.get(n).prenom});
        
    }
        
    private void seticon(){

     setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/houssem/sakli/Icons/Fasttracker.png")));
    
    }

    
                           

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        type = new javax.swing.ButtonGroup();
        justificatif = new javax.swing.ButtonGroup();
        autorise = new javax.swing.ButtonGroup();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMinimize = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        MouseDrag = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        checkerror1 = new javax.swing.JLabel();
        annuler = new javax.swing.JLabel();
        ajouter = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
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

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ajout Agent");
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
        jPanel3.add(checkerror1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 30, 30));

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
        jPanel3.add(annuler, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 190, 70));

        ajouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/boutonajout2.png"))); // NOI18N
        ajouter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ajouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajouterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ajouterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ajouterMouseExited(evt);
            }
        });
        jPanel3.add(ajouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 190, 70));

        jLabel13.setFont(new java.awt.Font("Kurri Island Caps Italics", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Email d'agent:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 160, -1));

        email.setFont(new java.awt.Font("Source Sans Pro", 0, 24)); // NOI18N
        email.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 85, 76)));
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
        jPanel3.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 370, 35));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 420, 280));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/background2.jpg"))); // NOI18N
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 420, 270));

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

    private void annulerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annulerMouseClicked
        nn.setEnabled(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_annulerMouseClicked

    private void ajouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterMouseClicked
        try {
            int i;
            Comptes cp=null;
            for (i=0;i<bdcomptes.size();i++)
            {
                if (email.getText().equals(bdcomptes.get(i).email))
                    cp=bdcomptes.get(i);
            }
            if(emailexist(email.getText())&&cp.fonction.equals("Agent du service")&&cp.nomentreprise==null&&validemail(email.getText()))
            {
                ajoutagent();
                JOptionPane pane = new JOptionPane("Agent ajouté avec succès !");
                JDialog d = pane.createDialog(jPanel3, "SUCCES");
                d.setLocationRelativeTo(jPanel3);
                d.setVisible(true);
                nn.setEnabled(true);
                this.setVisible(false);
            
            }
            else
                if (!emailexist(email.getText()))
                {        
                    JOptionPane pane = new JOptionPane("Aucun compte est associé avec cet email !");
                    JDialog d = pane.createDialog(jPanel3, "ERREUR");
                    d.setLocationRelativeTo(jPanel3);
                    d.setVisible(true);
                }
                else
                    if(cp.nomentreprise!=null)
                    {
                        JOptionPane pane = new JOptionPane("Cet email est déja associé avec une entreprise !");
                        JDialog d = pane.createDialog(jPanel3, "ERREUR");
                        d.setLocationRelativeTo(jPanel3);
                        d.setVisible(true);
                    }
                    else
                    {
                        JOptionPane pane = new JOptionPane("Vérifier l'adresse email saisie !");
                        JDialog d = pane.createDialog(jPanel3, "ERREUR");
                        d.setLocationRelativeTo(jPanel3);
                        d.setVisible(true);
                    }
        } catch (SQLException ex) {
            Logger.getLogger(AjoutAgent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AjoutAgent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ajouterMouseClicked

    private void ajouterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterMouseEntered
        ajouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/boutonajout3.png")));
    }//GEN-LAST:event_ajouterMouseEntered

    private void ajouterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterMouseExited
        ajouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/boutonajout2.png")));
    }//GEN-LAST:event_ajouterMouseExited

    private void annulerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annulerMouseEntered
        annuler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/boutonannuler2.png")));
    }//GEN-LAST:event_annulerMouseEntered

    private void annulerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annulerMouseExited
        annuler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/boutonannuler.png")));
    }//GEN-LAST:event_annulerMouseExited

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost

    }//GEN-LAST:event_emailFocusLost

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void emailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyPressed

    }//GEN-LAST:event_emailKeyPressed

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased
        JTextField src = (JTextField)evt.getSource();
        String emailtxt=src.getText();
        ImageIcon icon = new ImageIcon(getClass().getResource("/houssem/sakli/Icons/error1.png"));
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/houssem/sakli/Icons/valid1.png"));
        int i;
        for (i=0;i<emailtxt.length();i++)
        {
            if(!(emailtxt.contains("@")&&emailtxt.contains(".")&&emailtxt.length()>=8))
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
    }//GEN-LAST:event_emailKeyReleased

    private void emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyTyped

    }//GEN-LAST:event_emailKeyTyped

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
            java.util.logging.Logger.getLogger(AjoutAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {              
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch(Exception ignored){                  } //Take composents of windows not java
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
               // new AjoutEmploye().setVisible(true);
                
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MouseDrag;
    private javax.swing.JLabel ajouter;
    private javax.swing.JLabel annuler;
    private javax.swing.ButtonGroup autorise;
    private javax.swing.JLabel checkerror1;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JPanel jPanel3;
    private javax.swing.ButtonGroup justificatif;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.ButtonGroup type;
    // End of variables declaration//GEN-END:variables
}
