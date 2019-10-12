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
public class Terrenos_de_propietario {
    private int id_propietario;
    private int id_terreno;
    
    private Conexion c = new Conexion();
    private Statement stm;
    private ResultSet rs; 

    public int getId_propietario() {
        return id_propietario;
    }

    public void setId_propietario(int id_propietario) {
        this.id_propietario = id_propietario;
    }

    public int getId_terreno() {
        return id_terreno;
    }

    public void setId_terreno(int id_terreno) {
        this.id_terreno = id_terreno;
    }
    
    public Terrenos_de_propietario(){
        this.id_propietario=0;
        this.id_terreno=0;
    }
    
    public boolean Registar(){
        try {
            String sql="insert into terrenos_de_propietario (id_propietario,id_terreno) "
                    + "values(?,?)";
            c.conectar();
            PreparedStatement ps = c.conex.prepareStatement(sql);
            ps.setInt(1, this.id_propietario);
            ps.setInt(2, this.id_terreno);
            ps.execute();
            ps.close();
            return true;
        } catch (SQLException ex) {
            return false;
        }
        
    }
    
}
