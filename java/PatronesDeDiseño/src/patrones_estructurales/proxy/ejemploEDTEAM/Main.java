/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_estructurales.proxy.ejemploEDTEAM;

/**
 *
 * @author User
 */

/**
 * 
 * Sustituto y el control de acceso
 * 
 * Intermediario para las peticiones, intermediario para el manejo de peticiones
 * 
 * Nos provee un elemento sustituto de un objeto y controlar el acceso
 * 
 * 
 * 
 * Elementos :
 * 
 * Proxy : tendrá la referencia al objeto real
 * Subject : Interfaz que implementa el objeto real
 * RealSubject : Define el objeto real que el proxy va arepresentrar
 * 
 * 
 * 
 * Proxy virtual ... Retrazar la construccion del objeto(Iniciacion peresoza)
 * 
 * El proxy nos dara una interfaz identica
 * El decorator nos dara una interfaz mejorada 
 * 
 */
public class Main {
    public static void main(String[] args) {
        Servidor server=new ProxyServer("misitio.com" );
        server.descargar("cursos.json");
    }
}
