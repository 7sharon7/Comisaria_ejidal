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
public class Testigo {
    private int id;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    
    private Conexion c = new Conexion();
    private Statement stm;
    private ResultSet rs; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }
    
    public Testigo(){
        this.id = 0;
        this.nombre = "";
        this.apellido_paterno="";
        this.apellido_materno="";
    }
    
    public boolean Registar(){
        try {
            String sql = "insert into testigos (id_testigo,nombre_tes,ap_pat_tes,ap_mat_tes) "
                    + "values (?,?,?,?)";
            c.conectar();
            PreparedStatement ps = c.conex.prepareStatement(sql);
            ps.setInt(1, this.id);
            ps.setString(2, this.nombre);
            ps.setString(3, this.apellido_paterno);
            ps.setString(4, this.apellido_materno);
            ps.execute();
            ps.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
            return false;
        }
    }
    
    public int ultimoID(){
        try{
            String sql = "select MAX(id_testigo) from testigos";
            c.conectar();
            stm = c.conex.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                this.id = rs.getInt(1);
            }
            c.desconectar();
            return this.id;
        }catch(SQLException ex){
            return 0;
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
