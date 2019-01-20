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
        return hamburguesaDecorada.getDescripcion()+" + tomate";
    }

    @Override
    public double getPrecio() {
        return hamburguesaDecorada.getPrecio()+1;
    }
    
}
