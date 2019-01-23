/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.memento;

import java.util.LinkedList;

/**
 *
 * @author User
 */
public class CareTaker {
    private LinkedList<Memento> mementos = new LinkedList<>();
    public void addMemento(Memento memento){
        mementos.add(memento);
    }
    
    public Memento getState(int position){
        return mementos.get(position);
    }
    
    public void getStates(){
        mementos.forEach((e)->{
            System.out.println(e.getEstado());
        });
    }
}
