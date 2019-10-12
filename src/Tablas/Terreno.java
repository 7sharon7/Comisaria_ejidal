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
public class Terreno {
    private int id_terreno;
    private String ubicacion;
    private String tipo_terreno;
    private float med_N;
    private float med_S;
    private float med_E;
    private float med_O;
    private float med_NE;
    private float med_NO;
    private float med_SE;
    private float med_SO;
    private String col_N;
    private String col_S;
    private String col_E;
    private String col_O;
    private String col_NE;
    private String col_NO;
    private String col_SE;
    private String col_SO;

    
    private Conexion c = new Conexion();
    private Statement stm;
    private ResultSet rs; 

    public int getId_terreno() {
        return id_terreno;
    }

    public void setId_terreno(int id_terreno) {
        this.id_terreno = id_terreno;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipo_terreno() {
        return tipo_terreno;
    }

    public void setTipo_terreno(String tipo_terreno) {
        this.tipo_terreno = tipo_terreno;
    }

    public float getMed_N() {
        return med_N;
    }

    public void setMed_N(float med_N) {
        this.med_N = med_N;
    }

    public float getMed_S() {
        return med_S;
    }

    public void setMed_S(float med_S) {
        this.med_S = med_S;
    }

    public float getMed_E() {
        return med_E;
    }

    public void setMed_E(float med_E) {
        this.med_E = med_E;
    }

    public float getMed_O() {
        return med_O;
    }

    public void setMed_O(float med_O) {
        this.med_O = med_O;
    }

    public float getMed_NE() {
        return med_NE;
    }

    public void setMed_NE(float med_NE) {
        this.med_NE = med_NE;
    }

    public float getMed_NO() {
        return med_NO;
    }

    public void setMed_NO(float med_NO) {
        this.med_NO = med_NO;
    }

    public float getMed_SE() {
        return med_SE;
    }

    public void setMed_SE(float med_SE) {
        this.med_SE = med_SE;
    }

    public float getMed_SO() {
        return med_SO;
    }

    public void setMed_SO(float med_SO) {
        this.med_SO = med_SO;
    }

    

    public String getCol_N() {
        return col_N;
    }

    public void setCol_N(String col_N) {
        this.col_N = col_N;
    }

    public String getCol_S() {
        return col_S;
    }

    public void setCol_S(String col_S) {
        this.col_S = col_S;
    }

    public String getCol_E() {
        return col_E;
    }

    public void setCol_E(String col_E) {
        this.col_E = col_E;
    }

    public String getCol_O() {
        return col_O;
    }

    public void setCol_O(String col_O) {
        this.col_O = col_O;
    }

    public String getCol_NE() {
        return col_NE;
    }

    public void setCol_NE(String col_NE) {
        this.col_NE = col_NE;
    }

    public String getCol_NO() {
        return col_NO;
    }

    public void setCol_NO(String col_NO) {
        this.col_NO = col_NO;
    }

    public String getCol_SE() {
        return col_SE;
    }

    public void setCol_SE(String col_SE) {
        this.col_SE = col_SE;
    }

    public String getCol_SO() {
        return col_SO;
    }

    public void setCol_SO(String col_SO) {
        this.col_SO = col_SO;
    }

    public Terreno() {
        this.id_terreno = 0;
        this.ubicacion = "";
        this.tipo_terreno = "";
        this.med_N = 0;
        this.med_S = 0;
        this.med_E = 0;
        this.med_O = 0;
        this.med_NE = 0;
        this.med_NO = 0;
        this.med_SE = 0;
        this.med_SO = 0;
        this.col_N = "";
        this.col_S = "";
        this.col_E = "";
        this.col_O = "";
        this.col_NE = "";
        this.col_NO = "";
        this.col_SE = "";
        this.col_SO = "";
    }

    public boolean Registar(){
        try {
            String sql = "insert into terrenos (id_terreno,ubicacion,tipo_terreno,med_N,med_S,med_E,med_O,med_NE,med_NO,"
                    + "med_SE,med_SO,col_N,col_S,col_E,col_O,col_NE,col_NO,col_SE,col_SO) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            c.conectar();
            PreparedStatement ps = c.conex.prepareStatement(sql);
            ps.setInt(1,this.id_terreno);
            ps.setString(2,this.ubicacion);
            ps.setString(3,this.tipo_terreno);
            ps.setFloat(4,this.med_N);
            ps.setFloat(5,this.med_S);
            ps.setFloat(6,this.med_E);
            ps.setFloat(7,this.med_O);
            ps.setFloat(8,this.med_NE);
            ps.setFloat(9,this.med_NO);
            ps.setFloat(10,this.med_SE);
            ps.setFloat(11,this.med_SO);
            ps.setString(12,this.col_N);
            ps.setString(13,this.col_S);
            ps.setString(14,this.col_E);
            ps.setString(15,this.col_O);
            ps.setString(16,this.col_NE);
            ps.setString(17,this.col_NO);
            ps.setString(18,this.col_SE);
            ps.setString(19,this.col_SO);
            ps.execute();
            ps.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"nafi papi" +ex);
            return false;
        }
        
    }
    
    public int ultimoID(){
        try{
            String sql = "select MAX(id_terreno) from terrenos";
            c.conectar();
            stm = c.conex.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                this.id_terreno = rs.getInt(1);
            }
            c.desconectar();
            return this.id_terreno;
        }catch(SQLException ex){
            return 0;
        }
    }
    
}
