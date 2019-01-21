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
public class App {
    public static void main(String[] args) {
        Imagen img=new ProxyImagen("/img/animales");
        img.cargar("perro.jpg");
        System.out.println("\n");
        img.cargar("conejo.jpg");
    }
}
