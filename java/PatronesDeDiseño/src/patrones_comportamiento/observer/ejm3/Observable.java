/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.observer.ejm3;

import java.util.LinkedList;

/**
 *
 * @author User
 */
public class Observable {
    private LinkedList<Observer> observers=new LinkedList<>();
    
    public void attach(Observer observer){
        observers.add(observer);
    }
    public void notifyObservers(){
        observers.forEach((e)->e.update());
    }
    
}
