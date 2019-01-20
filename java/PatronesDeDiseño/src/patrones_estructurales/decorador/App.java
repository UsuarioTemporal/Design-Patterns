/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_estructurales.decorador;

/**
 *
 * @author User
 */
public class App {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        System.out.println(pizza.getDescripcion()+" "+pizza.getPrecio());
        pizza=new Papas(new Queso(pizza));
        System.out.println(pizza.getDescripcion()+" "+pizza.getPrecio());
    }
}
