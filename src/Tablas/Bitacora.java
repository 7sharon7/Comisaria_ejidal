/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;
import java.util.Date;
import comisaria_db.Conexion;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author MISAEL
 */
public class Bitacora {
    private Conexion c = new Conexion();
    private static String usuario;
    private static String ip;
    private static String tabla;
    private static String accion;
    private static String datos_anteriores;
    private static String datos_nuevos;
    private static String hora_fecha;

    public static String getHora_fecha() {
        return hora_fecha;
    }

    public static void setHora_fecha(String hora_fecha) {
        Bitacora.hora_fecha = hora_fecha;
    }
    
    
    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        Bitacora.usuario = usuario;
    }

    public static String getIp() {
        return ip;
    }

    public static void setIp(String ip) {
        Bitacora.ip = ip;
    }

    public static String getTabla() {
        return tabla;
    }

    public static void setTabla(String tabla) {
        Bitacora.tabla = tabla;
    }

    public static String getAccion() {
        return accion;
    }

    public static void setAccion(String accion) {
        Bitacora.accion = accion;
    }

    public static String getDatos_anteriores() {
        return datos_anteriores;
    }

    public static void setDatos_anteriores(String datos_anteriores) {
        Bitacora.datos_anteriores = datos_anteriores;
    }

    public static String getDatos_nuevos() {
        return datos_nuevos;
    }

    public static void setDatos_nuevos(String datos_nuevos) {
        Bitacora.datos_nuevos = datos_nuevos;
    }

    public Bitacora(){
        Bitacora.usuario="";
        Bitacora.ip="";
        Bitacora.tabla="";
        Bitacora.accion="";
        Bitacora.datos_anteriores="";
        Bitacora.datos_nuevos="";
        Bitacora.hora_fecha="";
    }
    
    public void Bitacora() throws UnknownHostException{
        InetAddress localHost = InetAddress.getLocalHost();
        Bitacora.usuario = Bitacora.usuario+"/"+localHost.getHostName();
        Bitacora.ip=localHost.getHostAddress();
        Date date = new Date(); // this object contains the current date value
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        try {
            String comando = "insert into bitacora(usuario,ip,tabla,accion,datos_anteriores,datos_nuevos,hora_fecha) values(?,?,?,?,?,?,?);";
            PreparedStatement ps=c.conectar().prepareStatement(comando);
            ps.setString(1,Bitacora.usuario);
            ps.setString(2,Bitacora.ip);
            ps.setString(3,Bitacora.tabla);
            ps.setString(4,Bitacora.accion);
            ps.setString(5,Bitacora.datos_anteriores);
            ps.setString(6,Bitacora.datos_nuevos);
            ps.setString(7,formatter.format(date));
            ps.execute();
            ps.close();
            c.desconectar();
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERROR AL INSERTAR EN BITACORA; "+ex);
        }
    }
    
    
    
}
