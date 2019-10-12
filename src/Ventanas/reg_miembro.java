/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ventanas;
import Tablas.Miembro_comisariado_ejidal;
import Tablas.Miembro_consejo_vigilancia;
import comisaria_db.*;
import java.net.UnknownHostException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author MISAEL
 */
public class reg_miembro extends javax.swing.JFrame {

    int opcion;
    public reg_miembro() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        rellenar();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new javax.swing.JLabel();
        tb_CURP = new javax.swing.JTextField();
        lb_curp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tb_nombre = new javax.swing.JTextField();
        tb_ap_pat = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tb_ap_mat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bt_cancelar = new javax.swing.JButton();
        bt_registrar = new javax.swing.JButton();
        bt_limpiar = new javax.swing.JButton();
        lista_elementos = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        label1.setText("TEXT");
        getContentPane().add(label1);
        label1.setBounds(620, 140, 24, 14);
        getContentPane().add(tb_CURP);
        tb_CURP.setBounds(610, 220, 210, 40);

        lb_curp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_curp.setText("CURP");
        getContentPane().add(lb_curp);
        lb_curp.setBounds(520, 230, 40, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("NOMBRE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(510, 300, 60, 20);
        getContentPane().add(tb_nombre);
        tb_nombre.setBounds(610, 290, 210, 40);
        getContentPane().add(tb_ap_pat);
        tb_ap_pat.setBounds(610, 360, 210, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("<html>  <DIV align=\"center\">  <P>APELLIDO   <P>PATERNO</DIV> </html>  ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(510, 370, 60, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("<html>  <DIV align=\"center\">  <P>APELLIDO   <P>MATERNO</DIV> </html>  ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(510, 440, 60, 30);

        tb_ap_mat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_ap_matActionPerformed(evt);
            }
        });
        getContentPane().add(tb_ap_mat);
        tb_ap_mat.setBounds(610, 430, 210, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("<html>  <DIV align=\"center\"><P>OCUPACIÓN</DIV> </html>  ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(500, 510, 70, 20);

        bt_cancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_cancelar.setText("CANCELAR");
        bt_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_cancelar);
        bt_cancelar.setBounds(520, 620, 130, 40);

        bt_registrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_registrar.setText("REGISTRAR");
        bt_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registrarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_registrar);
        bt_registrar.setBounds(660, 620, 120, 40);

        bt_limpiar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_limpiar.setText("LIMPIAR");
        bt_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_limpiar);
        bt_limpiar.setBounds(790, 620, 130, 40);

        lista_elementos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(lista_elementos);
        lista_elementos.setBounds(620, 500, 200, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NM.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -10, 1370, 1100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tb_ap_matActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_ap_matActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_ap_matActionPerformed

    private void bt_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelarActionPerformed
        menu_registro obj = new menu_registro();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_cancelarActionPerformed

    private void bt_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_limpiarActionPerformed
        // LIMPIA TODOS LOS TEXBOX
        tb_CURP.setText("");
        tb_ap_mat.setText("");
        tb_ap_pat.setText("");
        tb_nombre.setText("");
       
    }//GEN-LAST:event_bt_limpiarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        menu_registro obj = new menu_registro();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void bt_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registrarActionPerformed
        // BOTON REGISTRAR
        if(opcion == 1){
            Miembro_comisariado_ejidal mce = new Miembro_comisariado_ejidal();
            mce.setId(tb_CURP.getText().toUpperCase());
            if(mce.Existencia_miembro()){
                JOptionPane.showMessageDialog(null, "EL MIEMBRO YA ESTÁ REGISTRADO");
            }else{
                mce.setNombre(tb_nombre.getText().toUpperCase());
                mce.setApellido_paterno(tb_ap_pat.getText().toUpperCase());
                mce.setApellido_materno(tb_ap_mat.getText().toUpperCase());
                mce.setCargo(lista_elementos.getSelectedItem().toString().toUpperCase());
                try {
                    if(mce.agregar_miembro()){
                        JOptionPane.showMessageDialog(null, "AGREGADO");
                    }else{
                        JOptionPane.showMessageDialog(null, "ERROR");
                    }
                } catch (UnknownHostException ex) {
                    Logger.getLogger(reg_miembro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else{
            Miembro_consejo_vigilancia mcv = new Miembro_consejo_vigilancia();
            mcv.setId(tb_CURP.getText().toUpperCase());
            if(mcv.Existencia_miembro()){
                JOptionPane.showMessageDialog(null, "EL MIEMBRO YA ESTÁ REGISTRADO");
            }else{
                mcv.setNombre(tb_nombre.getText().toUpperCase());
                mcv.setApellido_paterno(tb_ap_pat.getText().toUpperCase());
                mcv.setApellido_materno(tb_ap_mat.getText().toUpperCase());
                mcv.setCargo(lista_elementos.getSelectedItem().toString().toUpperCase());
                try {
                    if(mcv.agregar_miembro()){
                        JOptionPane.showMessageDialog(null, "AGREGADO");
                    }else{
                        JOptionPane.showMessageDialog(null, "ERROR");
                    }
                } catch (UnknownHostException ex) {
                    Logger.getLogger(reg_miembro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
    }//GEN-LAST:event_bt_registrarActionPerformed

    public void rellenar(){
     menu_registro obj = new menu_registro();
     opcion=obj.opcion;
     String[] con_vig={"PRESIDENTE","SECRETARIO 1","SECRETARIO 2","SUPLENTE DE PRESIDENTE","SUPLENTE SECRETARIO 1","SUPLENTE SECRETARIO 2"};
     String[] com_eji={"PRESIDENTE","SECRETARIO","TESORERO","SUPLENTE PRESIDENTE","SUPLENTE SECRETARIO","SUPLENTE TESORERO"};
     //ArrayList<String> el = new ArrayList<>();
     lista_elementos.removeAllItems();
     
        if(opcion==1){
           for(int i=0;i<com_eji.length;i++)
             {
               lista_elementos.addItem(com_eji[i]);
             }  
        }
        else
        {
            if(opcion==2)
            {
             for(int i=0;i<con_vig.length;i++)
             {
               lista_elementos.addItem(con_vig[i]);
             }   
            }
        }
        
        label1.setText(Integer.toString(opcion));
    }
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
            java.util.logging.Logger.getLogger(reg_miembro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reg_miembro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reg_miembro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reg_miembro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reg_miembro().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cancelar;
    private javax.swing.JButton bt_limpiar;
    private javax.swing.JButton bt_registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel lb_curp;
    private javax.swing.JComboBox<String> lista_elementos;
    private javax.swing.JTextField tb_CURP;
    private javax.swing.JTextField tb_ap_mat;
    private javax.swing.JTextField tb_ap_pat;
    private javax.swing.JTextField tb_nombre;
    // End of variables declaration//GEN-END:variables
}
