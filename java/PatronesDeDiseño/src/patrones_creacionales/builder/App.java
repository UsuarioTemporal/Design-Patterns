/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_creacionales.builder;

/**
 *
 * @author User
 */
public class App {
    public static void main(String[] args) {
        User usuario=new UserBuilder(1,"thom123").familyName("Roman").build();
        System.out.println(usuario.toString());
        User usuario2 = new UserBuilder(2,"carlos123").name("Carlos").familyName("Perez").tag("Profesor").tag("Programador").build();
        System.out.println(usuario2.toString());
    }
}
