
package comisaria_db;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Ventanas.*;


public class Lector {
    private Conexion c = new Conexion();
    private Statement stm;
    private ResultSet rs;
    
    public void consulta(){
        Conexion c = new Conexion();
        try {
            c.conectar();
            stm = c.conex.createStatement();
            rs = stm.executeQuery("SELECT * FROM usuarios");
            c.desconectar();
            while(rs.next())
             {
                 System.out.println(rs.getString("id"));
                 System.out.println(rs.getString("Usuario"));
                 System.out.println(rs.getString("Contraseña"));
             }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Errorsote pej ");
        }
     
    }
    
    
    public ArrayList lista(){
    
      ArrayList<String> nuevo = new ArrayList();
      c.conectar();
      String aux="";
      try{
          stm = c.conex.createStatement();
          rs = stm.executeQuery("select nombre_eji,ap_pat_eji,ap_mat_eji from miembros_comisariado_ejidal where(cargo_miembro = \"SECRETARIO\")");
          while(rs.next()){
              aux = ""+rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3);
              nuevo.add(aux);
        }
    }
    catch(SQLException ex)
    {
        JOptionPane.showMessageDialog(null, "ERROR AL VERIFICAR USUARIO, INTENTELO DE NUEVO/n "+ex);
    }
     return nuevo;
     
    }
}
