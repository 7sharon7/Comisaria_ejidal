/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import comisaria_db.Conexion;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class Constancia {
    private int folio;
    private String fecha_exp;
    private String nota;
    private int id_terreno;
    private int id_cediente;
    private String ruta_imagen;
    private Blob imagen = null;
    

    private Conexion c = new Conexion();
    private Statement stm;
    private ResultSet rs; 
    
    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getFecha_exp() {
        return fecha_exp;
    }

    public void setFecha_exp(String fecha_exp) {
        this.fecha_exp = fecha_exp;
    }
    
    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public int getId_terreno() {
        return id_terreno;
    }

    public void setId_terreno(int id_terreno) {
        this.id_terreno = id_terreno;
    }

    public int getId_cediente() {
        return id_cediente;
    }

    public void setId_cediente(int id_cediente) {
        this.id_cediente = id_cediente;
    }

    public String getRuta_imagen() {
        return ruta_imagen;
    }

    public void setRuta_imagen(String ruta_imagen) {
        this.ruta_imagen = ruta_imagen;
    }
    
    
   
    public Constancia(){
        this.folio = 0;
        this.fecha_exp = "";
        this.nota = "";
        this.id_cediente=0;
        this.id_terreno=0;
    }
    
     public boolean Agregar(){
         
             String sql="insert into constancias (no_folio,fecha_expedicion,id_terreno,id_cediente,nota,croquis) "
                     + "values (?,?,?,?,?,?)";
             FileInputStream fi=null;
             File fichero = new File(this.ruta_imagen);
          try {
             fi = new FileInputStream(fichero);
             c.conectar();
             PreparedStatement ps = c.conectar().prepareStatement(sql);
             ps.setInt(1, this.folio); //ES AUTOINCREMENTABLE
             ps.setString(2, this.fecha_exp);
             ps.setInt(3, this.id_terreno);
             ps.setInt(4, this.id_cediente);
             ps.setString(5, this.nota);
             ps.setBinaryStream(6,fi,(int)fichero.length());
             ps.execute();
             ps.close();
             return true;
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"CONSTANCIA "+ex);
             return false;
         } catch(Exception ex){
             return false;
         }
         
     } 
    
    public boolean Eliminar(){
        try {
            String sql="delete from constancias where(no_folio = ?)";
            PreparedStatement ps = c.conectar().prepareStatement(sql);
            ps.setInt(1, this.folio);
            ps.execute();
            ps.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public boolean Modificar(int id_terreno, int id_cediente, int folio){
        try {
            String sql="update constancias set no_folio=?,fecha_expedicion=?,id_terreno=?,id_cediente=? "
                    + "where (no_folio=?)";
            PreparedStatement ps = c.conectar().prepareStatement(sql);
            ps.setInt(1, this.folio);
            ps.setString(2, this.fecha_exp);
            ps.setInt(3, id_terreno);
            ps.setInt(4, id_cediente);
            ps.setInt(5, folio);
            ps.execute();
            ps.close();
            //FALTA MODIFICAR LA IMAGEN DEL CROQUIS
            return true;
        }catch(SQLException e){
            return false;
        }
        
    }
    
    public ResultSet Buscar_constancia_especifica(){
        try {
            String sql = "";
        } catch (Exception e) {
        }
        return rs;
    }
    
    public ArrayList Buscar_todo(int tipo_busqueda,int no_folio_constancia){
        //BUSQUEDA GENERAL = 1 || BUSQUEDA ESPECIFICA !=1
        ArrayList<String[]> Lista_constancias = new ArrayList();
        if(tipo_busqueda == 1){
            try{
                String sql = "select * from constancias";
                c.conectar();
                stm = c.conex.createStatement();
                rs = stm.executeQuery(sql);

                while(rs.next()){ //RECORRO TODAS LAS FILAS DE CONSTANCIAS EXISTENTES
                    String[] columnas = new String[30];
                    sql = "select constancias.no_folio,constancias.fecha_expedicion,cedientes.id_cediente,cedientes.nombre_cede,"
                            + "cedientes.ap_pat_cede,cedientes.ap_mat_cede,constancias_propietario.id_propietario,propietarios.nombre_prop,"
                            + "propietarios.ape_pat_prop,propietarios.ape_mat_prop,terrenos.id_terreno,terrenos.ubicacion,terrenos.tipo_terreno,terrenos.med_N,terrenos.col_N,"
                            + "terrenos.med_S,terrenos.col_S,terrenos.med_E,terrenos.col_E,terrenos.med_O,terrenos.col_O,"
                            + "terrenos.med_NE,terrenos.col_NE,terrenos.med_NO,terrenos.col_NO,terrenos.med_SE,terrenos.col_SE,terrenos.med_SO,terrenos.col_SO,constancias.nota from constancias \n"
                            + "INNER JOIN terrenos on (terrenos.id_terreno = constancias.id_terreno and constancias.id_terreno='"+rs.getString(3)+"')\n"
                            + "INNER JOIN cedientes on (cedientes.id_cediente = constancias.id_cediente and constancias.id_cediente='"+rs.getString(4)+"')\n"
                            + "INNER JOIN constancias_propietario on (constancias_propietario.no_folio = constancias.no_folio and constancias.no_folio='"+rs.getString(1)+"')\n"
                            + "INNER JOIN propietarios on (propietarios.id_propietario = constancias_propietario.id_propietario and constancias_propietario.no_folio = constancias.no_folio and constancias.no_folio ='"+rs.getString(1)+"')";

                    ResultSet rsaux = stm.executeQuery(sql);
                    while(rsaux.next()){  //RECORRO LA FILA QUE ME ARROJA PARA PODER OBTENER LOS DATOS
                        columnas[0] = rsaux.getString(1);
                        columnas[1] = rsaux.getString(2);
                        columnas[2] = rsaux.getString(3);
                        columnas[3] = rsaux.getString(4);
                        columnas[4] = rsaux.getString(5);
                        columnas[5] = rsaux.getString(6);
                        columnas[6] = rsaux.getString(7);
                        columnas[7] = rsaux.getString(8);
                        columnas[8] = rsaux.getString(9);
                        columnas[9] = rsaux.getString(10);
                        columnas[10] = rsaux.getString(11);
                        columnas[11] = rsaux.getString(12);
                        columnas[12] = rsaux.getString(13);
                        columnas[13] = rsaux.getString(14);
                        columnas[14] = rsaux.getString(15);
                        columnas[15] = rsaux.getString(16);
                        columnas[16] = rsaux.getString(17);
                        columnas[17] = rsaux.getString(18);
                        columnas[18] = rsaux.getString(19);
                        columnas[19] = rsaux.getString(20);
                        columnas[20] = rsaux.getString(21);
                        columnas[21] = rsaux.getString(22);
                        columnas[22] = rsaux.getString(23);
                        columnas[23] = rsaux.getString(24);
                        columnas[24] = rsaux.getString(25);
                        columnas[25] = rsaux.getString(26);
                        columnas[26] = rsaux.getString(27);
                        columnas[27] = rsaux.getString(28);
                        columnas[28] = rsaux.getString(29);
                        columnas[29] = rsaux.getString(30);

                        //falta agregar a los participantes del consejo de vigilancia y comité ejidal
                        Lista_constancias.add(columnas);
                    }
                }
                //JOptionPane.showMessageDialog(null, "exito");
                c.desconectar();
                return Lista_constancias;
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "ERROR "+ex);
                Lista_constancias = null;
                return Lista_constancias;
            }
        }
        else{
            try{
                String sql = "select * from constancias where(no_folio = '"+no_folio_constancia+"')";
                c.conectar();
                stm = c.conex.createStatement();
                rs = stm.executeQuery(sql);

                while(rs.next()){ //RECORRO TODAS LAS FILAS DE CONSTANCIAS EXISTENTES
                    String[] columnas = new String[30];
                    sql = "select constancias.no_folio,constancias.fecha_expedicion,cedientes.id_cediente,cedientes.nombre_cede,"
                            + "cedientes.ap_pat_cede,cedientes.ap_mat_cede,constancias_propietario.id_propietario,propietarios.nombre_prop,"
                            + "propietarios.ape_pat_prop,propietarios.ape_mat_prop,terrenos.id_terreno,terrenos.ubicacion,terrenos.tipo_terreno,terrenos.med_N,terrenos.col_N,"
                            + "terrenos.med_S,terrenos.col_S,terrenos.med_E,terrenos.col_E,terrenos.med_O,terrenos.col_O,"
                            + "terrenos.med_NE,terrenos.col_NE,terrenos.med_NO,terrenos.col_NO,terrenos.med_SE,terrenos.col_SE,terrenos.med_SO,terrenos.col_SO,constancias.nota from constancias \n"
                            + "INNER JOIN terrenos on (terrenos.id_terreno = constancias.id_terreno and constancias.id_terreno='"+rs.getString(3)+"')\n"
                            + "INNER JOIN cedientes on (cedientes.id_cediente = constancias.id_cediente and constancias.id_cediente='"+rs.getString(4)+"')\n"
                            + "INNER JOIN constancias_propietario on (constancias_propietario.no_folio = constancias.no_folio and constancias.no_folio='"+rs.getString(1)+"')\n"
                            + "INNER JOIN propietarios on (propietarios.id_propietario = constancias_propietario.id_propietario and constancias_propietario.no_folio = constancias.no_folio and constancias.no_folio ='"+rs.getString(1)+"')";

                    ResultSet rsaux = stm.executeQuery(sql);
                    while(rsaux.next()){  //RECORRO LA FILA QUE ME ARROJA PARA PODER OBTENER LOS DATOS
                        columnas[0] = rsaux.getString(1);
                        columnas[1] = rsaux.getString(2);
                        columnas[2] = rsaux.getString(3);
                        columnas[3] = rsaux.getString(4);
                        columnas[4] = rsaux.getString(5);
                        columnas[5] = rsaux.getString(6);
                        columnas[6] = rsaux.getString(7);
                        columnas[7] = rsaux.getString(8);
                        columnas[8] = rsaux.getString(9);
                        columnas[9] = rsaux.getString(10);
                        columnas[10] = rsaux.getString(11);
                        columnas[11] = rsaux.getString(12);
                        columnas[12] = rsaux.getString(13);
                        columnas[13] = rsaux.getString(14);
                        columnas[14] = rsaux.getString(15);
                        columnas[15] = rsaux.getString(16);
                        columnas[16] = rsaux.getString(17);
                        columnas[17] = rsaux.getString(18);
                        columnas[18] = rsaux.getString(19);
                        columnas[19] = rsaux.getString(20);
                        columnas[20] = rsaux.getString(21);
                        columnas[21] = rsaux.getString(22);
                        columnas[22] = rsaux.getString(23);
                        columnas[23] = rsaux.getString(24);
                        columnas[24] = rsaux.getString(25);
                        columnas[25] = rsaux.getString(26);
                        columnas[26] = rsaux.getString(27);
                        columnas[27] = rsaux.getString(28);
                        columnas[28] = rsaux.getString(29);
                        columnas[29] = rsaux.getString(30);
                        //falta agregar a los participantes del consejo de vigilancia y comité ejidal
                        Lista_constancias.add(columnas);
                    }
                }
                //JOptionPane.showMessageDialog(null, "exito");
                c.desconectar();
                return Lista_constancias;
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "ERROR "+ex);
                Lista_constancias = null;
                return Lista_constancias;
            }
        }
    }
    
    public Blob Buscar_croquis(int no_folio_constancia){
        try{
            String sql = "select croquis from constancias where(no_folio = '"+no_folio_constancia+"')";
            c.conectar();
            stm = c.conex.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                this.imagen = rs.getBlob(1);
            }
            c.desconectar();
            return this.imagen;
        }catch(SQLException ex){
            this.imagen = null;
            return this.imagen;
        }
    }
    
    public ArrayList Buscar_testigos(int tipo_busqueda,int no_folio_constancia){
        //BUSQUEDA GENERAL = 1 || BUSQUEDA ESPECIFICA !=1
        ArrayList<String[]> Lista_testigos = new ArrayList();
        if(tipo_busqueda == 1){
            try{
                String sql = "select * from constancias";
                c.conectar();
                stm = c.conex.createStatement();
                rs = stm.executeQuery(sql);

                while(rs.next()){
                    sql = "select testigos.id_testigo,testigos.nombre_tes,testigos.ap_pat_tes,testigos.ap_mat_tes from testigos \n" +
                          "INNER JOIN testigos_participantes on (testigos_participantes.id_testigo = testigos.id_testigo)\n" +
                          "INNER JOIN constancias on (testigos_participantes.no_folio = constancias.no_folio and constancias.no_folio = '"+rs.getString(1)+"')";
                    ResultSet rsaux = stm.executeQuery(sql);
                    while(rsaux.next()){
                        String[] testigo = new String[4];
                        testigo[0] = rsaux.getString(1);
                        testigo[1] = rsaux.getString(2);
                        testigo[2] = rsaux.getString(3);
                        testigo[3] = rsaux.getString(4);
                        Lista_testigos.add(testigo);
                    }
                }
                c.desconectar();
                return Lista_testigos;
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "ERROR "+ex);
                Lista_testigos = null;
                return Lista_testigos;
            }
        }
        else{
            try{
                String sql = "select * from constancias where(no_folio = '"+no_folio_constancia+"')";
                c.conectar();
                stm = c.conex.createStatement();
                rs = stm.executeQuery(sql);

                while(rs.next()){
                    sql = "select testigos.id_testigo,testigos.nombre_tes,testigos.ap_pat_tes,testigos.ap_mat_tes from testigos \n" +
                          "INNER JOIN testigos_participantes on (testigos_participantes.id_testigo = testigos.id_testigo)\n" +
                          "INNER JOIN constancias on (testigos_participantes.no_folio = constancias.no_folio and constancias.no_folio = '"+rs.getString(1)+"')";
                    ResultSet rsaux = stm.executeQuery(sql);
                    while(rsaux.next()){
                        String[] testigo = new String[4];
                        testigo[0] = rsaux.getString(1);
                        testigo[1] = rsaux.getString(2);
                        testigo[2] = rsaux.getString(3);
                        testigo[3] = rsaux.getString(4);
                        Lista_testigos.add(testigo);
                    }
                }
                c.desconectar();
                return Lista_testigos;
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "ERROR "+ex);
                Lista_testigos = null;
                return Lista_testigos;
            }
        
        }
        
    
    }
    
    public ArrayList Buscar_com_ejidal(int tipo_busqueda,int no_folio_constancia){
        ArrayList<String[]> Lista_com_eji = new ArrayList();
        if(tipo_busqueda == 1){
            try{
                String sql = "select * from constancias";
                c.conectar();
                stm = c.conex.createStatement();
                rs = stm.executeQuery(sql);

                while(rs.next()){
                    sql = "select miembros_comisariado_ejidal.id_miembro_ejidal,miembros_comisariado_ejidal.nombre_eji,miembros_comisariado_ejidal.ap_pat_eji,miembros_comisariado_ejidal.ap_mat_eji,miembros_comisariado_ejidal.cargo_miembro from miembros_comisariado_ejidal\n" +
                          "inner join com_eji_autoriza on (com_eji_autoriza.id_miembro_ejidal = miembros_comisariado_ejidal.id_miembro_ejidal)\n" +
                          "INNER JOIN constancias on (com_eji_autoriza.no_folio = constancias.no_folio and constancias.no_folio = '"+rs.getString(1)+"')";
                    ResultSet rsaux = stm.executeQuery(sql);
                    while(rsaux.next()){
                        String[] com_eji = new String[5];
                        com_eji[0] = rsaux.getString(1);
                        com_eji[1] = rsaux.getString(2);
                        com_eji[2] = rsaux.getString(3);
                        com_eji[3] = rsaux.getString(4);
                        com_eji[4] = rsaux.getString(5);
                        Lista_com_eji.add(com_eji);
                    }
                }
                c.desconectar();
                return Lista_com_eji;
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "ERROR "+ex);
                Lista_com_eji = null;
                return Lista_com_eji;
            }
        }
        else{
            try{
                String sql = "select * from constancias where(no_folio = '"+no_folio_constancia+"')";
                c.conectar();
                stm = c.conex.createStatement();
                rs = stm.executeQuery(sql);

                while(rs.next()){
                    sql = "select miembros_comisariado_ejidal.id_miembro_ejidal,miembros_comisariado_ejidal.nombre_eji,miembros_comisariado_ejidal.ap_pat_eji,miembros_comisariado_ejidal.ap_mat_eji,miembros_comisariado_ejidal.cargo_miembro from miembros_comisariado_ejidal\n" +
                          "inner join com_eji_autoriza on (com_eji_autoriza.id_miembro_ejidal = miembros_comisariado_ejidal.id_miembro_ejidal)\n" +
                          "INNER JOIN constancias on (com_eji_autoriza.no_folio = constancias.no_folio and constancias.no_folio = '"+rs.getString(1)+"')";
                    ResultSet rsaux = stm.executeQuery(sql);
                    while(rsaux.next()){
                        String[] com_eji = new String[5];
                        com_eji[0] = rsaux.getString(1);
                        com_eji[1] = rsaux.getString(2);
                        com_eji[2] = rsaux.getString(3);
                        com_eji[3] = rsaux.getString(4);
                        com_eji[4] = rsaux.getString(5);
                        Lista_com_eji.add(com_eji);
                    }
                }
                c.desconectar();
                return Lista_com_eji;
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "ERROR "+ex);
                Lista_com_eji = null;
                return Lista_com_eji;
            }
        }
        
    
    }
    
    public ArrayList Buscar_con_vig(int tipo_busqueda,int no_folio_constancia){
        ArrayList<String[]> Lista_con_vig = new ArrayList();
        if(tipo_busqueda == 1){
            try{
                String sql = "select * from constancias";
                c.conectar();
                stm = c.conex.createStatement();
                rs = stm.executeQuery(sql);

                while(rs.next()){
                    sql = "select miembros_consejo_vigilancia.id_miembro_vigilancia, miembros_consejo_vigilancia.nombre_vigi, miembros_consejo_vigilancia.ap_pat_vigi, miembros_consejo_vigilancia.ap_mat_vigi, miembros_consejo_vigilancia.cargo_miembro from  miembros_consejo_vigilancia\n" +
                          "INNER JOIN con_vig_autoriza on (con_vig_autoriza.id_miembro_vigilancia =  miembros_consejo_vigilancia.id_miembro_vigilancia)\n" +
                          "INNER JOIN constancias on (con_vig_autoriza.no_folio = constancias.no_folio and constancias.no_folio = '"+rs.getString(1)+"')";
                    ResultSet rsaux = stm.executeQuery(sql);
                    while(rsaux.next()){
                        String[] con_vig = new String[5];
                        con_vig[0] = rsaux.getString(1);
                        con_vig[1] = rsaux.getString(2);
                        con_vig[2] = rsaux.getString(3);
                        con_vig[3] = rsaux.getString(4);
                        con_vig[4] = rsaux.getString(5);
                        Lista_con_vig.add(con_vig);
                    }
                }
                c.desconectar();
                return Lista_con_vig;
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "ERROR "+ex);
                Lista_con_vig = null;
                return Lista_con_vig;
            }
        }
        else{
            try{
                String sql = "select * from constancias where(no_folio = '"+no_folio_constancia+"')";
                c.conectar();
                stm = c.conex.createStatement();
                rs = stm.executeQuery(sql);

                while(rs.next()){
                    sql = "select miembros_consejo_vigilancia.id_miembro_vigilancia, miembros_consejo_vigilancia.nombre_vigi, miembros_consejo_vigilancia.ap_pat_vigi, miembros_consejo_vigilancia.ap_mat_vigi, miembros_consejo_vigilancia.cargo_miembro from  miembros_consejo_vigilancia\n" +
                          "INNER JOIN con_vig_autoriza on (con_vig_autoriza.id_miembro_vigilancia =  miembros_consejo_vigilancia.id_miembro_vigilancia)\n" +
                          "INNER JOIN constancias on (con_vig_autoriza.no_folio = constancias.no_folio and constancias.no_folio = '"+rs.getString(1)+"')";
                    ResultSet rsaux = stm.executeQuery(sql);
                    while(rsaux.next()){
                        String[] con_vig = new String[5];
                        con_vig[0] = rsaux.getString(1);
                        con_vig[1] = rsaux.getString(2);
                        con_vig[2] = rsaux.getString(3);
                        con_vig[3] = rsaux.getString(4);
                        con_vig[4] = rsaux.getString(5);
                        Lista_con_vig.add(con_vig);
                    }
                }
                c.desconectar();
                return Lista_con_vig;
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "ERROR "+ex);
                Lista_con_vig = null;
                return Lista_con_vig;
            }
        }
    }
    
    public int ultimoID(){
        try{
            String sql = "select MAX(no_folio) from constancias";
            c.conectar();
            stm = c.conex.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                this.folio = rs.getInt(1);
            }
            c.desconectar();
            return this.folio;
        }catch(SQLException ex){
            return 0;
        }
    }
    
}

