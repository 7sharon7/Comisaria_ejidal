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

/**
 *
 * @author MISAEL
 */
public class Com_eji_autoriza {
    private int id_autoriza;
    private int folio_constancia;
    
     private Conexion c = new Conexion();
    private Statement stm;
    private ResultSet rs; 

    public int getId_autoriza() {
        return id_autoriza;
    }

    public void setId_autoriza(int id_autoriza) {
        this.id_autoriza = id_autoriza;
    }



    public int getFolio_constancia() {
        return folio_constancia;
    }

    public void setFolio_constancia(int folio_constancia) {
        this.folio_constancia = folio_constancia;
    }
    
    public Com_eji_autoriza(){
        this.id_autoriza = 0;
        this.folio_constancia = 0;
    }
    
    public boolean Registar(){
        try {
            String sql = "insert into com_eji_autoriza (id_miembro_ejidal,no_folio) "
                    + "values (?,?)";
            c.conectar();
            PreparedStatement ps = c.conex.prepareStatement(sql);
            ps.setInt(1, this.id_autoriza);
            ps.setInt(2, this.folio_constancia);
            ps.execute();
            ps.close();
            return true;
        } catch (SQLException ex) {
            return false;
        }
        
    }
    
    
    
    /*public boolean Registar(){
        try {
            
        } catch (SQLException ex) {
        }
        return true;
    }
    
    public boolean Eliminar(){
        try {
            
        } catch (SQLException ex) {
        }
        return true;
    }
    
    public boolean Modificar(){
        try {
            
        } catch (SQLException ex) {
        }
        return true;
    }
    
    public boolean Buscar(){
        try {
            
        } catch (SQLException ex) {
        }
        return true;
    }*/
}
