/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras.mvc.ejm2.view;

/**
 *
 * @author User
 */
public class ClienteView {
    public void imprimirDatosClientes(int id,String nombre,String apellido){
        System.out.println("*** Datos Clientes ***");
        System.out.println("ID : "+id);
        System.out.println("Nombre : "+nombre);
        System.out.println("Apellido : "+apellido);
    }
}
