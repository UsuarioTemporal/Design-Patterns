/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_estructurales.facade;

/**
 *
 * @author User
 */
public class HotelAPI {
    public void buscarVuelos(String fechaEntrada,String fechaSalida,String origen,String destino){
        System.out.println("===================================");
        System.out.println("Hoteles encontrados");
        System.out.println("Entrada : "+fechaEntrada+" salida : "+fechaSalida);
        System.out.println("Hotel A ");
        System.out.println("Hotel B ");
        System.out.println("Hotel C ");
        System.out.println("===================================");
    }
}
