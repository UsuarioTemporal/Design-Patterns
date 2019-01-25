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
public class PesoArgObserver implements Observador{
    private Sujeto subject;
    public PesoArgObserver(Sujeto subject) {
		this.subject = subject;
		this.subject.addObserver(this);
	}
	
	@Override
	public void update() {		
		System.out.println("ARG: " + (subject.getState()* 29.86));
	}
}
