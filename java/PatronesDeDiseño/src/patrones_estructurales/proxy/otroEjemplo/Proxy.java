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
public class Proxy implements Servidor{
    private Servidor servidorReal;
    
    public Proxy(Servidor servidorReal){
        this.servidorReal=servidorReal;
    }
    @Override
    public String subir(String nombreFichero) {
        return "\nSubiendo dede el proxi ..."+servidorReal.subir(nombreFichero);
        
    }

    @Override
    public String listado() {
        return "Listado desde el proxy ... "+servidorReal.listado();
    }

    @Override
    public Fichero descargar(int id) {
        return servidorReal.descargar(id);
    }
    
}
