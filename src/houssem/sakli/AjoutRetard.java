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

/**
 *
 * @author sakli
 */
public class AjoutRetard extends javax.swing.JFrame {

    Connection c = null;
    PreparedStatement stmt = null;
    ResultSet res=null;
    int xMouse;
    int yMouse;
    Navigateur nn;
    public AjoutRetard(Navigateur n){
        nn=n;
        initComponents();
        seticon();
        this.setLocationRelativeTo(null); //pour centrer lapp
        
    }
    
        public void ajoutretard() throws SQLException, ClassNotFoundException
    {   
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/projetjava";
        c = DriverManager.getConnection(url,"root","xpass121");
        Random random=new Random();
        int i;
        int id= random.nextInt(89999999)+10000000;
        for(i=0;i<bdretards.size();i++)
        {    
            if (bdretards.get(i).id.equals(Integer.toString(id)))
                id= random.nextInt(89999999)+10000000;
        }  
        //System.out.println("Random="+id);
           
        String idc=Integer.toString(id);
        int index=jTable1.getSelectedRow();
        String matc=(String) jTable1.getModel().getValueAt(index, 0);
        String typec=null;
        if (jRadioButtonretard.isSelected())
            typec="Retard";
        if (jRadioButtonabsence.isSelected())
            typec="Absence";
        Calendar cal=dateChooserCombo1.getSelectedDate();
        
        java.util.Date datetest=cal.getTime();
        java.sql.Date datec=new java.sql.Date(datetest.getYear(),datetest.getMonth(),datetest.getDate());
        int heuredbt=(Integer)heuredb.getValue();
        int minutedbt=(Integer)minutedb.getValue();
        Time heuredbc=new Time(heuredbt,minutedbt,0);
        int heuredur=(Integer)dureehr.getValue();
        int minutedur=(Integer)dureemn.getValue();
        Time dureec=new Time(heuredur,minutedur,0);
        String motifc=(String)jComboBoxMotif.getSelectedItem();
        String justc=null;
        if (jRadioButtonJOui.isSelected())
            justc="Oui";
        if (jRadioButtonJNon.isSelected())
            justc="Non";
        String autoc=null;
        if (jRadioButtonAOui.isSelected())
            autoc="Oui";
        if (jRadioButtonANon.isSelected())
            autoc="Non";
        String requete = "insert into retards(id,mat,type,dateabs,heuredb,duree,motif,justificatif,autorise) values(?,?,?,?,?,?,?,?,?)";
        stmt = c.prepareStatement(requete);
        stmt.setString(1, idc);
        stmt.setString(2, matc);
        stmt.setString(3, typec);
        stmt.setDate(4, datec);
        stmt.setTime(5, heuredbc);
        stmt.setTime(6, dureec);
        stmt.setString(7, motifc);
        stmt.setString(8, justc);
        stmt.setString(9, autoc);
        stmt.execute();
        Retard rt=new Retard(idc,matc,typec,datec,heuredbc,dureec,motifc,justc,autoc);
        bdretards.add(rt);
        DefaultTableModel model3 = (DefaultTableModel) jTable2.getModel();
        model3.addRow(new Object[]{idc,typec,datec,heuredbc,dureec,motifc,justc,autoc});
        int nbr =(Integer) jTable1.getModel().getValueAt(index, 4);
        nbr++;
        String nbr2=Integer.toString(nbr);
        DefaultTableModel modelt1 = (DefaultTableModel) jTable1.getModel();
        modelt1.setValueAt(nbr2, index, 4);
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
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jRadioButtonANon = new javax.swing.JRadioButton();
        jRadioButtonAOui = new javax.swing.JRadioButton();
        jRadioButtonJNon = new javax.swing.JRadioButton();
        jRadioButtonJOui = new javax.swing.JRadioButton();
        jComboBoxMotif = new javax.swing.JComboBox<>();
        annuler = new javax.swing.JLabel();
        ajouter = new javax.swing.JLabel();
        jRadioButtonabsence = new javax.swing.JRadioButton();
        jRadioButtonretard = new javax.swing.JRadioButton();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        dureemn = new javax.swing.JSpinner();
        dureehr = new javax.swing.JSpinner();
        minutedb = new javax.swing.JSpinner();
        heuredb = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
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
        jLabel1.setText("Ajout Fiche R/A");
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

        jLabel12.setFont(new java.awt.Font("Kurri Island Caps Italics", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Durée:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 220, 80, -1));

        jLabel9.setFont(new java.awt.Font("Kurri Island Caps Italics", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Motif:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 80, -1));

        jLabel15.setFont(new java.awt.Font("Source Sans Pro", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Minutes");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 90, -1));

        jLabel14.setFont(new java.awt.Font("Kurri Island Caps Italics", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Heure de début:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 170, 140, -1));

        jLabel11.setFont(new java.awt.Font("Kurri Island Caps Italics", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Date:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 60, -1));

        jLabel10.setFont(new java.awt.Font("Kurri Island Caps Italics", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Autorisé:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 110, -1));

        jRadioButtonANon.setBackground(new java.awt.Color(255, 255, 255));
        autorise.add(jRadioButtonANon);
        jRadioButtonANon.setFont(new java.awt.Font("Source Sans Pro", 0, 24)); // NOI18N
        jRadioButtonANon.setForeground(new java.awt.Color(222, 221, 221));
        jRadioButtonANon.setText("Non");
        jRadioButtonANon.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 85, 76)));
        jRadioButtonANon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonANon.setFocusPainted(false);
        jRadioButtonANon.setOpaque(false);
        jRadioButtonANon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonANonActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButtonANon, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 80, 30));

        jRadioButtonAOui.setBackground(new java.awt.Color(255, 255, 255));
        autorise.add(jRadioButtonAOui);
        jRadioButtonAOui.setFont(new java.awt.Font("Source Sans Pro", 0, 24)); // NOI18N
        jRadioButtonAOui.setForeground(new java.awt.Color(222, 221, 221));
        jRadioButtonAOui.setText("Oui");
        jRadioButtonAOui.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 85, 76)));
        jRadioButtonAOui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonAOui.setFocusPainted(false);
        jRadioButtonAOui.setOpaque(false);
        jRadioButtonAOui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAOuiActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButtonAOui, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 80, 30));

        jRadioButtonJNon.setBackground(new java.awt.Color(255, 255, 255));
        justificatif.add(jRadioButtonJNon);
        jRadioButtonJNon.setFont(new java.awt.Font("Source Sans Pro", 0, 24)); // NOI18N
        jRadioButtonJNon.setForeground(new java.awt.Color(222, 221, 221));
        jRadioButtonJNon.setText("Non");
        jRadioButtonJNon.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 85, 76)));
        jRadioButtonJNon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonJNon.setFocusPainted(false);
        jRadioButtonJNon.setOpaque(false);
        jRadioButtonJNon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonJNonActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButtonJNon, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 80, 30));

        jRadioButtonJOui.setBackground(new java.awt.Color(255, 255, 255));
        justificatif.add(jRadioButtonJOui);
        jRadioButtonJOui.setFont(new java.awt.Font("Source Sans Pro", 0, 24)); // NOI18N
        jRadioButtonJOui.setForeground(new java.awt.Color(222, 221, 221));
        jRadioButtonJOui.setText("Oui");
        jRadioButtonJOui.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 85, 76)));
        jRadioButtonJOui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonJOui.setFocusPainted(false);
        jRadioButtonJOui.setOpaque(false);
        jRadioButtonJOui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonJOuiActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButtonJOui, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 80, 30));

        jComboBoxMotif.setFont(new java.awt.Font("Source Sans Pro", 0, 15)); // NOI18N
        jComboBoxMotif.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sélectionner", "Problème de garde d’enfant", "Maladie des enfants", "Situation d’aidant", "Gestion des tâches quotidiennes", "Problèmes de santé sans lien avec le travail", "Maladie professionnelle (ex. TMS)", "Conditions de travail", "Mauvaise ambiance de travail", "Stress professionnel (organisation, rythme, …)", "Accident de trajet", "Accident au travail", "Autre" }));
        jComboBoxMotif.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 85, 76)));
        jPanel3.add(jComboBoxMotif, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 320, 35));

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
        jPanel3.add(ajouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 190, 70));

        jRadioButtonabsence.setBackground(new java.awt.Color(255, 255, 255));
        type.add(jRadioButtonabsence);
        jRadioButtonabsence.setFont(new java.awt.Font("Source Sans Pro", 0, 24)); // NOI18N
        jRadioButtonabsence.setForeground(new java.awt.Color(222, 221, 221));
        jRadioButtonabsence.setText("Absence");
        jRadioButtonabsence.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 85, 76)));
        jRadioButtonabsence.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonabsence.setFocusPainted(false);
        jRadioButtonabsence.setOpaque(false);
        jRadioButtonabsence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonabsenceActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButtonabsence, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 110, 30));

        jRadioButtonretard.setBackground(new java.awt.Color(255, 255, 255));
        type.add(jRadioButtonretard);
        jRadioButtonretard.setFont(new java.awt.Font("Source Sans Pro", 0, 24)); // NOI18N
        jRadioButtonretard.setForeground(new java.awt.Color(222, 221, 221));
        jRadioButtonretard.setText("Retard");
        jRadioButtonretard.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 85, 76)));
        jRadioButtonretard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonretard.setFocusPainted(false);
        jRadioButtonretard.setOpaque(false);
        jRadioButtonretard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonretardActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButtonretard, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 100, 30));

        dateChooserCombo1.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dateChooserCombo1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 85, 76)));
    dateChooserCombo1.setFormat(2);
    dateChooserCombo1.setFieldFont(new java.awt.Font("Source Sans Pro", java.awt.Font.PLAIN, 24));
    jPanel3.add(dateChooserCombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 210, 35));

    dureemn.setFont(new java.awt.Font("Source Sans Pro", 0, 18)); // NOI18N
    dureemn.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
    jPanel3.add(dureemn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 40, -1));

    dureehr.setFont(new java.awt.Font("Source Sans Pro", 0, 18)); // NOI18N
    dureehr.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
    jPanel3.add(dureehr, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 40, -1));

    minutedb.setFont(new java.awt.Font("Source Sans Pro", 0, 18)); // NOI18N
    minutedb.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
    jPanel3.add(minutedb, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 40, -1));

    heuredb.setFont(new java.awt.Font("Source Sans Pro", 0, 18)); // NOI18N
    heuredb.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
    jPanel3.add(heuredb, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 40, -1));

    jLabel16.setFont(new java.awt.Font("Source Sans Pro", 0, 24)); // NOI18N
    jLabel16.setForeground(new java.awt.Color(255, 255, 255));
    jLabel16.setText("Heures");
    jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 70, -1));

    jLabel17.setFont(new java.awt.Font("Source Sans Pro", 0, 24)); // NOI18N
    jLabel17.setForeground(new java.awt.Color(255, 255, 255));
    jLabel17.setText("Heures");
    jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 70, -1));

    jLabel18.setFont(new java.awt.Font("Source Sans Pro", 0, 24)); // NOI18N
    jLabel18.setForeground(new java.awt.Color(255, 255, 255));
    jLabel18.setText("Minutes");
    jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 90, -1));

    jLabel13.setFont(new java.awt.Font("Kurri Island Caps Italics", 1, 24)); // NOI18N
    jLabel13.setForeground(new java.awt.Color(255, 255, 255));
    jLabel13.setText("Type:");
    jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 60, -1));

    jLabel19.setFont(new java.awt.Font("Kurri Island Caps Italics", 1, 24)); // NOI18N
    jLabel19.setForeground(new java.awt.Color(255, 255, 255));
    jLabel19.setText("Justificatif:");
    jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 340, 140, -1));

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

    private void annulerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annulerMouseClicked
        nn.setEnabled(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_annulerMouseClicked

    private void ajouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterMouseClicked
        try {
            if((!"Sélectionner".equals((String) jComboBoxMotif.getSelectedItem()))&&(jRadioButtonretard.isSelected()||jRadioButtonabsence.isSelected())&&(((Integer)dureemn.getValue()!=0)||(Integer)dureehr.getValue()!=0)&&(jRadioButtonJOui.isSelected()||jRadioButtonJNon.isSelected())&&(jRadioButtonAOui.isSelected()||jRadioButtonANon.isSelected()))
            {
                ajoutretard();
                JOptionPane pane = new JOptionPane("Fiche ajoutée avec succès !");
                JDialog d = pane.createDialog(jPanel3, "SUCCES");
                d.setLocationRelativeTo(jPanel3);
                d.setVisible(true);
                nn.setEnabled(true);
                this.setVisible(false);
            
            }
            else
            {        
                    JOptionPane pane = new JOptionPane("Vérifier tous les champs !");
                    JDialog d = pane.createDialog(jPanel3, "ERREUR");
                    d.setLocationRelativeTo(jPanel3);
                    d.setVisible(true);
            }   
        } catch (SQLException ex) {
            Logger.getLogger(AjoutRetard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AjoutRetard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ajouterMouseClicked

    private void jRadioButtonretardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonretardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonretardActionPerformed

    private void jRadioButtonabsenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonabsenceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonabsenceActionPerformed

    private void jRadioButtonJOuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonJOuiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonJOuiActionPerformed

    private void jRadioButtonJNonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonJNonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonJNonActionPerformed

    private void jRadioButtonAOuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAOuiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonAOuiActionPerformed

    private void jRadioButtonANonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonANonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonANonActionPerformed

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
            java.util.logging.Logger.getLogger(AjoutRetard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutRetard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutRetard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutRetard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private javax.swing.JSpinner dureehr;
    private javax.swing.JSpinner dureemn;
    private javax.swing.JSpinner heuredb;
    private javax.swing.JComboBox<String> jComboBoxMotif;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButtonANon;
    private javax.swing.JRadioButton jRadioButtonAOui;
    private javax.swing.JRadioButton jRadioButtonJNon;
    private javax.swing.JRadioButton jRadioButtonJOui;
    private javax.swing.JRadioButton jRadioButtonabsence;
    private javax.swing.JRadioButton jRadioButtonretard;
    private javax.swing.ButtonGroup justificatif;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JSpinner minutedb;
    private javax.swing.ButtonGroup type;
    // End of variables declaration//GEN-END:variables
}
