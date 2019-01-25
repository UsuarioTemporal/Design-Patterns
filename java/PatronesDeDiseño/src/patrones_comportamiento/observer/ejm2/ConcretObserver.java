/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.observer.ejm2;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author User
 */
public class ConcretObserver implements Observer{

    public ConcretObserver(Subject subject) {
        subject.addObserver(this);
        System.out.println("Yes total : "+subject.getYesCount());
        System.out.println("No total : "+subject.getNoCount()+"\n");
    }
    
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("New vote of "+arg+" just arrived ");
    }
    
}
