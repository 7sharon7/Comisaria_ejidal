/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

/**
 *
 * @author MISAEL
 */

public class menu_registro extends javax.swing.JFrame {

   public static int opcion=0;
    public menu_registro() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_regresar = new javax.swing.JButton();
        bt_comi_vig = new javax.swing.JButton();
        bt_com_ejidal = new javax.swing.JButton();
        bt_constancia = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 725));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        bt_regresar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_regresar.setText("REGRESAR");
        bt_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_regresarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_regresar);
        bt_regresar.setBounds(600, 510, 120, 50);

        bt_comi_vig.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_comi_vig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NMCDV1.png"))); // NOI18N
        bt_comi_vig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_comi_vigActionPerformed(evt);
            }
        });
        getContentPane().add(bt_comi_vig);
        bt_comi_vig.setBounds(560, 260, 200, 190);

        bt_com_ejidal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_com_ejidal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nmce2.png"))); // NOI18N
        bt_com_ejidal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_com_ejidalActionPerformed(evt);
            }
        });
        getContentPane().add(bt_com_ejidal);
        bt_com_ejidal.setBounds(290, 260, 200, 190);

        bt_constancia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_constancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NCS1.png"))); // NOI18N
        bt_constancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_constanciaActionPerformed(evt);
            }
        });
        getContentPane().add(bt_constancia);
        bt_constancia.setBounds(830, 260, 200, 190);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondocm2.111.jpg"))); // NOI18N
        jLabel1.setText("j");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 1373, 1100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_regresarActionPerformed
        Menu_principal obj = new Menu_principal();
        obj.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_bt_regresarActionPerformed

    private void bt_comi_vigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_comi_vigActionPerformed
         opcion=2;
        reg_miembro obj = new reg_miembro();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_comi_vigActionPerformed

    private void bt_com_ejidalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_com_ejidalActionPerformed
        opcion=1;
        System.out.println(String.valueOf(opcion));
        reg_miembro obj = new reg_miembro();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_com_ejidalActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO CUANDO EL FORMULARIO REGRESA A LA VENTANA ANTERIOR
        Menu_principal obj = new Menu_principal();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void bt_constanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_constanciaActionPerformed
        // TODO add your handling code here:
        nueva_constancia obj = new nueva_constancia();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_constanciaActionPerformed

    
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
            java.util.logging.Logger.getLogger(menu_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_com_ejidal;
    private javax.swing.JButton bt_comi_vig;
    private javax.swing.JButton bt_constancia;
    private javax.swing.JButton bt_regresar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
