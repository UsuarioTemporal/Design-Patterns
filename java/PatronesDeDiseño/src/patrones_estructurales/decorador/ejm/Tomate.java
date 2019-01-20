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
public class Tomate extends DecoradorHamburgesa{

    public Tomate(IHambuerguesa hamburguesaDecorada) {
        super(hamburguesaDecorada);
    }

    @Override
    public String getDescripcion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPrecio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
