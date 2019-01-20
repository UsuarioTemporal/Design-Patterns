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
public abstract class Decorador implements IVehiculo{
    protected IVehiculo vehiculoDecorado;
    public Decorador(IVehiculo vehiculoDecorado){
        this.vehiculoDecorado=vehiculoDecorado;
    }
    public IVehiculo getVehiculo(){
        return vehiculoDecorado;
    }
}
