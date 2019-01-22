/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.command.ejm1;

/**
 *
 * @author User
 */
public class RealReceiver implements Receiver{

    @Override
    public void hacerAlgo() {
        System.out.println("Accion concretada por el receptor");
    }
    
}
