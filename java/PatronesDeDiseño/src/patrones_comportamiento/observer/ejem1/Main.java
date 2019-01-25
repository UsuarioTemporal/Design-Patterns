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
public final class Main {
    private Main(){
        
    }
    public final static void main(String[] args) {
        Sujeto subject=new Sujeto();
        new PesoArgObserver(subject);
        new SolObserver(subject);
        new PesoMXObserver(subject);
        
        subject.setState(10);
        System.out.println("");
        subject.setState(20);
        
    }
} 
