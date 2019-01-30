/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras.mvc.ejm3.main;

import extras.mvc.ejm3.controller.Controller;
import extras.mvc.ejm3.model.Multiplicacion;
import extras.mvc.ejm3.view.Vista;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Multiplicacion model=new Multiplicacion();
        Vista view=new Vista();
        Controller controlador = new Controller(view, model);
        controlador.iniciar();
    }
}
