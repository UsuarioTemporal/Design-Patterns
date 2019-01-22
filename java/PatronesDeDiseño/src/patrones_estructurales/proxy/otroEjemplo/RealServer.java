/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_estructurales.proxy.otroEjemplo;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author User
 */
public class RealServer implements Servidor{
    private String nombre;
    private Hashtable<Integer,Fichero> ficheros ;
    private Fichero fich ;

    public RealServer(String nombreServidor) {
        this.nombre=nombreServidor;
        ficheros=new Hashtable<>();
    }
    
    @Override
    public String subir(String nombreFichero) {
        fich=new Fichero(nombreFichero);
        ficheros.put(Integer.parseInt(fich.getId()), fich);
        return "\nFichero subido correctamente...";
    }

    @Override
    public String listado() {
        String list ="\n### Listado del servidor : "+this.nombre+" ### ";
        for(Enumeration e = ficheros.elements();e.hasMoreElements();){
            fich=(Fichero) e.nextElement();
            list+="\n\t"+fich.toString();
        }
        return list;
    }

    @Override
    public Fichero descargar(int id) {
        return ficheros.get(id);
    }
    
}
