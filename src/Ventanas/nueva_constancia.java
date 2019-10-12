/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;
import Tablas.*;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.InputStream;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author MISAEL
 */
public class nueva_constancia extends javax.swing.JFrame {
    int num_panel;
    private String ruta=null;
    public nueva_constancia() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        rellenar_combos();
        bt_anterior.setVisible(false);
        num_panel=1;
        establecer_panel(num_panel);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        fecha_label.setText(formatter.format(date));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_cancelar = new javax.swing.JButton();
        bt_generar = new javax.swing.JButton();
        Pane_principal = new javax.swing.JPanel();
        tb_folio = new javax.swing.JTextField();
        label_folio = new javax.swing.JLabel();
        label_fecha = new javax.swing.JLabel();
        label_terreno = new javax.swing.JLabel();
        jPane2 = new javax.swing.JPanel();
        tb_med_so = new javax.swing.JTextField();
        tb_med_o = new javax.swing.JTextField();
        tb_med_e = new javax.swing.JTextField();
        tb_med_s = new javax.swing.JTextField();
        tb_med_n = new javax.swing.JTextField();
        tb_med_ne = new javax.swing.JTextField();
        tb_med_no = new javax.swing.JTextField();
        tb_med_se = new javax.swing.JTextField();
        tb_col_so = new javax.swing.JTextField();
        tb_col_n = new javax.swing.JTextField();
        tb_col_s = new javax.swing.JTextField();
        tb_col_e = new javax.swing.JTextField();
        tb_col_o = new javax.swing.JTextField();
        tb_col_ne = new javax.swing.JTextField();
        tb_col_no = new javax.swing.JTextField();
        tb_col_se = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tb_ubicacion_terreno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        cb_cv_secretario_dos = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        cb_ce_tesorero = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        cb_ce_secretario = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        cb_ce_presidente = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        cb_cv_secretario = new javax.swing.JComboBox<>();
        cb_cv_presidente = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        tb_testigo_tres_appat = new javax.swing.JTextField();
        tb_testigo_tres_apmat = new javax.swing.JTextField();
        tb_testigo_dos_apmat = new javax.swing.JTextField();
        tb_testigo_uno_apmat = new javax.swing.JTextField();
        tb_testigo_uno_appat = new javax.swing.JTextField();
        tb_testigo_uno_nombre = new javax.swing.JTextField();
        tb_testigo_dos_nombre = new javax.swing.JTextField();
        tb_testigo_dos_appat = new javax.swing.JTextField();
        tb_testigo_tres_nombre = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        bt_siguiente = new javax.swing.JButton();
        bt_anterior = new javax.swing.JButton();
        jPane1 = new javax.swing.JPanel();
        tb_propietario_nombre = new javax.swing.JTextField();
        tb_propietario_appat = new javax.swing.JTextField();
        tb_propietario_apmat = new javax.swing.JTextField();
        tb_cedente_nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tb_cedente_appat = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tb_cedente_apmat = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        bt_buscar_cedente = new javax.swing.JButton();
        bt_buscar_propietario = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        et_error = new javax.swing.JLabel();
        et_error1 = new javax.swing.JLabel();
        et_error2 = new javax.swing.JLabel();
        et_error3 = new javax.swing.JLabel();
        et_error4 = new javax.swing.JLabel();
        et_error5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_nota = new javax.swing.JTextArea();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        btn_subir_img = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        cb_tipo_terreno = new javax.swing.JComboBox<>();
        fecha_label = new javax.swing.JLabel();
        label_imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COMISARIA EJIDAL");
        setMinimumSize(new java.awt.Dimension(1366, 725));
        getContentPane().setLayout(null);

