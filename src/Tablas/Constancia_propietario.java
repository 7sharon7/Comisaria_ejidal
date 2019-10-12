/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import comisaria_db.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author MISAEL
 */
public class Constancia_propietario {
   private int folio_constancia;
   private int id_propietario;
   
   private Conexion c = new Conexion();
    private Statement stm;
    private ResultSet rs; 

    public int getFolio_constancia() {
        return folio_constancia;
    }

    public void setFolio_constancia(int folio_constancia) {
        this.folio_constancia = folio_constancia;
    }

    public int getId_propietario() {
        return id_propietario;
    }

    public void setId_propietario(int id_propietario) {
        this.id_propietario = id_propietario;
    }
    
    public Constancia_propietario(){
        this.folio_constancia =0;
        this.id_propietario=0;
    }
    
    public boolean Registrar(){
        try {
            String sql = "insert into constancias_propietario (id_propietario,no_folio) "
                    + "values (?,?)";
            c.conectar();
            PreparedStatement ps = c.conex.prepareStatement(sql);
            ps.setInt(1, this.id_propietario);
            ps.setInt(2, this.folio_constancia);
            ps.execute();
            ps.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"CONSTANCIA_PROPIETARIO "+ex);
            return false;
        }
    }
}
