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
public class Papas extends Decorador{

    public Papas(Pizza pizzaTemporal) {
        super(pizzaTemporal);
    }

    @Override
    public String getDescripcion() {
        return pizzaTemporal.getDescripcion()+" + papas ";
    }

    @Override
    public double getPrecio() {
        return pizzaTemporal.getPrecio() + .5;
    }
}
