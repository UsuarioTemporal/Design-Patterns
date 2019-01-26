/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.strategy.ejm1;

/**
 *
 * @author User
 */
public abstract class Avion {
    private Algoritmo algoritmo;
    
    public void setAlgoritmo(Algoritmo algoritmo){
        this.algoritmo=algoritmo;
    }
    public void mover(){
        this.algoritmo.move();
    }
}
