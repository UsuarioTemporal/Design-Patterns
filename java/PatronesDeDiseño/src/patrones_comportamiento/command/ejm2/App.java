/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.command.ejm2;

/**
 *
 * @author User
 * 
 * A veces es necesario emitir solicitudes a objetos sin saber nada sobre la operacion
 * solicitada o el receptor de la solicitud
 */
public class App {
    public static void main(String[] args) {
        Order orden1 =new RealOrder1(new RealReceiver1());
        Order orden2 = new RealOrder2(new RealReceiver1());
        Order orden3=new RealOrder3(new RealReceiver2());
        Invoker invocador = new Invoker();
        invocador.add(orden1);
        invocador.add(orden2);
        invocador.add(orden3);
        invocador.invoker();
    }
}