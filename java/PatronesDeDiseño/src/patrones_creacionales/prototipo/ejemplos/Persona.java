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
public abstract class Persona implements Cloneable{
    private String nombre;
    private int edad;
    
    abstract Persona clonar();
}
