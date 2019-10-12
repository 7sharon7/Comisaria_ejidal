/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

/**
 *
 * @author MISAEL
 */
public class metodos_generales {
        public void cerrar_formulario(){
        inicio_sesion obj = new inicio_sesion();
        obj.toFront();
        obj.setVisible(true);
       // dispose();
    }
}
