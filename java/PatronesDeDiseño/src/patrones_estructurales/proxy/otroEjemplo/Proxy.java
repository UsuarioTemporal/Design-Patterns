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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String listado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