        bt_cancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_cancelar.setText("CANCELAR");
        bt_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_cancelar);
        bt_cancelar.setBounds(960, 640, 100, 23);

        bt_generar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_generar.setText("GENERAR");
        bt_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_generarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_generar);
        bt_generar.setBounds(1070, 640, 100, 23);

        Pane_principal.setBackground(new java.awt.Color(255, 255, 255));
        Pane_principal.setForeground(new java.awt.Color(255, 153, 153));
        Pane_principal.setLayout(null);
        getContentPane().add(Pane_principal);
        Pane_principal.setBounds(190, 120, 980, 520);
        getContentPane().add(tb_folio);
        tb_folio.setBounds(70, 160, 73, 20);

        label_folio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_folio.setText("FOLIO");
        getContentPane().add(label_folio);
        label_folio.setBounds(20, 160, 40, 14);

        label_fecha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_fecha.setText("FECHA");
        getContentPane().add(label_fecha);
        label_fecha.setBounds(20, 210, 50, 14);

        label_terreno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_terreno.setText("TIPO DE TERRENO");
        getContentPane().add(label_terreno);
        label_terreno.setBounds(40, 250, 110, 20);

        jPane2.setBackground(new java.awt.Color(255, 255, 255));
        jPane2.setLayout(null);

        tb_med_so.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb_med_soKeyTyped(evt);
            }
        });
        jPane2.add(tb_med_so);
        tb_med_so.setBounds(290, 420, 50, 30);

        tb_med_o.setText("90.2");
        tb_med_o.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb_med_oKeyTyped(evt);
            }
        });
        jPane2.add(tb_med_o);
        tb_med_o.setBounds(290, 260, 50, 30);

        tb_med_e.setText("30.2");
        tb_med_e.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb_med_eKeyTyped(evt);
            }
        });
        jPane2.add(tb_med_e);
        tb_med_e.setBounds(290, 220, 50, 30);

        tb_med_s.setText("32.3");
        tb_med_s.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb_med_sKeyTyped(evt);
            }
        });
        jPane2.add(tb_med_s);
        tb_med_s.setBounds(290, 180, 50, 30);

        tb_med_n.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb_med_nKeyTyped(evt);
            }
        });
        jPane2.add(tb_med_n);
        tb_med_n.setBounds(290, 140, 50, 30);

        tb_med_ne.setText("0");
        tb_med_ne.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb_med_neKeyTyped(evt);
            }
        });
        jPane2.add(tb_med_ne);
        tb_med_ne.setBounds(290, 300, 50, 30);

        tb_med_no.setText("0");
        tb_med_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb_med_noKeyTyped(evt);
            }
        });
        jPane2.add(tb_med_no);
        tb_med_no.setBounds(290, 340, 50, 30);

        tb_med_se.setText("0");
        tb_med_se.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb_med_seKeyTyped(evt);
            }
        });
        jPane2.add(tb_med_se);
        tb_med_se.setBounds(290, 380, 50, 30);

        tb_col_so.setText("-");
        tb_col_so.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb_col_soKeyTyped(evt);
            }
        });
        jPane2.add(tb_col_so);
        tb_col_so.setBounds(520, 420, 250, 30);

        tb_col_n.setText("Alberto perez garcia");
        tb_col_n.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb_col_nKeyTyped(evt);
            }
        });
        jPane2.add(tb_col_n);
        tb_col_n.setBounds(520, 140, 250, 30);

        tb_col_s.setText("Juan de la cruz costa");
        tb_col_s.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb_col_sKeyTyped(evt);
            }
        });
        jPane2.add(tb_col_s);
        tb_col_s.setBounds(520, 180, 250, 30);

        tb_col_e.setText("Carlos garcia cruz");
        tb_col_e.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb_col_eKeyTyped(evt);
            }
        });
        jPane2.add(tb_col_e);
        tb_col_e.setBounds(520, 220, 250, 30);

        tb_col_o.setText("Jared Rojas Bravo");
        tb_col_o.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb_col_oKeyTyped(evt);
            }
        });
        jPane2.add(tb_col_o);
        tb_col_o.setBounds(520, 260, 250, 30);

        tb_col_ne.setText("-");
        tb_col_ne.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb_col_neKeyTyped(evt);
            }
        });
        jPane2.add(tb_col_ne);
        tb_col_ne.setBounds(520, 300, 250, 30);

        tb_col_no.setText("-");
        tb_col_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb_col_noKeyTyped(evt);
            }
        });
        jPane2.add(tb_col_no);
        tb_col_no.setBounds(520, 340, 250, 30);

        tb_col_se.setText("-");
        tb_col_se.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb_col_seKeyTyped(evt);
            }
        });
        jPane2.add(tb_col_se);
        tb_col_se.setBounds(520, 380, 250, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("<html>  <DIV align=\"center\">  <P>UBICACIÓN DEL<P>TERRENO</DIV> </<html>  ");
        jPane2.add(jLabel10);
        jLabel10.setBounds(130, 60, 110, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("NORTE");
        jPane2.add(jLabel11);
        jLabel11.setBounds(180, 150, 50, 14);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("SUR");
        jPane2.add(jLabel15);
        jLabel15.setBounds(180, 190, 40, 14);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("ESTE");
        jPane2.add(jLabel16);
        jLabel16.setBounds(180, 230, 40, 14);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("OESTE");
        jPane2.add(jLabel17);
        jLabel17.setBounds(180, 270, 50, 14);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("NORESTE");
        jPane2.add(jLabel18);
        jLabel18.setBounds(180, 310, 70, 14);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("NOROESTE");
        jPane2.add(jLabel19);
        jLabel19.setBounds(180, 350, 70, 14);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("SURESTE");
        jPane2.add(jLabel20);
        jLabel20.setBounds(180, 390, 60, 14);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("SUROESTE");
        jPane2.add(jLabel21);
        jLabel21.setBounds(180, 430, 70, 14);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("MEDIDA");
        jPane2.add(jLabel1);
        jLabel1.setBounds(290, 110, 60, 10);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("COLINDANCIA");
        jPane2.add(jLabel6);
        jLabel6.setBounds(610, 110, 110, 10);

        tb_ubicacion_terreno.setText("el aguacate");
        tb_ubicacion_terreno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb_ubicacion_terrenoKeyTyped(evt);
            }
        });
        jPane2.add(tb_ubicacion_terreno);
        tb_ubicacion_terreno.setBounds(270, 60, 510, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("TIPO DE TERRENO");
        jPane2.add(jLabel8);
        jLabel8.setBounds(110, 510, 110, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("mts.");
        jPane2.add(jLabel3);
        jLabel3.setBounds(350, 430, 41, 14);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("mts.");
        jPane2.add(jLabel22);
        jLabel22.setBounds(350, 150, 25, 14);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("mts.");
        jPane2.add(jLabel23);
        jLabel23.setBounds(350, 190, 41, 14);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setText("mts.");
        jPane2.add(jLabel24);
        jLabel24.setBounds(350, 230, 41, 14);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setText("mts.");
        jPane2.add(jLabel25);
        jLabel25.setBounds(350, 270, 41, 14);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setText("mts.");
        jPane2.add(jLabel26);
        jLabel26.setBounds(350, 310, 41, 14);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setText("mts.");
        jPane2.add(jLabel27);
        jLabel27.setBounds(350, 350, 41, 14);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setText("mts.");
        jPane2.add(jLabel28);
        jLabel28.setBounds(350, 390, 41, 14);

        jLabel47.setText("jLabel47");
        jPane2.add(jLabel47);
        jLabel47.setBounds(20, 10, 40, 14);

        getContentPane().add(jPane2);
        jPane2.setBounds(20, 460, 90, 40);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setText("<html> <head> </head> <body> <div align=\"CENTER\"> <p>DATOS PERSONALES</p> <p>PARTICIPANTES</p> </div> <body> </html>");
        jPanel3.add(jLabel30);
        jLabel30.setBounds(370, 30, 200, 40);

        cb_cv_secretario_dos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(cb_cv_secretario_dos);
        cb_cv_secretario_dos.setBounds(560, 190, 190, 20);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setText("SECRETARIO");
        jPanel3.add(jLabel31);
        jLabel31.setBounds(470, 190, 80, 20);

        cb_ce_tesorero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(cb_ce_tesorero);
        cb_ce_tesorero.setBounds(250, 190, 190, 20);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setText("TESORERO");
        jPanel3.add(jLabel32);
        jLabel32.setBounds(160, 190, 70, 20);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setText("SECRETARIO");
        jPanel3.add(jLabel33);
        jLabel33.setBounds(160, 160, 80, 20);

        cb_ce_secretario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(cb_ce_secretario);
        cb_ce_secretario.setBounds(250, 160, 190, 20);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel34.setText("PRESIDENTE");
        jPanel3.add(jLabel34);
        jLabel34.setBounds(160, 130, 80, 20);

        cb_ce_presidente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(cb_ce_presidente);
        cb_ce_presidente.setBounds(250, 130, 190, 20);

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setText("PRESIDENTE");
        jPanel3.add(jLabel35);
        jLabel35.setBounds(470, 130, 80, 20);

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel36.setText("SECRETARIO");
        jPanel3.add(jLabel36);
        jLabel36.setBounds(470, 160, 80, 20);

        cb_cv_secretario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(cb_cv_secretario);
        cb_cv_secretario.setBounds(560, 160, 190, 20);

        cb_cv_presidente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(cb_cv_presidente);
        cb_cv_presidente.setBounds(560, 130, 190, 20);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel37.setText("<html>\n<head>\n</head>\n<body>\n\t<div align=\"center\">\n\t\t<p>CONSEJO DE VIGILANCIA</p>\n\t</div>\n</body>\n</html>");
        jPanel3.add(jLabel37);
        jLabel37.setBounds(520, 100, 160, 20);

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel38.setText("<html> \n<head> </head> \n<body> \n<div align=\"CENTER\">\n <p>COMITÉ EJIDAL</p> \n</div> \n<body>\n </html>\n");
        jPanel3.add(jLabel38);
        jLabel38.setBounds(270, 100, 110, 20);

        tb_testigo_tres_appat.setText("c");
        tb_testigo_tres_appat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb_testigo_tres_appatKeyTyped(evt);
            }
        });
        jPanel3.add(tb_testigo_tres_appat);
        tb_testigo_tres_appat.setBounds(630, 330, 210, 30);

        tb_testigo_tres_apmat.setText("c");
        tb_testigo_tres_apmat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb_testigo_tres_apmatKeyTyped(evt);
            }
        });
        jPanel3.add(tb_testigo_tres_apmat);
        tb_testigo_tres_apmat.setBounds(630, 380, 210, 30);

        tb_testigo_dos_apmat.setText("Arellano");
        tb_testigo_dos_apmat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb_testigo_dos_apmatKeyTyped(evt);
            }
        });
        jPanel3.add(tb_testigo_dos_apmat);
        tb_testigo_dos_apmat.setBounds(390, 380, 200, 30);

        tb_testigo_uno_apmat.setText("Cruz");
        tb_testigo_uno_apmat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb_testigo_uno_apmatKeyTyped(evt);
            }
        });
        jPanel3.add(tb_testigo_uno_apmat);
        tb_testigo_uno_apmat.setBounds(160, 380, 200, 30);

        tb_testigo_uno_appat.setText("Cruz");
        tb_testigo_uno_appat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb_testigo_uno_appatKeyTyped(evt);
            }
        });
        jPanel3.add(tb_testigo_uno_appat);
        tb_testigo_uno_appat.setBounds(160, 330, 200, 30);

        tb_testigo_uno_nombre.setText("Alfonso");
        tb_testigo_uno_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb_testigo_uno_nombreKeyTyped(evt);
            }
        });
        jPanel3.add(tb_testigo_uno_nombre);
        tb_testigo_uno_nombre.setBounds(160, 280, 200, 30);

        tb_testigo_dos_nombre.setText("Vicrtor");
        tb_testigo_dos_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb_testigo_dos_nombreKeyTyped(evt);
            }
        });
        jPanel3.add(tb_testigo_dos_nombre);
        tb_testigo_dos_nombre.setBounds(390, 280, 200, 30);

        tb_testigo_dos_appat.setText("Resendiz");
        tb_testigo_dos_appat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb_testigo_dos_appatKeyTyped(evt);
            }
        });
        jPanel3.add(tb_testigo_dos_appat);
        tb_testigo_dos_appat.setBounds(390, 330, 200, 30);

        tb_testigo_tres_nombre.setText("c");
        tb_testigo_tres_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb_testigo_tres_nombreKeyTyped(evt);
            }
        });
        jPanel3.add(tb_testigo_tres_nombre);
        tb_testigo_tres_nombre.setBounds(630, 280, 210, 30);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel39.setText("TESTIGO 3");
        jPanel3.add(jLabel39);
        jLabel39.setBounds(710, 250, 70, 14);

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel40.setText("TESTIGO 2");
        jPanel3.add(jLabel40);
        jLabel40.setBounds(460, 250, 70, 14);

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel41.setText("TESTIGO 1");
        jPanel3.add(jLabel41);
        jLabel41.setBounds(240, 250, 70, 14);

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel42.setText("<html>  <DIV align=\"center\">  <P>NOMBRE(S)</DIV> </<html>  ");
        jPanel3.add(jLabel42);
        jLabel42.setBounds(70, 290, 70, 20);

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel43.setText("<html>  <DIV align=\"center\">  <P>APELLIDO   <P> PATERNO </DIV> </html>  ");
        jPanel3.add(jLabel43);
        jLabel43.setBounds(70, 320, 60, 30);

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel44.setText("<html>  <DIV align=\"center\">  <P>APELLIDO   <P> MATERNO </DIV> </html>  ");
        jPanel3.add(jLabel44);
        jLabel44.setBounds(70, 370, 54, 28);

        jLabel48.setText("jLabel48");
        jPanel3.add(jLabel48);
        jLabel48.setBounds(20, 10, 40, 14);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(20, 520, 90, 40);

        bt_siguiente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_siguiente.setText("SIGUIENTE");
        bt_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_siguienteActionPerformed(evt);
            }
        });
        getContentPane().add(bt_siguiente);
        bt_siguiente.setBounds(650, 640, 100, 23);

        bt_anterior.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_anterior.setText("ANTERIOR");
        bt_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_anteriorActionPerformed(evt);
            }
        });
        getContentPane().add(bt_anterior);
        bt_anterior.setBounds(490, 640, 100, 23);

        jPane1.setBackground(new java.awt.Color(255, 255, 255));
        jPane1.setLayout(null);

        tb_propietario_nombre.setText("Misael");
        tb_propietario_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb_propietario_nombreKeyTyped(evt);
            }
        });
        jPane1.add(tb_propietario_nombre);
        tb_propietario_nombre.setBounds(300, 50, 320, 40);

        tb_propietario_appat.setText("urzua");
        tb_propietario_appat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb_propietario_appatKeyTyped(evt);
            }
        });
        jPane1.add(tb_propietario_appat);
        tb_propietario_appat.setBounds(300, 100, 320, 40);

        tb_propietario_apmat.setText("ramos");
        tb_propietario_apmat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb_propietario_apmatKeyTyped(evt);
            }
        });
        jPane1.add(tb_propietario_apmat);
        tb_propietario_apmat.setBounds(300, 150, 320, 40);

        tb_cedente_nombre.setText("larry edsel");
        tb_cedente_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb_cedente_nombreKeyTyped(evt);
            }
        });
        jPane1.add(tb_cedente_nombre);
        tb_cedente_nombre.setBounds(310, 280, 320, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("<html>  <DIV align=\"center\">  <P>NOMBRE(S) DEL<P>QUE CEDE </DIV> </<html>  ");
        jPane1.add(jLabel5);
        jLabel5.setBounds(210, 270, 100, 50);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("<html>  <DIV align=\"center\">  <P>APELLIDO   <P> PATERNO </DIV> </html>  ");
        jPane1.add(jLabel7);
        jLabel7.setBounds(220, 330, 60, 30);

        tb_cedente_appat.setText("urzua");
        tb_cedente_appat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb_cedente_appatKeyTyped(evt);
            }
        });
        jPane1.add(tb_cedente_appat);
        tb_cedente_appat.setBounds(310, 330, 320, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("<html>  <DIV align=\"center\">  <P>APELLIDO   <P> MATERNO </DIV> </html>  ");
        jPane1.add(jLabel9);
        jLabel9.setBounds(220, 380, 54, 28);

        tb_cedente_apmat.setText("ramos");
        tb_cedente_apmat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb_cedente_apmatKeyTyped(evt);
            }
        });
        jPane1.add(tb_cedente_apmat);
        tb_cedente_apmat.setBounds(310, 380, 320, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("<html>  <DIV align=\"center\">  <P>NOMBRE(S) DEL<P>PROPIETARIO </DIV> </<html>  ");
        jPane1.add(jLabel12);
        jLabel12.setBounds(200, 60, 100, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("<html>  <DIV align=\"center\">  <P>APELLIDO   <P> PATERNO </DIV> </html>  ");
        jPane1.add(jLabel13);
        jLabel13.setBounds(210, 100, 60, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("<html>  <DIV align=\"center\">  <P>APELLIDO   <P> MATERNO </DIV> </html>  ");
        jPane1.add(jLabel14);
        jLabel14.setBounds(210, 140, 54, 28);

        bt_buscar_cedente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_buscar_cedente.setText("<html>\n<body align=\"center\">\n\t<p>BUSCAR</p>\n\t<p>EXISTENTE</p>\n</body>\n</html>");
        bt_buscar_cedente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_buscar_cedenteActionPerformed(evt);
            }
        });
        jPane1.add(bt_buscar_cedente);
        bt_buscar_cedente.setBounds(640, 430, 120, 40);

        bt_buscar_propietario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_buscar_propietario.setText("<html> <body align =\"center\"> \t<p>BUSCAR</p> \t<p>EXISTENTE</p> </body> </html>");
        jPane1.add(bt_buscar_propietario);
        bt_buscar_propietario.setBounds(640, 190, 120, 40);
        jPane1.add(jSeparator1);
        jSeparator1.setBounds(10, 240, 920, 10);

        jLabel29.setText("jLabel29");
        jPane1.add(jLabel29);
        jLabel29.setBounds(20, 10, 40, 14);

        et_error.setForeground(new java.awt.Color(204, 0, 0));
        jPane1.add(et_error);
        et_error.setBounds(650, 390, 130, 20);

        et_error1.setForeground(new java.awt.Color(204, 0, 0));
        jPane1.add(et_error1);
        et_error1.setBounds(640, 60, 130, 20);

        et_error2.setForeground(new java.awt.Color(204, 0, 0));
        jPane1.add(et_error2);
        et_error2.setBounds(640, 110, 130, 20);

        et_error3.setForeground(new java.awt.Color(204, 0, 0));
        jPane1.add(et_error3);
        et_error3.setBounds(640, 160, 130, 20);

        et_error4.setForeground(new java.awt.Color(204, 0, 0));
        jPane1.add(et_error4);
        et_error4.setBounds(650, 290, 130, 20);

        et_error5.setForeground(new java.awt.Color(204, 0, 0));
        jPane1.add(et_error5);
        et_error5.setBounds(650, 340, 130, 20);

        getContentPane().add(jPane1);
        jPane1.setBounds(20, 400, 90, 40);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ta_nota.setColumns(20);
        ta_nota.setRows(5);
        ta_nota.setText("ninguna");
        jScrollPane1.setViewportView(ta_nota);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 480, 110));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel45.setText("NOTA:");
        jPanel4.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel46.setText("<html><div style=\"text-align: center\"><p>SELECCIONE</p>CROQUIS:<p></p></div></html>");
        jPanel4.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        btn_subir_img.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_subir_img.setText("SUBIR IMAGEN");
        btn_subir_img.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subir_imgActionPerformed(evt);
            }
        });
        jPanel4.add(btn_subir_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));

        jLabel49.setText("jLabel49");
        jPanel4.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        getContentPane().add(jPanel4);
        jPanel4.setBounds(20, 580, 90, 40);

        cb_tipo_terreno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LOTE", "LOTE CON CASA HAB.", "PARCELA", "FRACCIÓN DE PARC." }));
        cb_tipo_terreno.setOpaque(false);
        getContentPane().add(cb_tipo_terreno);
        cb_tipo_terreno.setBounds(20, 280, 150, 20);

        fecha_label.setText("jLabel4");
        getContentPane().add(fecha_label);
        fecha_label.setBounds(80, 206, 110, 20);

        label_imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NC.jpg"))); // NOI18N
        label_imagen.setText("j");
        getContentPane().add(label_imagen);
        label_imagen.setBounds(0, 0, 1373, 1090);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelarActionPerformed
        // TODO add your handling code here:
        menu_registro obj = new menu_registro();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_cancelarActionPerformed

    private void bt_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_siguienteActionPerformed
        num_panel++;
        establecer_panel(num_panel);
        if(num_panel == 4)
            bt_siguiente.setVisible(false);
        if(num_panel>1)
            bt_anterior.setVisible(true);
        
    }//GEN-LAST:event_bt_siguienteActionPerformed

    private void bt_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_anteriorActionPerformed
        num_panel--;
        establecer_panel(num_panel);
        if(num_panel==1)
            bt_anterior.setVisible(false);   
        if(num_panel<4)
            bt_siguiente.setVisible(true);
        
        
        
    }//GEN-LAST:event_bt_anteriorActionPerformed

    private void bt_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_generarActionPerformed
        /*String text = ta_nota.getText().toString();
        System.out.println(text);*/
        Terreno terreno = new Terreno();
        int id_terreno =terreno.ultimoID()+1;
        terreno.setId_terreno(id_terreno);
        terreno.setUbicacion(tb_ubicacion_terreno.getText().toUpperCase());
        terreno.setTipo_terreno(cb_tipo_terreno.getSelectedItem().toString().toUpperCase());
        
        terreno.setMed_N(Float.parseFloat(tb_med_n.getText())); terreno.setMed_S(Float.parseFloat(tb_med_s.getText())); 
        terreno.setMed_E(Float.parseFloat(tb_med_e.getText())); terreno.setMed_O(Float.parseFloat(tb_med_o.getText()));
        terreno.setMed_NE(Float.parseFloat(tb_med_ne.getText())); terreno.setMed_NO(Float.parseFloat(tb_med_no.getText())); 
        terreno.setMed_SE(Float.parseFloat(tb_med_se.getText())); terreno.setMed_SO(Float.parseFloat(tb_med_so.getText()));
        
        
        terreno.setCol_N(tb_col_n.getText().toUpperCase());terreno.setCol_S(tb_col_s.getText().toUpperCase());
        terreno.setCol_E(tb_col_e.getText().toUpperCase());terreno.setCol_O(tb_col_o.getText().toUpperCase());
        terreno.setCol_NE(tb_col_ne.getText().toUpperCase());terreno.setCol_NO(tb_col_no.getText().toUpperCase());
        terreno.setCol_SE(tb_col_se.getText().toUpperCase());terreno.setCol_SO(tb_col_so.getText().toUpperCase());
        
        if(terreno.Registar())
            System.out.println("TERRENO");
        
        Propietario propietario = new Propietario();
        int id_propietario = propietario.ultimoID()+1;
        propietario.setNombre(tb_propietario_nombre.getText().toUpperCase());
        propietario.setApellido_paterno(tb_propietario_appat.getText().toUpperCase());
        propietario.setApellido_materno(tb_propietario_apmat.getText().toUpperCase());
       // propietario.setTelefono();
       if(propietario.Registar())
            System.out.println("PROPIETARIO");
       
       Terrenos_de_propietario terreros_propietario = new Terrenos_de_propietario();
       terreros_propietario.setId_propietario(id_propietario);
       terreros_propietario.setId_terreno(id_terreno);
       if(terreros_propietario.Registar())
            System.out.println("TERRENOS_PROPIETARIO");
       
       Cedente cedente = new Cedente();
       int id_cediente = cedente.ultimoID()+1;
       cedente.setId(id_cediente);
       cedente.setNombre(tb_cedente_nombre.getText().toUpperCase());
       cedente.setApellido_paterno(tb_cedente_appat.getText().toUpperCase());
       cedente.setApellido_materno(tb_cedente_apmat.getText().toUpperCase());
       if(cedente.Registar())
            System.out.println("CEDENTE");
       
       Constancia constancia = new Constancia();
       int id_constancia = constancia.ultimoID()+1;
       constancia.setFolio(id_constancia);
       constancia.setFecha_exp(fecha_label.getText());
       constancia.setId_terreno(id_terreno);
       constancia.setId_cediente(id_cediente);
       constancia.setNota(ta_nota.getText().toUpperCase());
       constancia.setRuta_imagen(this.ruta);
       if(constancia.Agregar())
            System.out.println("CONSTANCIA");
       
       Constancia_propietario constancia_propietario = new Constancia_propietario();
       constancia_propietario.setFolio_constancia(id_constancia);
       constancia_propietario. setId_propietario(id_propietario);
       if(constancia_propietario.Registrar())
            System.out.println("CONSTANCIA_PROPIETARIO");
       
       Testigo testigo = new Testigo();
       int id_testigo1 = testigo.ultimoID()+1;
       testigo.setId(id_testigo1);
       testigo.setNombre(tb_testigo_uno_nombre.getText().toUpperCase());
       testigo.setApellido_paterno(tb_testigo_uno_appat.getText().toUpperCase());
       testigo.setApellido_materno(tb_testigo_uno_apmat.getText().toUpperCase());
       if(testigo.Registar())
            System.out.println("TESTIGO 1");
       
       int id_testigo2 = testigo.ultimoID()+1;
       testigo.setId(id_testigo2);
       testigo.setNombre(tb_testigo_dos_nombre.getText().toUpperCase());
       testigo.setApellido_paterno(tb_testigo_dos_appat.getText().toUpperCase());
       testigo.setApellido_materno(tb_testigo_dos_apmat.getText().toUpperCase());
       if(testigo.Registar())
            System.out.println("TESTIGO 2");
        
       Testigos_participantes testigos_participantes = new Testigos_participantes();
       testigos_participantes.setFolio_constancia(id_constancia);
       testigos_participantes.setTestigo(id_testigo1);
       if(testigos_participantes.Registar())
            System.out.println("TESTIGOS 1 PARTICIPANTES");
       
       testigos_participantes.setFolio_constancia(id_constancia);
       testigos_participantes.setTestigo(id_testigo2);
       if(testigos_participantes.Registar())
            System.out.println("TESTIGOS 2 PARTICIPANTES");
       
       Com_eji_autoriza com_eji_autoriza = new Com_eji_autoriza();
       String[] auxiliar_id = cb_ce_presidente.getSelectedItem().toString().split(",");
       int id_comite= Integer.parseInt(auxiliar_id[0]);
       com_eji_autoriza.setFolio_constancia(id_constancia);
       com_eji_autoriza.setId_autoriza(id_comite);
       if(com_eji_autoriza.Registar())
            System.out.println("PRESIDENTE CE");
        
       auxiliar_id = cb_ce_secretario.getSelectedItem().toString().split(",");
       id_comite= Integer.parseInt(auxiliar_id[0]);
       com_eji_autoriza.setFolio_constancia(id_constancia);
       com_eji_autoriza.setId_autoriza(id_comite);
       if(com_eji_autoriza.Registar())
            System.out.println("SECRETARIO CE");
       
       auxiliar_id = cb_ce_tesorero.getSelectedItem().toString().split(",");
       id_comite= Integer.parseInt(auxiliar_id[0]);
       com_eji_autoriza.setFolio_constancia(id_constancia);
       com_eji_autoriza.setId_autoriza(id_comite);
       if(com_eji_autoriza.Registar())
            System.out.println("TESORERO CE");
       
       Con_vig_autoriza con_vig_autoriza = new Con_vig_autoriza();
       auxiliar_id = cb_cv_presidente.getSelectedItem().toString().split(",");
       id_comite= Integer.parseInt(auxiliar_id[0]);
       con_vig_autoriza.setFolio_consatncia(id_constancia);
       con_vig_autoriza.setId_autoriza(id_comite);
       if(con_vig_autoriza.Registar())
            System.out.println("PRESIDENTE CV");
       
       auxiliar_id = cb_cv_secretario.getSelectedItem().toString().split(",");
       id_comite= Integer.parseInt(auxiliar_id[0]);
       con_vig_autoriza.setFolio_consatncia(id_constancia);
       con_vig_autoriza.setId_autoriza(id_comite);
       if(con_vig_autoriza.Registar())
            System.out.println("SECRETARIO1 CV");
       
       auxiliar_id = cb_cv_secretario_dos.getSelectedItem().toString().split(",");
       id_comite= Integer.parseInt(auxiliar_id[0]);
       con_vig_autoriza.setFolio_consatncia(id_constancia);
       con_vig_autoriza.setId_autoriza(id_comite);
       if(con_vig_autoriza.Registar())
            System.out.println("SECRETARIO2 CV");
       
       JOptionPane.showMessageDialog(null,"REGISTRADO CON ÉXITO");
       
       
    }//GEN-LAST:event_bt_generarActionPerformed

    private void bt_buscar_cedenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_buscar_cedenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_buscar_cedenteActionPerformed

    private void btn_subir_imgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subir_imgActionPerformed
        // TODO add your handling code here:
        JFileChooser ventana_explorador = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG, PNG & GIF","jpg","png","gif");
        ventana_explorador.setFileFilter(filtro);
        
        int s = ventana_explorador.showOpenDialog(this);
        if(s == JFileChooser.APPROVE_OPTION){
            this.ruta = ventana_explorador.getSelectedFile().getAbsolutePath();
            
            
        }
    }//GEN-LAST:event_btn_subir_imgActionPerformed

    private void tb_propietario_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_propietario_nombreKeyTyped
        // TODO add your handling code here:
        ValidarLetras(evt);
    }//GEN-LAST:event_tb_propietario_nombreKeyTyped

    private void tb_propietario_appatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_propietario_appatKeyTyped
        // TODO add your handling code here:
        ValidarLetras(evt);
    }//GEN-LAST:event_tb_propietario_appatKeyTyped

    private void tb_propietario_apmatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_propietario_apmatKeyTyped
        // TODO add your handling code here:
        ValidarLetras(evt);
    }//GEN-LAST:event_tb_propietario_apmatKeyTyped

    private void tb_cedente_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_cedente_nombreKeyTyped
        // TODO add your handling code here:
        ValidarLetras(evt);
    }//GEN-LAST:event_tb_cedente_nombreKeyTyped

    private void tb_cedente_appatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_cedente_appatKeyTyped
        // TODO add your handling code here:
        ValidarLetras(evt);
    }//GEN-LAST:event_tb_cedente_appatKeyTyped

    private void tb_cedente_apmatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_cedente_apmatKeyTyped
        // TODO add your handling code here:
        ValidarLetras(evt);
    }//GEN-LAST:event_tb_cedente_apmatKeyTyped

    //SEGUNDA VENTANA
    private void tb_ubicacion_terrenoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_ubicacion_terrenoKeyTyped
        // TODO add your handling code here:
        ValidarLetras(evt);
    }//GEN-LAST:event_tb_ubicacion_terrenoKeyTyped

    private void tb_med_nKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_med_nKeyTyped
        // TODO add your handling code here:
          char n = evt.getKeyChar();
       
       if(!Character.isDigit(n) && n!='.')
       {
           evt.consume();
       }
       else if(tb_med_n.getText().contains(".") && n == '.')
       {
           evt.consume();
       }
    }//GEN-LAST:event_tb_med_nKeyTyped

    private void tb_col_nKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_col_nKeyTyped
        // TODO add your handling code here:
        ValidarLetras(evt);
    }//GEN-LAST:event_tb_col_nKeyTyped

    private void tb_col_sKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_col_sKeyTyped
        // TODO add your handling code here:
        ValidarLetras(evt);
    }//GEN-LAST:event_tb_col_sKeyTyped

    private void tb_col_eKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_col_eKeyTyped
        // TODO add your handling code here:
        ValidarLetras(evt);
    }//GEN-LAST:event_tb_col_eKeyTyped

    private void tb_col_oKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_col_oKeyTyped
        // TODO add your handling code here:
        ValidarLetras(evt);
    }//GEN-LAST:event_tb_col_oKeyTyped

    private void tb_col_neKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_col_neKeyTyped
        // TODO add your handling code here:
        ValidarLetras(evt);
    }//GEN-LAST:event_tb_col_neKeyTyped

    private void tb_col_noKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_col_noKeyTyped
        // TODO add your handling code here:
        ValidarLetras(evt);
    }//GEN-LAST:event_tb_col_noKeyTyped

    private void tb_col_seKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_col_seKeyTyped
        // TODO add your handling code here:
        ValidarLetras(evt);
    }//GEN-LAST:event_tb_col_seKeyTyped

    private void tb_col_soKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_col_soKeyTyped
        // TODO add your handling code here:
        ValidarLetras(evt);
    }//GEN-LAST:event_tb_col_soKeyTyped

    private void tb_med_sKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_med_sKeyTyped
        // TODO add your handling code here:
          char n = evt.getKeyChar();
       
       if(!Character.isDigit(n) && n!='.')
       {
           evt.consume();
       }
       else if(tb_med_s.getText().contains(".") && n == '.')
       {
           evt.consume();
       }
    }//GEN-LAST:event_tb_med_sKeyTyped

    private void tb_med_eKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_med_eKeyTyped
        // TODO add your handling code here:
          char n = evt.getKeyChar();
       
       if(!Character.isDigit(n) && n!='.')
       {
           evt.consume();
       }
       else if(tb_med_e.getText().contains(".") && n == '.')
       {
           evt.consume();
       }
    }//GEN-LAST:event_tb_med_eKeyTyped

    private void tb_med_oKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_med_oKeyTyped
        // TODO add your handling code here:
          char n = evt.getKeyChar();
       
       if(!Character.isDigit(n) && n!='.')
       {
           evt.consume();
       }
       else if(tb_med_o.getText().contains(".") && n == '.')
       {
           evt.consume();
       }
    }//GEN-LAST:event_tb_med_oKeyTyped

    private void tb_med_neKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_med_neKeyTyped
        // TODO add your handling code here:
          char n = evt.getKeyChar();
       
       if(!Character.isDigit(n) && n!='.')
       {
           evt.consume();
       }
       else if(tb_med_ne.getText().contains(".") && n == '.')
       {
           evt.consume();
       }
    }//GEN-LAST:event_tb_med_neKeyTyped

    private void tb_med_noKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_med_noKeyTyped
        // TODO add your handling code here:
          char n = evt.getKeyChar();
       
       if(!Character.isDigit(n) && n!='.')
       {
           evt.consume();
       }
       else if(tb_med_no.getText().contains(".") && n == '.')
       {
           evt.consume();
       }
    }//GEN-LAST:event_tb_med_noKeyTyped

    private void tb_med_seKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_med_seKeyTyped
        // TODO add your handling code here:
          char n = evt.getKeyChar();
       
       if(!Character.isDigit(n) && n!='.')
       {
           evt.consume();
       }
       else if(tb_med_se.getText().contains(".") && n == '.')
       {
           evt.consume();
       }
    }//GEN-LAST:event_tb_med_seKeyTyped

    private void tb_med_soKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_med_soKeyTyped
        // TODO add your handling code here:
         char n = evt.getKeyChar();
       
       if(!Character.isDigit(n) && n!='.')
       {
           evt.consume();
       }
       else if(tb_med_so.getText().contains(".") && n == '.')
       {
           evt.consume();
       }
    }//GEN-LAST:event_tb_med_soKeyTyped

    private void tb_testigo_uno_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_testigo_uno_nombreKeyTyped
        // TODO add your handling code here:
        ValidarLetras(evt);
    }//GEN-LAST:event_tb_testigo_uno_nombreKeyTyped

    private void tb_testigo_uno_appatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_testigo_uno_appatKeyTyped
        // TODO add your handling code here:
        ValidarLetras(evt);
    }//GEN-LAST:event_tb_testigo_uno_appatKeyTyped

    private void tb_testigo_uno_apmatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_testigo_uno_apmatKeyTyped
        // TODO add your handling code here:
        ValidarLetras(evt);
    }//GEN-LAST:event_tb_testigo_uno_apmatKeyTyped

    private void tb_testigo_dos_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_testigo_dos_nombreKeyTyped
        // TODO add your handling code here:
        ValidarLetras(evt);
    }//GEN-LAST:event_tb_testigo_dos_nombreKeyTyped

    private void tb_testigo_dos_appatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_testigo_dos_appatKeyTyped
        // TODO add your handling code here:
        ValidarLetras(evt);
    }//GEN-LAST:event_tb_testigo_dos_appatKeyTyped

    private void tb_testigo_dos_apmatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_testigo_dos_apmatKeyTyped
        // TODO add your handling code here:
        ValidarLetras(evt);
    }//GEN-LAST:event_tb_testigo_dos_apmatKeyTyped

    private void tb_testigo_tres_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_testigo_tres_nombreKeyTyped
        // TODO add your handling code here:
        ValidarLetras(evt);
    }//GEN-LAST:event_tb_testigo_tres_nombreKeyTyped

    private void tb_testigo_tres_appatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_testigo_tres_appatKeyTyped
        // TODO add your handling code here:
        ValidarLetras(evt);
    }//GEN-LAST:event_tb_testigo_tres_appatKeyTyped

    private void tb_testigo_tres_apmatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_testigo_tres_apmatKeyTyped
        // TODO add your handling code here:
        ValidarLetras(evt);
    }//GEN-LAST:event_tb_testigo_tres_apmatKeyTyped

       
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
            java.util.logging.Logger.getLogger(nueva_constancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nueva_constancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nueva_constancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nueva_constancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nueva_constancia().setVisible(true);
                
            }
        });
    }
    public void rellenar_combos(){
        /*
        RECIBO UNA LISTA EXTRAÍDA DE LA BASE DE DATOS PARA RELLENAR LOS COMBOBOX
        */
        ResultSet rs;
        Miembro_comisariado_ejidal mce = new Miembro_comisariado_ejidal();
        Miembro_consejo_vigilancia mcv = new Miembro_consejo_vigilancia();
        cb_ce_presidente.removeAllItems();
        cb_ce_secretario.removeAllItems();
        cb_ce_tesorero.removeAllItems();
        cb_cv_presidente.removeAllItems();
        cb_cv_secretario.removeAllItems();
        cb_cv_secretario_dos.removeAllItems();
        try {
            rs = mce.Buscar_por_cargo("PRESIDENTE");
            while(rs.next()){
                cb_ce_presidente.addItem(rs.getString(1)+","+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
            }
            rs = mce.Buscar_por_cargo("SECRETARIO");
            while(rs.next()){
                cb_ce_secretario.addItem(rs.getString(1)+","+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
            }
            rs = mce.Buscar_por_cargo("TESORERO");
            while(rs.next()){
                cb_ce_tesorero.addItem(rs.getString(1)+","+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
            }
            rs = mcv.Buscar_por_cargo("PRESIDENTE");
            while(rs.next()){
                cb_cv_presidente.addItem(rs.getString(1)+","+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
            }
            rs = mcv.Buscar_por_cargo("SECRETARIO");
            while(rs.next()){
                cb_cv_secretario.addItem(rs.getString(1)+","+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
                cb_cv_secretario_dos.addItem(rs.getString(1)+","+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"ERROR AL RELLENAR"+e);
        }
        
    
    
    }
    
    public void establecer_panel(int pan){
        /*
        ESTABLESCO LOS PANELES CONFORME A EL NÚMERO DE PANEL QUE RECIBO
        Y LO PINTO EN EL PANEL PRINCIPAL
        */
        if(pan==1){
            Pane_principal.removeAll();
            //jPane1.setOpaque(true);
            Pane_principal.add(jPane1);
          //  jPane1.setBackground(Color.red);
            jPane1.setLocation(20, 20);
            jPane1.setSize(938, 480);
            Pane_principal.revalidate();
            Pane_principal.repaint();
        }else{
            if(pan==2){
            Pane_principal.removeAll();
            Pane_principal.add(jPane2);
            jPane2.setLocation(20, 20);
            jPane2.setSize(920, 450);
            Pane_principal.revalidate();
            Pane_principal.repaint();
            }
            else{
                if(pan==3){
                    Pane_principal.removeAll();
                    Pane_principal.add(jPanel3);
                    jPanel3.setLocation(20, 20);
                    jPanel3.setSize(938, 480);
                    Pane_principal.revalidate();
                    Pane_principal.repaint();
                }
                else{
                    Pane_principal.removeAll();
                    Pane_principal.add(jPanel4);
                    jPanel4.setLocation(20, 20);
                    jPanel4.setSize(938, 480);
                    Pane_principal.revalidate();
                    Pane_principal.repaint();
                }
            }
            
        }
    }
    
    public void ValidarLetras(KeyEvent evt){
        char l=evt.getKeyChar();
        if(!Character.isLetter(l) && l !=KeyEvent.VK_SPACE)
            {
                evt.consume();
            }
    }
    
     /*public void ValidarNum(KeyEvent evt){
        
        char n=evt.getKeyChar();
        if(!Character.isDigit(n) && n !='.')
        {
            evt.consume();
        }  
     }*/
    
    
                    
 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pane_principal;
    private javax.swing.JButton bt_anterior;
    private javax.swing.JButton bt_buscar_cedente;
    private javax.swing.JButton bt_buscar_propietario;
    private javax.swing.JButton bt_cancelar;
    private javax.swing.JButton bt_generar;
    private javax.swing.JButton bt_siguiente;
    private javax.swing.JButton btn_subir_img;
    private javax.swing.JComboBox<String> cb_ce_presidente;
    private javax.swing.JComboBox<String> cb_ce_secretario;
    private javax.swing.JComboBox<String> cb_ce_tesorero;
    private javax.swing.JComboBox<String> cb_cv_presidente;
    private javax.swing.JComboBox<String> cb_cv_secretario;
    private javax.swing.JComboBox<String> cb_cv_secretario_dos;
    private javax.swing.JComboBox<String> cb_tipo_terreno;
    private javax.swing.JLabel et_error;
    private javax.swing.JLabel et_error1;
    private javax.swing.JLabel et_error2;
    private javax.swing.JLabel et_error3;
    private javax.swing.JLabel et_error4;
    private javax.swing.JLabel et_error5;
    private javax.swing.JLabel fecha_label;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPane1;
    private javax.swing.JPanel jPane2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_fecha;
    private javax.swing.JLabel label_folio;
    private javax.swing.JLabel label_imagen;
    private javax.swing.JLabel label_terreno;
    private javax.swing.JTextArea ta_nota;
    private javax.swing.JTextField tb_cedente_apmat;
    private javax.swing.JTextField tb_cedente_appat;
    private javax.swing.JTextField tb_cedente_nombre;
    private javax.swing.JTextField tb_col_e;
    private javax.swing.JTextField tb_col_n;
    private javax.swing.JTextField tb_col_ne;
    private javax.swing.JTextField tb_col_no;
    private javax.swing.JTextField tb_col_o;
    private javax.swing.JTextField tb_col_s;
    private javax.swing.JTextField tb_col_se;
    private javax.swing.JTextField tb_col_so;
    private javax.swing.JTextField tb_folio;
    private javax.swing.JTextField tb_med_e;
    private javax.swing.JTextField tb_med_n;
    private javax.swing.JTextField tb_med_ne;
    private javax.swing.JTextField tb_med_no;
    private javax.swing.JTextField tb_med_o;
    private javax.swing.JTextField tb_med_s;
    private javax.swing.JTextField tb_med_se;
    private javax.swing.JTextField tb_med_so;
    private javax.swing.JTextField tb_propietario_apmat;
    private javax.swing.JTextField tb_propietario_appat;
    private javax.swing.JTextField tb_propietario_nombre;
    private javax.swing.JTextField tb_testigo_dos_apmat;
    private javax.swing.JTextField tb_testigo_dos_appat;
    private javax.swing.JTextField tb_testigo_dos_nombre;
    private javax.swing.JTextField tb_testigo_tres_apmat;
    private javax.swing.JTextField tb_testigo_tres_appat;
    private javax.swing.JTextField tb_testigo_tres_nombre;
    private javax.swing.JTextField tb_testigo_uno_apmat;
    private javax.swing.JTextField tb_testigo_uno_appat;
    private javax.swing.JTextField tb_testigo_uno_nombre;
    private javax.swing.JTextField tb_ubicacion_terreno;
    // End of variables declaration//GEN-END:variables

   
}
