/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Tablas.Constancia;
import java.awt.Image;
import java.sql.Blob;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author MISAEL
 */
public class Consulta_constancia_especifica extends javax.swing.JFrame {
    private int no_constancia;

    public void setNo_constancia(int no_constancia) {
        this.no_constancia = no_constancia;
    }
    
    public Consulta_constancia_especifica() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        lb_no_folio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lb_fecha_exp = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lb_nombre_prop = new javax.swing.JLabel();
        lb_appat_prop = new javax.swing.JLabel();
        lb_apmat_prop = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lb_tes1 = new javax.swing.JLabel();
        lb_appat_ced = new javax.swing.JLabel();
        lb_nombre_ced = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lb_ubicacion_ter = new javax.swing.JLabel();
        lb_tes_ce = new javax.swing.JLabel();
        lb_tipo_ter = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lb_n_ter = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        lb_so_ter = new javax.swing.JLabel();
        lb_s_ter = new javax.swing.JLabel();
        lb_e_ter = new javax.swing.JLabel();
        lb_o_ter = new javax.swing.JLabel();
        lb_ne_ter = new javax.swing.JLabel();
        lb_no_ter = new javax.swing.JLabel();
        lb_se_ter = new javax.swing.JLabel();
        lb_socol_ter = new javax.swing.JLabel();
        lb_secol_ter = new javax.swing.JLabel();
        lb_nocol_ter = new javax.swing.JLabel();
        lb_necol_ter = new javax.swing.JLabel();
        lb_ocol_ter = new javax.swing.JLabel();
        lb_ecol_ter = new javax.swing.JLabel();
        lb_scol_ter = new javax.swing.JLabel();
        lb_ncol_ter = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        lb_apmat_ced = new javax.swing.JLabel();
        lb_tes2 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lb_pre_ce = new javax.swing.JLabel();
        lb_sec_ce = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        lb_pre_cv = new javax.swing.JLabel();
        lb_sec1_cv = new javax.swing.JLabel();
        lb_sec2_cv = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        lb_nota = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        jSeparator24 = new javax.swing.JSeparator();
        jLabel35 = new javax.swing.JLabel();
        bt_aceptar = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo1.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(400, 60));

        jPanel2.setMaximumSize(new java.awt.Dimension(520, 2372));
        jPanel2.setMinimumSize(new java.awt.Dimension(520, 2372));
        jPanel2.setPreferredSize(new java.awt.Dimension(520, 2372));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 488, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 153, 488, 10));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("No. Folio:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 119, -1, -1));

        lb_no_folio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_no_folio.setText("#");
        jPanel2.add(lb_no_folio, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 119, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Fecha de Expedición: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 119, -1, -1));

        lb_fecha_exp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_fecha_exp.setText("#");
        jPanel2.add(lb_fecha_exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 119, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("<html> <head> </head> <body> <div align=\"center\"><p>DATOS DEL</p><p> PROPIETARIO</p></div> </body> </html>  ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Nombre:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 251, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Apellido paterno:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 291, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Apellido materno:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 331, -1, -1));

        lb_nombre_prop.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_nombre_prop.setText("#");
        jPanel2.add(lb_nombre_prop, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 251, -1, -1));

        lb_appat_prop.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_appat_prop.setText("#");
        jPanel2.add(lb_appat_prop, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 291, -1, -1));

        lb_apmat_prop.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_apmat_prop.setText("#");
        jPanel2.add(lb_apmat_prop, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 331, -1, -1));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 396, 488, 10));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel8.setText("<html> <head> </head> <body> <div align=\"center\"><p>CONSEJO DE</p><p>VIGILANCIA</p></div> </body> </html>  ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1530, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Nombre:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 494, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Apellido paterno:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 534, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Apellido materno:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 571, -1, -1));

        lb_tes1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_tes1.setText("#");
        jPanel2.add(lb_tes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 1210, -1, -1));

        lb_appat_ced.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_appat_ced.setText("#");
        jPanel2.add(lb_appat_ced, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 534, -1, -1));

        lb_nombre_ced.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_nombre_ced.setText("#");
        jPanel2.add(lb_nombre_ced, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 494, -1, -1));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1950, 530, 10));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("<html> <head> </head> <body> <div align=\"center\"><p>DATOS DEL</p><p> CEDENTE</p></div> </body> </html>  ");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Ubicación:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 739, -1, -1));

        lb_ubicacion_ter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_ubicacion_ter.setText("#");
        jPanel2.add(lb_ubicacion_ter, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 739, -1, -1));

        lb_tes_ce.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_tes_ce.setText("#");
        jPanel2.add(lb_tes_ce, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 1450, -1, -1));

        lb_tipo_ter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_tipo_ter.setText("#");
        jPanel2.add(lb_tipo_ter, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 779, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Colindancia");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 830, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Norte:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 870, 50, -1));

        lb_n_ter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_n_ter.setText("#");
        jPanel2.add(lb_n_ter, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 870, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Sur:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 900, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Medidas");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 830, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Este:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 930, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Oeste:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 960, -1, -1));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 820, 10, 280));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Suroeste:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1080, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Noreste:");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 990, 70, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Noroeste:");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1020, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Sureste:");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1050, -1, -1));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 890, 500, 10));
        jPanel2.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 920, 500, 10));
        jPanel2.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 950, 500, 10));
        jPanel2.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 980, 500, 10));
        jPanel2.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1010, 500, 10));
        jPanel2.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1040, 500, 10));
        jPanel2.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1070, 500, 10));

        jSeparator17.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 820, 10, 280));

        jSeparator18.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 820, 10, 280));

        jSeparator19.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 820, 10, 280));

        lb_so_ter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_so_ter.setText("#");
        jPanel2.add(lb_so_ter, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 1080, -1, -1));

        lb_s_ter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_s_ter.setText("#");
        jPanel2.add(lb_s_ter, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 900, -1, -1));

        lb_e_ter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_e_ter.setText("#");
        jPanel2.add(lb_e_ter, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 930, -1, -1));

        lb_o_ter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_o_ter.setText("#");
        jPanel2.add(lb_o_ter, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 960, -1, -1));

        lb_ne_ter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_ne_ter.setText("#");
        jPanel2.add(lb_ne_ter, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 990, -1, -1));

        lb_no_ter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_no_ter.setText("#");
        jPanel2.add(lb_no_ter, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 1020, -1, -1));

        lb_se_ter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_se_ter.setText("#");
        jPanel2.add(lb_se_ter, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 1050, -1, -1));

        lb_socol_ter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_socol_ter.setText("#");
        lb_socol_ter.setMaximumSize(new java.awt.Dimension(20, 290));
        jPanel2.add(lb_socol_ter, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 1075, 290, 20));

        lb_secol_ter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_secol_ter.setText("#");
        lb_secol_ter.setMaximumSize(new java.awt.Dimension(20, 290));
        jPanel2.add(lb_secol_ter, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 1045, 290, 20));

        lb_nocol_ter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_nocol_ter.setText("#");
        lb_nocol_ter.setMaximumSize(new java.awt.Dimension(20, 290));
        jPanel2.add(lb_nocol_ter, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 1015, 290, 20));

        lb_necol_ter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_necol_ter.setText("#");
        lb_necol_ter.setMaximumSize(new java.awt.Dimension(20, 290));
        jPanel2.add(lb_necol_ter, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 985, 290, 20));

        lb_ocol_ter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_ocol_ter.setText("#");
        lb_ocol_ter.setMaximumSize(new java.awt.Dimension(20, 290));
        jPanel2.add(lb_ocol_ter, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 955, 290, 20));

        lb_ecol_ter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_ecol_ter.setText("#");
        lb_ecol_ter.setMaximumSize(new java.awt.Dimension(20, 290));
        jPanel2.add(lb_ecol_ter, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 925, 290, 20));

        lb_scol_ter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_scol_ter.setText("#");
        lb_scol_ter.setMaximumSize(new java.awt.Dimension(20, 290));
        jPanel2.add(lb_scol_ter, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 895, 290, 20));

        lb_ncol_ter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_ncol_ter.setText("#");
        lb_ncol_ter.setMaximumSize(new java.awt.Dimension(20, 290));
        lb_ncol_ter.setPreferredSize(new java.awt.Dimension(20, 290));
        jPanel2.add(lb_ncol_ter, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 865, 290, 20));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 641, 488, 10));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setText("<html> <head> </head> <body> <div align=\"center\"><p>DATOS DEL</p><p>TERRENO</p></div> </body> </html>  ");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 660, -1, -1));

        lb_apmat_ced.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_apmat_ced.setText("#");
        jPanel2.add(lb_apmat_ced, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 574, -1, -1));

        lb_tes2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_tes2.setText("#");
        jPanel2.add(lb_tes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1210, -1, -1));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1120, 510, 10));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel26.setText("<html> <head> </head> <body> <div align=\"center\"><p>TESTIGOS</p></div> </body> </html>  ");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1130, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("Tipo de terreno:");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 779, -1, -1));

        lb_pre_ce.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_pre_ce.setText("#");
        jPanel2.add(lb_pre_ce, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1450, -1, -1));

        lb_sec_ce.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_sec_ce.setText("#");
        jPanel2.add(lb_sec_ce, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1450, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setText("Presidente");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1410, -1, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setText("Secretario");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 1410, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setText("Tesorero");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 1410, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("<html> <head> </head> <body> <div align=\"center\"><p>RESPONSABLES</p></div> </body> </html>  ");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1300, -1, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel29.setText("COMITÉ EJIDAL");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 1360, -1, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel32.setText("Presidente");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1600, -1, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel33.setText("Secretario 1");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 1600, -1, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setText("Secretario 2");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 1600, -1, -1));

        lb_pre_cv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_pre_cv.setText("#");
        jPanel2.add(lb_pre_cv, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1630, -1, -1));

        lb_sec1_cv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_sec1_cv.setText("#");
        jPanel2.add(lb_sec1_cv, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1630, -1, -1));

        lb_sec2_cv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_sec2_cv.setText("#");
        jPanel2.add(lb_sec2_cv, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 1630, -1, -1));
        jPanel2.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1280, 510, 10));

        lb_nota.setText("#");
        lb_nota.setMaximumSize(new java.awt.Dimension(440, 150));
        lb_nota.setMinimumSize(new java.awt.Dimension(440, 150));
        jPanel2.add(lb_nota, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1730, 60, 20));
        jPanel2.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1700, 530, 10));
        jPanel2.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 820, 500, -1));
        jPanel2.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 860, 500, 10));
        jPanel2.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1100, 500, 10));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DC.jpg"))); // NOI18N
        jLabel35.setText("jLabel35");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane1.setViewportView(jPanel2);

        bt_aceptar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_aceptar.setText("ACEPTAR");
        bt_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_aceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(bt_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_aceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_aceptarActionPerformed
        this.dispose();
        //JOptionPane.showMessageDialog(null, this.no_constancia);
    }//GEN-LAST:event_bt_aceptarActionPerformed

    
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
            java.util.logging.Logger.getLogger(Consulta_constancia_especifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta_constancia_especifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta_constancia_especifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta_constancia_especifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta_constancia_especifica().setVisible(true);
            }
        });
    }
    public void Rellenar_campos(){
        ArrayList<String[]> Lista_constancias;
            ArrayList<String[]> Lista_testigos;
            ArrayList<String[]> Lista_con_vig;
            ArrayList<String[]> Lista_com_eji;
            Blob croquis;
            
            Constancia constancia = new Constancia();
            Lista_constancias = constancia.Buscar_todo(2,this.no_constancia);
            Lista_testigos = constancia.Buscar_testigos(2,this.no_constancia);
            Lista_con_vig = constancia.Buscar_con_vig(2,this.no_constancia);
            Lista_com_eji = constancia.Buscar_com_ejidal(2,this.no_constancia);
            croquis = constancia.Buscar_croquis(this.no_constancia);
            
            //JOptionPane.showMessageDialog(rootPane, Lista_constancias.get(0)[14]);
            
            lb_no_folio.setText(Lista_constancias.get(0)[0]);
            lb_fecha_exp.setText(Lista_constancias.get(0)[1]);
            lb_nombre_prop.setText(Lista_constancias.get(0)[7]);
            lb_appat_prop.setText(Lista_constancias.get(0)[8]);
            lb_apmat_prop.setText(Lista_constancias.get(0)[9]);
            lb_nombre_ced.setText(Lista_constancias.get(0)[3]);
            lb_appat_ced.setText(Lista_constancias.get(0)[4]);
            lb_apmat_ced.setText(Lista_constancias.get(0)[5]);
            lb_ubicacion_ter.setText(Lista_constancias.get(0)[11]);
            lb_tipo_ter.setText(Lista_constancias.get(0)[12]);
            lb_n_ter.setText(Lista_constancias.get(0)[13]);
            lb_ncol_ter.setText(Lista_constancias.get(0)[14]);
            lb_s_ter.setText(Lista_constancias.get(0)[15]);
            lb_scol_ter.setText(Lista_constancias.get(0)[16]);
            lb_e_ter.setText(Lista_constancias.get(0)[17]);
            lb_ecol_ter.setText(Lista_constancias.get(0)[18]);
            lb_o_ter.setText(Lista_constancias.get(0)[19]);
            lb_ocol_ter.setText(Lista_constancias.get(0)[20]);
            lb_ne_ter.setText(Lista_constancias.get(0)[21]);
            lb_necol_ter.setText(Lista_constancias.get(0)[22]);
            lb_no_ter.setText(Lista_constancias.get(0)[23]);
            lb_nocol_ter.setText(Lista_constancias.get(0)[24]);
            lb_se_ter.setText(Lista_constancias.get(0)[25]);
            lb_secol_ter.setText(Lista_constancias.get(0)[26]);
            lb_so_ter.setText(Lista_constancias.get(0)[27]);
            lb_socol_ter.setText(Lista_constancias.get(0)[28]);
            try{
                 if(croquis != null){
                     byte[] data = croquis.getBytes(1,(int)croquis.length());
                     Image imga=javax.imageio.ImageIO.read(croquis.getBinaryStream());
                     ImageIcon img = new ImageIcon(imga.getScaledInstance(60, 60, 0)); //corregir el renderizado
                     
                 }
                 
                }catch(Exception ex){
                    
                    JOptionPane.showMessageDialog(null, ex);
                }
            String aux = "<html> <head> </head> <body> <div align=\"center\"><p>"+Lista_testigos.get(0)[1]+"</p>"+Lista_testigos.get(0)[2]+" "+Lista_testigos.get(0)[3]+"<p></p></div> </body> </html>";
            lb_tes1.setText(aux);
            aux = "<html> <head> </head> <body> <div align=\"center\"><p>"+Lista_testigos.get(1)[1]+"</p>"+Lista_testigos.get(1)[2]+" "+Lista_testigos.get(1)[3]+"<p></p></div> </body> </html>";
            lb_tes2.setText(aux);
            
            aux = "<html> <head> </head> <body> <div align=\"center\"><p>"+Lista_com_eji.get(0)[1]+"</p>"+Lista_com_eji.get(0)[2]+" "+Lista_com_eji.get(0)[3]+"<p></p></div> </body> </html>";
            lb_pre_ce.setText(aux);
            aux = "<html> <head> </head> <body> <div align=\"center\"><p>"+Lista_com_eji.get(1)[1]+"</p>"+Lista_com_eji.get(1)[2]+" "+Lista_com_eji.get(1)[3]+"<p></p></div> </body> </html>";
            lb_sec_ce.setText(aux);
            aux = "<html> <head> </head> <body> <div align=\"center\"><p>"+Lista_com_eji.get(2)[1]+"</p>"+Lista_com_eji.get(2)[2]+" "+Lista_com_eji.get(2)[3]+"<p></p></div> </body> </html>";
            lb_tes_ce.setText(aux);
            
            aux = "<html> <head> </head> <body> <div align=\"center\"><p>"+Lista_con_vig.get(0)[1]+"</p>"+Lista_con_vig.get(0)[2]+" "+Lista_con_vig.get(0)[3]+"<p></p></div> </body> </html>";
            lb_pre_cv.setText(aux);
            aux = "<html> <head> </head> <body> <div align=\"center\"><p>"+Lista_con_vig.get(1)[1]+"</p>"+Lista_con_vig.get(1)[2]+" "+Lista_con_vig.get(1)[3]+"<p></p></div> </body> </html>";
            lb_sec1_cv.setText(aux);
            aux = "<html> <head> </head> <body> <div align=\"center\"><p>"+Lista_con_vig.get(2)[1]+"</p>"+Lista_con_vig.get(2)[2]+" "+Lista_con_vig.get(2)[3]+"<p></p></div> </body> </html>";
            lb_sec2_cv.setText(aux);
            
            lb_nota.setText(Lista_constancias.get(0)[29]);
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_aceptar;
    private javax.swing.JInternalFrame jInternalFrame1;
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
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lb_apmat_ced;
    private javax.swing.JLabel lb_apmat_prop;
    private javax.swing.JLabel lb_appat_ced;
    private javax.swing.JLabel lb_appat_prop;
    private javax.swing.JLabel lb_e_ter;
    private javax.swing.JLabel lb_ecol_ter;
    private javax.swing.JLabel lb_fecha_exp;
    private javax.swing.JLabel lb_n_ter;
    private javax.swing.JLabel lb_ncol_ter;
    private javax.swing.JLabel lb_ne_ter;
    private javax.swing.JLabel lb_necol_ter;
    private javax.swing.JLabel lb_no_folio;
    private javax.swing.JLabel lb_no_ter;
    private javax.swing.JLabel lb_nocol_ter;
    private javax.swing.JLabel lb_nombre_ced;
    private javax.swing.JLabel lb_nombre_prop;
    private javax.swing.JLabel lb_nota;
    private javax.swing.JLabel lb_o_ter;
    private javax.swing.JLabel lb_ocol_ter;
    private javax.swing.JLabel lb_pre_ce;
    private javax.swing.JLabel lb_pre_cv;
    private javax.swing.JLabel lb_s_ter;
    private javax.swing.JLabel lb_scol_ter;
    private javax.swing.JLabel lb_se_ter;
    private javax.swing.JLabel lb_sec1_cv;
    private javax.swing.JLabel lb_sec2_cv;
    private javax.swing.JLabel lb_sec_ce;
    private javax.swing.JLabel lb_secol_ter;
    private javax.swing.JLabel lb_so_ter;
    private javax.swing.JLabel lb_socol_ter;
    private javax.swing.JLabel lb_tes1;
    private javax.swing.JLabel lb_tes2;
    private javax.swing.JLabel lb_tes_ce;
    private javax.swing.JLabel lb_tipo_ter;
    private javax.swing.JLabel lb_ubicacion_ter;
    // End of variables declaration//GEN-END:variables
}
