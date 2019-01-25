/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.observer.ejem1;

/**
 *
 * @author User
 */
public class PesoMXObserver implements Observer{
    private Sujeto subject;

    public PesoMXObserver(Sujeto subject) {
        this.subject = subject;
        subject.addObserver(this);
    }
    
    @Override
    public void update() {
        System.out.println("MX: " + (subject.getState()* 19.07));
    }
    
}
