/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_estructurales.proxy.otroEjemplo;

/**
 *
 * @author User
 */
public interface Servidor {
    String subir(String nombreFichero);
    String listado();
    Fichero descargar(int id);
}
