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
public class GPS extends Decorador{
    public GPS(IVehiculo vehiculoDecorado) {
        super(vehiculoDecorado);
    }

    @Override
    public String getDescripcion() {
        return vehiculoDecorado.getDescripcion()+" + gps";
    }

    @Override
    public double getPrecio() {
        return vehiculoDecorado.getPrecio()+200;
    }
}
