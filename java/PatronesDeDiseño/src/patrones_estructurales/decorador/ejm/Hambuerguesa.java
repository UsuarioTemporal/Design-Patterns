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
public class Hambuerguesa implements IHambuerguesa{

    @Override
    public String getDescripcion() {
        return "pan + carne ";
    }

    @Override
    public double getPrecio() {
        return 5;
    }
    
}
