/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import comisaria_db.Conexion;
import java.sql.*;
/**
 *
 * @author MISAEL
 */
public class Cedente {
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
    
    public Cedente(){
        this.id=0;
        this.nombre="";
        this.apellido_paterno="";
        this.apellido_materno="";
    }
    
    public boolean Registar(){
        try {
            String sql = "insert into cedientes (nombre_cede,ap_pat_cede,ap_mat_cede) "
                    + "values (?,?,?)";
            c.conectar();
            PreparedStatement ps = c.conectar().prepareStatement(sql);
            //ps.setInt(1, this.id); ES AUTOINCREMENTABLE
            ps.setString(1, this.nombre);
            ps.setString(2, this.apellido_paterno);
            ps.setString(3, this.apellido_materno);
            ps.execute();
            ps.close();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public boolean Eliminar(){
        try {
            String sql = "delete from cedientes where(id_cediente=?)";
            PreparedStatement ps = c.conectar().prepareStatement(sql);
            ps.setInt(1,this.id);
            ps.execute();
            ps.close();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public boolean Modificar(int id){
        try {
            String sql ="update cedientes set id_cediente=?,nombre_cede=?,ap_pat_cede=?,ap_mat_cede=? "
                    + "where(id_cediente=?)";
            PreparedStatement ps = c.conectar().prepareStatement(sql);
            ps.setInt(1, this.id);
            ps.setString(2, this.nombre);
            ps.setString(3, this.apellido_paterno);
            ps.setString(4, this.apellido_materno);
            ps.setInt(5,id);
            return true;
        } catch (SQLException ex) {
            return false;
        }
       
    }
    
    public ResultSet Buscar(int id){
        try {
            String sql = "select * from cedientes where(id_cediente ='"+id+"')";
            stm = c.conectar().createStatement();
            rs=stm.executeQuery(sql);
            c.desconectar();
            return rs;
        } catch (SQLException ex) {
            rs=null;
            return rs;
        }
    }
    
    public int ultimoID(){
        try{
            String sql = "select MAX(id_cediente) from cedientes";
            c.conectar();
            stm = c.conex.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                this.id= rs.getInt(1);
            }
            c.desconectar();
            return this.id;
        }catch(SQLException ex){
            return 0;
        }
    }
    
}
