
package Ventanas;



import javax.swing.JOptionPane;
import comisaria_db.*;
import Tablas.Usuario;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Tablas.Constancia;


public class inicio_sesion extends javax.swing.JFrame {


    public inicio_sesion() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icono_1 = new javax.swing.JLabel();
        icono_2 = new javax.swing.JLabel();
        Texto2 = new javax.swing.JLabel();
        bt_acceder = new javax.swing.JButton();
        tb_usuario = new javax.swing.JTextField();
        bt_salir = new javax.swing.JButton();
        tb_contraseña = new javax.swing.JPasswordField();
        bt_reg_usu = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COMISARIA EJIDAL");
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1366, 725));
        getContentPane().setLayout(null);

        icono_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/us.png"))); // NOI18N
        getContentPane().add(icono_1);
        icono_1.setBounds(540, 320, 50, 50);

        icono_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/candado.png"))); // NOI18N
        getContentPane().add(icono_2);
        icono_2.setBounds(540, 400, 50, 70);

        Texto2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Texto2.setText("INGRESE USUARIO Y CONTRASEÑA PARA CONTINUAR");
        Texto2.setFocusable(false);
        getContentPane().add(Texto2);
        Texto2.setBounds(420, 200, 500, 83);

        bt_acceder.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_acceder.setText("INGRESAR");
        bt_acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_accederActionPerformed(evt);
            }
        });
        getContentPane().add(bt_acceder);
        bt_acceder.setBounds(660, 570, 110, 23);

        tb_usuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tb_usuario.setText("misael");
        getContentPane().add(tb_usuario);
        tb_usuario.setBounds(610, 330, 177, 30);

        bt_salir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_salir.setText("SALIR");
        bt_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salirActionPerformed(evt);
            }
        });
        getContentPane().add(bt_salir);
        bt_salir.setBounds(960, 570, 110, 20);

        tb_contraseña.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tb_contraseña.setText("1111");
        getContentPane().add(tb_contraseña);
        tb_contraseña.setBounds(610, 420, 177, 30);

        bt_reg_usu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addusss.png"))); // NOI18N
        bt_reg_usu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bt_reg_usu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_reg_usuActionPerformed(evt);
            }
        });
        getContentPane().add(bt_reg_usu);
        bt_reg_usu.setBounds(380, 540, 100, 80);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(70, 510, 73, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondocm2.111.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1360, 1080);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_accederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_accederActionPerformed
        if(tb_usuario.getText().equals("")||tb_contraseña.getText().equals("")){
            JOptionPane.showMessageDialog(null,"ASEGURESE DE LLENAR TODOS LOS CAMPOS","ERROR",1);
        }else{
            Usuario u = new Usuario();
            u.setNom_usu(tb_usuario.getText());
            u.setPassword(tb_contraseña.getText());
            try {
                if(u.ingresar()){
                    //System.out.println("Entro");//borrar
                    JOptionPane.showMessageDialog(null, "BIENVENIDO "+u.getNom_usu().toUpperCase());
                    Menu_principal obj = new Menu_principal();
                    obj.setVisible(true);
                    this.hide();
                }else{
                    JOptionPane.showMessageDialog(null, "ERROR USUARIO/CONTRASEÑA");
                }
            } catch (UnknownHostException ex) {
                Logger.getLogger(inicio_sesion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_bt_accederActionPerformed

    private void bt_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salirActionPerformed
         System.exit(0);
    }//GEN-LAST:event_bt_salirActionPerformed

    private void bt_reg_usuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_reg_usuActionPerformed
     registro_usuario obj = new registro_usuario();
     obj.setVisible(true);
     this.hide();
    }//GEN-LAST:event_bt_reg_usuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Consulta_constancia_especifica obj = new Consulta_constancia_especifica();
        obj.setNo_constancia(1);
        obj.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(inicio_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                inicio_sesion obj = new inicio_sesion();
               // obj.setExtendedState(MAXIMIZED_BOTH);
                obj.setVisible(true);
                //obj.setAlwaysOnTop(false);    z
                /*ArrayList<String[]> lista = new ArrayList();
                Constancia obj1 = new Constancia();
                lista = obj1.Buscar_todo();
                if(lista == null){
                
                JOptionPane.showMessageDialog(null, "exito");
                }else{
                    JOptionPane.showMessageDialog(null, "e");
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(lista.get(i)[0]);
                        System.out.println(lista.get(i)[1]);
                        System.out.println(lista.get(i)[2]);
                        System.out.println(lista.get(i)[3]);
                        System.out.println(lista.get(i)[4]);
                        System.out.println(lista.get(i)[5]);
                        System.out.println(lista.get(i)[6]);
                        System.out.println(lista.get(i)[7]);
                    }
                }*/
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Texto2;
    private javax.swing.JButton bt_acceder;
    private javax.swing.JButton bt_reg_usu;
    private javax.swing.JButton bt_salir;
    private javax.swing.JLabel icono_1;
    private javax.swing.JLabel icono_2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField tb_contraseña;
    private javax.swing.JTextField tb_usuario;
    // End of variables declaration//GEN-END:variables
}
