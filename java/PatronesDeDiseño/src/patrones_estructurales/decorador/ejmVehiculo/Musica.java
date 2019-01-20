/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_estructurales.decorador.ejmVehiculo;

/**
 *
 * @author User
 */
public class Musica extends Decorador {

    public Musica(IVehiculo vehiculoDecorado) {
        super(vehiculoDecorado);
    }


    @Override
    public String getDescripcion() {
        return vehiculoDecorado.getDescripcion()+" + musica";
    }

    @Override
    public double getPrecio() {
        return vehiculoDecorado.getPrecio()+20;
    }
    
}
