/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras.mvc.ejm2.main;

import extras.mvc.ejm2.controller.ClienteController;
import extras.mvc.ejm2.model.Cliente;
import extras.mvc.ejm2.view.ClienteView;

/**
 *
 * @author User
 */
public class App {
    public static void main(String[] args) {
        Cliente model=new Cliente();
        model.setApellido("Roman");
        model.setNombre("Thom");
        model.setId(1);
        ClienteView view =new ClienteView();
        ClienteController controller=new ClienteController(model, view);
        controller.actualizarView();
        controller.setName("Carlos");
        controller.actualizarView();
    }
}
