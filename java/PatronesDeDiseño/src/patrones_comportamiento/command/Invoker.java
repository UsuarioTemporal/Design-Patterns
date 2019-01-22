/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.command;

import java.util.LinkedList;

/**
 *
 * @author User
 */
public class Invoker {
    private LinkedList<IOperacion> operaciones = new LinkedList<>();
    public void recibirOpeacion(IOperacion operacion){
        operaciones.add(operacion);
    }
    
    public void realizarOperaciones(){
        operaciones.forEach(e->e.execute());
    }
} // responsable de apilar las operaciones
