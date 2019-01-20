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
public class VehiculoModel implements IVehiculo{
    private double precio;
    private String descripcion;
    public VehiculoModel(double precio,String descripcion){
        this.descripcion=descripcion;
        this.precio=precio;
    }
    
    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public double getPrecio() {
        return precio;
    }
    
}
