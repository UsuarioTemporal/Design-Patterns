/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.command.ejm1;

import java.util.LinkedList;

/**
 *
 * @author User
 */
public class Invoker {
    private LinkedList<Receiver> listaReceptores=new LinkedList<>();
    
    public void addCommand(Receiver receiver){
        listaReceptores.add(receiver);
    }
    public void executeCommand(Command command,Receiver receiver){
        listaReceptores.forEach(e->command.execute(e));
    }
}
