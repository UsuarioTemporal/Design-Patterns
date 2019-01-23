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
public class RealOrder2 implements Order{

    private Receiver1 receive1;

    public RealOrder2(Receiver1 receiver1) {
        this.receive1=receiver1;
    }
    
    @Override
    public void execute() {
        receive1.action2();
    }

    @Override
    public String name() {
        return "OrdenReal2";
    }

    @Override
    public void icon() {
    }
    
}
