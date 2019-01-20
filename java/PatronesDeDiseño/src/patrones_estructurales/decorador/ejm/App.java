/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_estructurales.decorador.ejm;

/**
 *
 * @author User
 */
public class App {
    
    public static void main(String[] args) {
        IHambuerguesa ham = new Hambuerguesa();
        System.out.println(ham.getDescripcion()+" "+ham.getPrecio());
        ham=new Tomate(ham);
        System.out.println(ham.getDescripcion()+" "+ham.getPrecio());
        ham=new Lechuga(ham);
        System.out.println(ham.getDescripcion()+" "+ham.getPrecio());
    }
}
