/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comisaria_db;

import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
    public Connection conex;
    String bd="comisaria";
    String url="jdbc:mariadb://localhost:3306/"+bd;
    String user="root";
    String password = "";
    public Connection conectar(){
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conex = DriverManager.getConnection(url, user, password);
            //JOptionPane.showMessageDialog(null, "CONEXIÓN EXITOSA");
        } catch (ClassNotFoundException | SQLException ex) {
           JOptionPane.showMessageDialog(null, "NO SE EXTABLECIÓ CONEXIÓN CON LA BASE DE DATOS/n "+ex);
        }
        return conex;
    }
    public void desconectar(){
        try{
            conex.close();
            //JOptionPane.showMessageDialog(null, "ia se cerro/n ");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "NO SE CERRÓ CONEXIÓN/n"+ex);
        }
    }
    
    
}
