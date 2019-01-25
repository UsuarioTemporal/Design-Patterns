/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.observer.ejem1;

import java.util.LinkedList;

/**
 *
 * @author User
 */
public class Observable {
    private final LinkedList<Observador> observers =new LinkedList<>();
    
    public void addObserver(Observador obbserver){
        observers.add(obbserver);
    }
    
    public void notifyObservers(){
        observers.forEach((e)->e.update());
    }
}
