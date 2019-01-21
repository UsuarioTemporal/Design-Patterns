/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_estructurales.proxy.ejemploImagen;

/**
 *
 * @author User
 */
public class ProxyImagen implements Imagen{
    private ImagenReal img ;
    private String file;
    public ProxyImagen(String file){
        System.out.println("Conectando ... ");
        img=null;
        this.file=file;
    }
    @Override
    public void cargar(String url) {
        if(img==null){
            img=new ImagenReal(file);
        }
        img.cargar(url);
    }
    
}
