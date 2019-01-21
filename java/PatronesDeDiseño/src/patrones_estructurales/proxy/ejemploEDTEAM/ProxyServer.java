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
public class ProxyServer implements Servidor{
    private ServidorReal servidorReal;
    private String host;

    public ProxyServer(String host) {
        this.host=host;
        servidorReal=null;
        System.out.println("Iniciando Proxy");
    }
    
    @Override
    public void descargar(String url) {
        if(servidorReal==null){
            servidorReal=new ServidorReal(host);
        }
        servidorReal.descargar(url);
    }
    
}
