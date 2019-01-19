/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_creacionales.prototipo.ejemplos;

/**
 *
 * @author User
 */
public class App {
    public static void main(String[] args) {
        Factory fabrica =new Factory();
        Persona p1 = fabrica.getPersona("Alumno");
        p1.setNombre("Thom");
        p1.setEdad(21);
        Persona p2 = p1.clonar();
        p2.setNombre("Carlos");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1==p2);
    }
}
