/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.observer.ejm1;

/**
 *
 * Concrect Subject
 */
public class Sujeto extends Observable{
    private int state; // esto representara al objeto que cambiara

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }
}