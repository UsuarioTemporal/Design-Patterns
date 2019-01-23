/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.memento;

/**
 *
 * @author User
 */
public class Juego {
    private String nombre;
    private int puntaje;

    public int getPuntaje() {
        return puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPuntaje(int checkpoint) {
        this.puntaje = checkpoint;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Juego{" + "nombre=" + nombre + ", checkpoint=" + puntaje + '}';
    }
    
    
}
