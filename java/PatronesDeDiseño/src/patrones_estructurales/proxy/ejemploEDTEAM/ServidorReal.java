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
public class ServidorReal implements Servidor {
    private String host;
    public ServidorReal(String host){
        this.host=host;
        System.out.println("Iniciando ...");
    }
    @Override
    public void descargar(String url) {
        System.out.println("descargando..."+host+" "+url);
    }
    
}
