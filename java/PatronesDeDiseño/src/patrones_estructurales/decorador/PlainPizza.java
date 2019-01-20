/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_estructurales.decorador;

import patrones_estructurales.decorador.Pizza;

/**
 *
 * @author User
 */
public class PlainPizza implements Pizza{

    @Override
    public String getDescripcion() {
        return "Masa de pizza ";
    }

    @Override
    public double getPrecio() {
        return 5;
    }
    
}
