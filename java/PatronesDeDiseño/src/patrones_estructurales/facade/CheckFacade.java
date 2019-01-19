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
public class CheckFacade {
    private AvionAPI avionApi;
    private HotelAPI hotelApi;
    
    public CheckFacade(){
        avionApi = new AvionAPI();
        hotelApi=new HotelAPI();
    }
    
    public void buscar(String fechaIda,String fechaVuelta,String origem,String destino){
        avionApi.buscarVuelos(fechaIda, fechaVuelta, origem, destino);
        hotelApi.buscarVuelos(fechaIda, fechaIda, origem, destino);
    }
}
