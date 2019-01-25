/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.observer.ejm1;

/**
 *
 * @author User
 */
public class SolObserver implements Observer{
    private Sujeto subject;
    public SolObserver(Sujeto subject) {
        this.subject=subject;
        subject.addObserver(this);
    }
    
    @Override
    public void update() {
        System.out.println("PEN: "+(subject.getState()*3.25));
    }
    
}
