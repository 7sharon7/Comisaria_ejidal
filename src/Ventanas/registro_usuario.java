package Ventanas;

import javax.swing.JOptionPane;
import comisaria_db.*;
import Tablas.Usuario;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author MISAEL
 */
public class registro_usuario extends javax.swing.JFrame {
    
    int con_click=0;
    String aux_usuario = "";
    String aux_contraseña="";
    
    public registro_usuario() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        lb_mensaje.setVisible(false); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tb_usuario = new javax.swing.JTextField();
        tb_contraseña = new javax.swing.JTextField();
        bt_registrar = new javax.swing.JButton();
        bt_regresar = new javax.swing.JButton();
        lb_mensaje = new javax.swing.JLabel();
        lb_usuario = new javax.swing.JLabel();
        lb_cont = new javax.swing.JLabel();
        lb_confirmar = new javax.swing.JLabel();
        tb_con_contra = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);
        getContentPane().add(tb_usuario);
        tb_usuario.setBounds(680, 240, 120, 30);
        getContentPane().add(tb_contraseña);
        tb_contraseña.setBounds(680, 330, 120, 30);

        bt_registrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_registrar.setText("REGISTRAR");
        bt_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registrarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_registrar);
        bt_registrar.setBounds(660, 560, 150, 23);

        bt_regresar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_regresar.setText("REGRESAR");
        bt_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_regresarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_regresar);
        bt_regresar.setBounds(490, 560, 120, 23);

        lb_mensaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_mensaje.setText("<html> \n<DIV align=\"center\">\n <P>POR FAVOR, INICIE SESIÓN CON UN USUARIO\n <P>VÁLIDO PARA COMPLETAR SU REGISTRO.\n</DIV>\n</html> \n");
        lb_mensaje.setFocusable(false);
        getContentPane().add(lb_mensaje);
        lb_mensaje.setBounds(940, 310, 280, 120);

        lb_usuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_usuario.setText("USUARIO");
        getContentPane().add(lb_usuario);
        lb_usuario.setBounds(570, 250, 60, 20);

        lb_cont.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_cont.setText("INGRESE CONTRASEÑA");
        getContentPane().add(lb_cont);
        lb_cont.setBounds(500, 330, 140, 30);

        lb_confirmar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_confirmar.setText("CONFIRME CONTRASEÑA");
        getContentPane().add(lb_confirmar);
        lb_confirmar.setBounds(500, 430, 160, 30);
        getContentPane().add(tb_con_contra);
        tb_con_contra.setBounds(680, 430, 120, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NU.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1370, 1080);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrar_formulario();
    }//GEN-LAST:event_formWindowClosing

    private void bt_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_regresarActionPerformed
        cerrar_formulario();
    }//GEN-LAST:event_bt_regresarActionPerformed

    private void bt_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registrarActionPerformed
        Lector l = new Lector();
        
        con_click +=1;
       
        if(con_click ==1)//GUARDAR DATOS
        {
            if(tb_usuario.getText().equals("") || tb_contraseña.getText().equals("") || tb_con_contra.getText().equals(""))//VERIFICA QUE TODOS LOS CAMPOS ESTÉN LLENOS
            {
                JOptionPane.showMessageDialog(null,"ASEGURESE DE LLENAR TODOS LOS CAMPOS","ERROR",1);
                con_click =0;
            }
            else
            {
                 if(tb_contraseña.getText().equals(tb_con_contra.getText()))// VERIFICA QUE LOS CAMPOS DE CONTRASEÑA SEAN IGUAL
                {
                    Usuario u = new Usuario();
                    u.setNom_usu(tb_usuario.getText().trim());
                    if(u.existencia_usuario()==0)
                    {
                     lb_mensaje.setVisible(true);
                     aux_usuario = tb_usuario.getText();
                     aux_contraseña =  tb_contraseña.getText();
                     tb_usuario.setText("");
                     tb_contraseña.setText(""); 
                     bt_registrar.setText("INICIAR SESIÓN");
                     lb_confirmar.setVisible(false);
                     tb_con_contra.setVisible(false);
                    }
                    else
                    {
                     JOptionPane.showMessageDialog(null,"NOMBRE DE USUARIO NO DISPONIBLE","ERROR",1);
                     con_click =0;
                    }
                }
                else
                 {
                     JOptionPane.showMessageDialog(null,"ASEGURESE DE TENER LA MISMA CONTRASEÑA EN AMBOS CAMPOS","ERROR",1);
                     con_click =0;
                 }
            }
        }
        
        if(con_click==2)//INICIAR SESIÓN
        {
            if(tb_usuario.getText().equals("")||tb_contraseña.getText().equals(""))//VERIFICA QUE TODOS LOS CAMPOS ESTÉN LLENOS
            {
                 JOptionPane.showMessageDialog(null,"ASEGURESE DE LLENAR TODOS LOS CAMPOS","ERROR",1);
                 con_click =1;
            }
            else
            {
                Usuario u = new Usuario();
                u.setNom_usu(tb_usuario.getText());
                u.setPassword(tb_contraseña.getText());
                try {
                    if(u.ingresar())
                    {
                        u.setNom_usu(aux_usuario);
                        u.setPassword(aux_contraseña);
                        if(u.agregar_usuario())//MANDA A LLAMAR AL MÉTODO PARA REGISTRAR
                        {
                            JOptionPane.showMessageDialog(null, "REGISTRADO CON EXITO");
                            cerrar_formulario();
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "ERROR AL REGISTRAR USUARIO","ERROR",1);
                            con_click =1;
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "ERROR USUARIO/CONTRASEÑA");
                        con_click =1;
                    }
                } catch (UnknownHostException ex) {
                    Logger.getLogger(registro_usuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_bt_registrarActionPerformed


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
            java.util.logging.Logger.getLogger(registro_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registro_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registro_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registro_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registro_usuario().setVisible(true);
            }
        });
    }
    private void cerrar_formulario(){
       metodos_generales obj = new metodos_generales();
       obj.cerrar_formulario();
       dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_registrar;
    private javax.swing.JButton bt_regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_confirmar;
    private javax.swing.JLabel lb_cont;
    private javax.swing.JLabel lb_mensaje;
    private javax.swing.JLabel lb_usuario;
    private javax.swing.JTextField tb_con_contra;
    private javax.swing.JTextField tb_contraseña;
    private javax.swing.JTextField tb_usuario;
    // End of variables declaration//GEN-END:variables
}
