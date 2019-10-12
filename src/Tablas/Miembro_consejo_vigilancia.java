/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import java.sql.*;
import javax.swing.JOptionPane;
import comisaria_db.Conexion;
import java.net.UnknownHostException;

/**
 *
 * @author MISAEL
 */
public class Miembro_consejo_vigilancia {
    private String id;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String cargo;
    
    private Conexion c = new Conexion();
    private Statement stm;
    private ResultSet rs; 

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
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
    
    public boolean agregar_miembro() throws UnknownHostException{
        try {
            String comando = "insert into miembros_consejo_vigilancia"
                           + "(id_miembro_vigilancia,cargo_miembro,nombre_vigi,ap_pat_vigi,ap_mat_vigi) values(?,?,?,?,?)";
            c.conectar();
            PreparedStatement ps = c.conectar().prepareStatement(comando);
            ps.setString(1,this.id);
            ps.setString(2,this.cargo);
            ps.setString(3,this.nombre);
            ps.setString(4,this.apellido_paterno);
            ps.setString(5,this.apellido_materno);
            ps.execute();
            ps.close();
            Bitacora b = new Bitacora();
            String datos_nuevos = this.id+" "+this.cargo+" "+this.nombre+" "+this.apellido_paterno+" "+this.apellido_materno;
            b.setAccion("ALTA");
            b.setTabla("MIEMBRO_CONSEJO_VIGILANCIA");
            b.setDatos_nuevos(datos_nuevos);
            b.Bitacora();
            
            
            return true;
        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, "ERROR AL REGISTRAR MIEMBRO"+this.nombre+""+this.apellido_paterno+""+this.apellido_materno+", INTENTELO DE NUEVO/n "+exception);
            return false;
        }
    }
    
    public boolean Eliminar(){
        try{
            String sql = "delete from miembros_consejo_vigilancia where (id_miembro_vigilancia = ?)";
            PreparedStatement ps = c.conectar().prepareStatement(sql);
            ps.setString(1,this.id);
            ps.execute();
            ps.close();
            return true;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error "+ex,null,JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public boolean Modificar_miembro(String id){
        try{
            String sql = "update miembros_consejo_vigilancia "
                    + "set id_miembro_vigilancia = ?,cargo_miembro= ?,nombre_vigi= ?,ap_pat_vigi=?,ap_mat_vigi=?"
                    + "where (id_miembro_vigilancia = ?)";
            PreparedStatement ps = c.conectar().prepareStatement(sql);
            ps.setString(1,this.id);
            ps.setString(2,this.cargo);
            ps.setString(3,this.nombre);
            ps.setString(4,this.apellido_paterno);
            ps.setString(5,this.apellido_materno);
            ps.setString(6,id);
            ps.execute();
            ps.close();
            return true;
        }catch(SQLException ex){
            return false;
        }        
        
    }
    
    public ResultSet Buscar(){
        String sql = "select * from miembros_consejo_vigilancia where(id_miembro_vigilancia = '"+this.id+"')";
        try {
            stm = c.conex.createStatement();
            rs = stm.executeQuery(sql);
            c.desconectar();
            return rs;
        } catch (SQLException e) {
            rs = null;
            return rs;
        }
        
    }
    
    public ResultSet Buscar_por_cargo(String cargo){
        try {
            String sql = "select * from miembros_consejo_vigilancia where(cargo_miembro='"+cargo+"')";
            stm = c.conectar().createStatement();
            rs = stm.executeQuery(sql);
            c.desconectar();
            return rs;
        } catch (SQLException e) {
            rs=null;
            return rs;
        }
    }
    
    public boolean Existencia_miembro(){
         int existencia=0;
        try {
            c.conectar();
            stm = c.conex.createStatement();
            rs = stm.executeQuery("SELECT COUNT(*) FROM miembros_consejo_vigilancia where (id_miembro_vigilancia = '"+this.id+"')");
            c.desconectar();
            while(rs.next())
             {
                 existencia = rs.getInt(1);
             }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error MIEMBRO CONSEJO VIGILANCIA ",null,JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(existencia ==1){
            return true;
        }
        return false;
    }
}
