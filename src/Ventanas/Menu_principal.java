
package Ventanas;

public class Menu_principal extends javax.swing.JFrame {

    public Menu_principal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        REGRESAR = new javax.swing.JButton();
        bt_nuevo_registro = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        bt_consultas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("COMISARIA EJIDAL");
        setAlwaysOnTop(true);
        setFocusableWindowState(false);
        setMinimumSize(new java.awt.Dimension(1366, 725));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        REGRESAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        REGRESAR.setText("CERRAR");
        REGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGRESARActionPerformed(evt);
            }
        });
        getContentPane().add(REGRESAR);
        REGRESAR.setBounds(590, 510, 130, 23);

        bt_nuevo_registro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REG2.png"))); // NOI18N
        bt_nuevo_registro.setMnemonic(' ');
        bt_nuevo_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_nuevo_registroActionPerformed(evt);
            }
        });
        getContentPane().add(bt_nuevo_registro);
        bt_nuevo_registro.setBounds(220, 240, 130, 80);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MOD1.png"))); // NOI18N
        getContentPane().add(jButton1);
        jButton1.setBounds(490, 240, 130, 80);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ELI1.png"))); // NOI18N
        getContentPane().add(jButton2);
        jButton2.setBounds(740, 240, 140, 80);

        bt_consultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CON1.png"))); // NOI18N
        bt_consultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_consultasActionPerformed(evt);
            }
        });
        getContentPane().add(bt_consultas);
        bt_consultas.setBounds(1030, 240, 140, 80);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondocm2.111.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 2450, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void REGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGRESARActionPerformed
        cerrar_formulario();
    }//GEN-LAST:event_REGRESARActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrar_formulario();
    }//GEN-LAST:event_formWindowClosing

    private void bt_nuevo_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_nuevo_registroActionPerformed
      menu_registro obj = new menu_registro();
        //reg_miembro obj = new reg_miembro();
       obj.setVisible(true);
        dispose();
       
    }//GEN-LAST:event_bt_nuevo_registroActionPerformed

    private void bt_consultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_consultasActionPerformed
        Consultas_constancias_existentes obj = new Consultas_constancias_existentes();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bt_consultasActionPerformed


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
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_principal().setVisible(true);
                new Menu_principal().setAlwaysOnTop(false);
                new Menu_principal().setExtendedState(MAXIMIZED_BOTH);
                
            }
        });
    }
    private void cerrar_formulario(){
       metodos_generales obj = new metodos_generales();
       obj.cerrar_formulario();
       dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton REGRESAR;
    private javax.swing.JButton bt_consultas;
    private javax.swing.JButton bt_nuevo_registro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
