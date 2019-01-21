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
public class ImagenReal implements Imagen{
    private String file;
    public ImagenReal(String file){
        System.out.println("Conectado ... ");
        this.file = file;
    }
    @Override
    public void cargar(String url) {
        System.out.println("Cargando ... "+url+" en "+file);
    }
    
}
