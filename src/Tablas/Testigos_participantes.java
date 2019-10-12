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
public class Testigos_participantes {
   private int testigo;
   private int folio_constancia;
   
   private Conexion c = new Conexion();
    private Statement stm;
    private ResultSet rs; 

    public int getTestigo() {
        return testigo;
    }

    public void setTestigo(int testigo) {
        this.testigo = testigo;
    }

    public int getFolio_constancia() {
        return folio_constancia;
    }

    public void setFolio_constancia(int folio_constancia) {
        this.folio_constancia = folio_constancia;
    }
    
    public Testigos_participantes(){
        this.testigo = 0;
        this.folio_constancia=0;
    }
    
    public boolean Registar(){
        try {
            String sql = "insert into testigos_participantes (id_testigo,no_folio) "
                    + "values(?,?)";
            c.conectar();
            PreparedStatement ps = c.conex.prepareStatement(sql);
            ps.setInt(1, this.testigo);
            ps.setInt(2, this.folio_constancia);
            ps.execute();
            ps.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"TESTIGOS PARTICIPANTES"+ex);
            return false;
        }
        
    }
}
