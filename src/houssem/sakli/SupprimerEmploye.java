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
public class SupprimerEmploye extends javax.swing.JFrame {

    Connection c = null;
    PreparedStatement stmt = null;
    ResultSet res=null;
    int xMouse;
    int yMouse;
    Navigateur nn;
    public SupprimerEmploye(Navigateur n){
        nn=n;
        initComponents();
        seticon();
        this.setLocationRelativeTo(null); //pour centrer lapp
      
    }
    
    private void seticon(){

     setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/houssem/sakli/Icons/Fasttracker.png")));
    
    }
    
        public void suppressionemployes() throws SQLException, ClassNotFoundException
    {   
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/projetjava";
        c = DriverManager.getConnection(url,"root","xpass121");
        
        int index=jTable1.getSelectedRow();
        String value=(String) jTable1.getModel().getValueAt(index, 0);
        String requete = "DELETE FROM employes WHERE mat='"+value+"'";
        stmt = c.prepareStatement(requete);
        stmt.execute();
        int i;
        for(i=0;i<bdemployes.size();i++)
        {
            if (bdemployes.get(i).mat.equals(value))
                bdemployes.remove(i);
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.removeRow(index);
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
        jLabel10 = new javax.swing.JLabel();
        non = new javax.swing.JLabel();
        oui = new javax.swing.JLabel();
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
        jLabel1.setText("Suppression Employé");
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

        jLabel10.setFont(new java.awt.Font("Kurri Island Caps Italics", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Voulez vous vraimant supprimer cet employé ?");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 33, 400, 60));

        non.setBackground(new java.awt.Color(255, 51, 102));
        non.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        non.setForeground(new java.awt.Color(255, 204, 255));
        non.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        non.setText("Non");
        non.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 51, 0)));
        non.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        non.setOpaque(true);
        non.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nonMouseExited(evt);
            }
        });
        jPanel3.add(non, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 100, 40));

        oui.setBackground(new java.awt.Color(0, 153, 51));
        oui.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        oui.setForeground(new java.awt.Color(204, 255, 255));
        oui.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oui.setText("Oui");
        oui.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 102)));
        oui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        oui.setOpaque(true);
        oui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ouiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ouiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ouiMouseExited(evt);
            }
        });
        jPanel3.add(oui, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 100, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 420, 220));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houssem/sakli/Icons/background2.jpg"))); // NOI18N
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 420, 210));

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

    private void nonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nonMouseClicked
        nn.setEnabled(true);
        this.setVisible(false);
    }//GEN-LAST:event_nonMouseClicked

    private void ouiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ouiMouseClicked
        try {
            
                suppressionemployes();
                JOptionPane pane = new JOptionPane("Suppression réussie !");
                JDialog d = pane.createDialog(jPanel3, "SUCCES");
                d.setLocationRelativeTo(jPanel3);
                d.setVisible(true);
                                
            
                nn.setEnabled(true);
                this.setVisible(false);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(SupprimerEmploye.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SupprimerEmploye.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ouiMouseClicked

    private void ouiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ouiMouseEntered
        oui.setBackground(new java.awt.Color(166, 237, 181));
        oui.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(88, 166, 128)));
        oui.setForeground(new java.awt.Color(10, 74, 43));
    }//GEN-LAST:event_ouiMouseEntered

    private void ouiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ouiMouseExited
        oui.setBackground(new java.awt.Color(0, 153, 51));
        oui.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 102)));
        oui.setForeground(new java.awt.Color(204, 255, 255));
    }//GEN-LAST:event_ouiMouseExited

    private void nonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nonMouseEntered
        non.setForeground(new java.awt.Color(87, 6, 15));
        non.setBackground(new java.awt.Color(227, 129, 140));
        non.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(186, 84, 96)));
    }//GEN-LAST:event_nonMouseEntered

    private void nonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nonMouseExited
        non.setForeground(new java.awt.Color(255, 204, 255));
        non.setBackground(new java.awt.Color(255, 51, 102));
        non.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 51, 0)));
    }//GEN-LAST:event_nonMouseExited

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
            java.util.logging.Logger.getLogger(SupprimerEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SupprimerEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SupprimerEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SupprimerEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {              
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch(Exception ignored){                  } //Take composents of windows not java
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new SupprimerEmploye().setVisible(true);
                
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Fonction;
    private javax.swing.ButtonGroup Genre;
    private javax.swing.JLabel MouseDrag;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JPanel jPanel3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel non;
    private javax.swing.JLabel oui;
    // End of variables declaration//GEN-END:variables
}
