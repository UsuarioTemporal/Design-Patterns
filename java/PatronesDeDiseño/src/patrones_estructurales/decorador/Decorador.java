/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_estructurales.decorador;

/**
 *
 * @author User
 */
public abstract class Decorador implements Pizza{
    protected Pizza pizzaTemporal ;
    public Decorador(Pizza pizzaTemporal){
        this.pizzaTemporal=pizzaTemporal;
    }
    @Override
    public String getDescripcion() {
        return pizzaTemporal.getDescripcion();
    }

    @Override
    public double getPrecio() {
        return pizzaTemporal.getPrecio();
    }
    
}
