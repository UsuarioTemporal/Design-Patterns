/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.memento.ejmEDTEAM;

import java.util.LinkedList;

/**
 *
 * @author User
 */
public class CareTaker {
    private LinkedList<Memento> mementos=new LinkedList<>();
    public void addMemento(Memento memento){
        mementos.add(memento);
    }
    
    public Memento getMemento(){
        return mementos.get(0);
    }
}
