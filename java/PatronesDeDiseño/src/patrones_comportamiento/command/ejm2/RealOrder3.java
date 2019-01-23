/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.command.ejm2;

/**
 *
 * @author User
 */
public class RealOrder3 implements Order{
     private Receiver2 receive2;

    public RealOrder3(Receiver2 receiver2) {
        this.receive2=receiver2;
    }
    
    @Override
    public void execute() {
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public void icon() {
    }
}
