/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.observer.ejem1;

import java.util.LinkedList;

/**
 *
 * Subject
 */
public class Observable {
    private final LinkedList<Observer> observers =new LinkedList<>();
    
    public void addObserver(Observer obbserver){
        observers.add(obbserver);
    }
    
    public void notifyObservers(){
        observers.forEach((obs)->obs.update());
    }
}
