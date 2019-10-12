/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import java.sql.*;
import javax.swing.JOptionPane;
import comisaria_db.Conexion;
import Tablas.Bitacora;
import java.net.UnknownHostException;


/**
 *
 * @author MISAEL
 */
public class Usuario {
    private String nom_usu ;
    private String password;
    private Conexion c = new Conexion();
    private Statement stm;
    private ResultSet rs;       

    public String getNom_usu() {
        return nom_usu;
    }

    public void setNom_usu(String nom_usu) {
        this.nom_usu = nom_usu;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public Usuario(){
        this.nom_usu = "";
        this.password="";
    }
    
    public boolean agregar_usuario() throws UnknownHostException{
        try {
            String comando = "insert into usuarios(Usuario,Contraseña) values(?,?);";
            PreparedStatement ps=c.conectar().prepareStatement(comando);
            ps.setString(1,this.nom_usu);
            ps.setString(2,this.password);
            ps.execute();
            ps.close();
            c.desconectar();
            bitacora_usu("ALTA");
            return true;
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL REGISTRAR USUARIO, INTENTELO DE NUEVO/n "+ex);
            return false;
        }
    }
    
    public boolean Eliminar(){
        return true;
    }
    
    public boolean Modificar(){
        return true;
    }
    
    public boolean Buscar(){
        return true;
    }
    
    public boolean ingresar() throws UnknownHostException{
        String contr="";
        try {
            c.conectar();
            stm = c.conex.createStatement(); //creo un entorno para declaraciones
            rs = stm.executeQuery("SELECT * FROM usuarios where(usuarios.Usuario = '"+this.nom_usu.trim()+"')"); //resulset para obtener resultados
            c.desconectar();
             while(rs.next())
             {
                 //System.out.println(rs.getString("Usuario"));
                 //System.out.println(rs.getString("Contraseña"));
                 contr=rs.getString("Contraseña");//obtengo el dato que está en el campo "contraseña"
             }
             if(Usuario.this.password.equals(contr)){
                 bitacora_usu("Inicio de sesión");
                 return true;
             } 
             else
                return false;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL INGRESAR/n "+ex);
            return false;
        }
            
    }
    public int existencia_usuario()
    {
        int existencia=0;
        try
        {
            c.conectar();
            stm = c.conex.createStatement();
             rs = stm.executeQuery("SELECT COUNT(*) FROM usuarios where(Usuario = '"+this.nom_usu+"')");//BUSQUEDA EXISTENCIA
            while(rs.next())
            {
                existencia = rs.getInt(1);
            }
            
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "ERROR AL VERIFICAR USUARIO, INTENTELO DE NUEVO/n "+ex);
            
        }
       return existencia;
    }
    
    
    
    public void bitacora_usu(String accion) throws UnknownHostException{
        Bitacora b = new Bitacora();
        b.setUsuario(this.nom_usu);
        b.setTabla("USUARIO");
        b.setAccion(accion);
        b.Bitacora();
    }
}
