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
public class Alumno extends Persona {
    
    @Override
    Persona clonar() {
        Alumno a = null;
        try {
            a = (Alumno) clone();
        } catch (CloneNotSupportedException e) {
        }
        return a;
    }
}
