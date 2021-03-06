/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_estructurales.decorador.ejmVehiculo;

/**
 * Se pretende realizar la gestión de vehiculos.Se parte de un vehiculo con modelo y precio 
 * A los diferentes vehiculos se les puede añadir extras : GPS , MP3 , EDS ... Cada extra tiene
 * un precio y una descripcion
 * 
 * Finalmente, al objeto se le puede consultar su descripcion (debe informar de los extras incorporados) y el precio final
 */
public class App {
    public static void main(String[] args) {
        IVehiculo veh =new VehiculoModel(4000, "Toyota");
        System.out.println(veh.getDescripcion()+" "+veh.getPrecio());
        veh=new Musica(new GPS(veh));
        System.out.println(veh.getDescripcion()+" "+veh.getPrecio());
    }
}
