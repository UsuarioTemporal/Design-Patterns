/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras.mvc.ejm2.controller;

import extras.mvc.ejm2.model.Cliente;
import extras.mvc.ejm2.view.ClienteView;

/**
 *
 * @author User
 */
public class ClienteController {
    private Cliente model;
    private ClienteView view;

    public ClienteController(Cliente model, ClienteView view) {
        this.model = model;
        this.view = view;
    }
    public int getId(){
        return model.getId();
    }
    public void setId(int id){
        model.setId(id);
    }
    public String getName(){
        return model.getNombre();
    }
    public void setName(String nombre){
        model.setNombre(nombre);
    }
    public String getApellido(){
        return model.getApellido();
    }
    public void setApellido(String apellido){
        model.setApellido(apellido);
    }
    public void actualizarView(){
        view.imprimirDatosClientes(model.getId(), model.getNombre(), model.getApellido());
    }
}
