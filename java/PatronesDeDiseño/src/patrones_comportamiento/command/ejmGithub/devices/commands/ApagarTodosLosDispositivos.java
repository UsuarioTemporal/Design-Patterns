/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.command.ejmGithub.devices.commands;

import java.util.LinkedList;
import patrones_comportamiento.command.ejmGithub.devices.devices.ElectronicDevice;

/**
 *
 * @author EncenderApagarTodosDEvices : Significa el commando real
 */
public class ApagarTodosLosDispositivos implements Command{
    private LinkedList<ElectronicDevice> dispositivos;

    public ApagarTodosLosDispositivos(LinkedList<ElectronicDevice> nuevosDispositvos) {
        dispositivos=nuevosDispositvos;
    }
    
    @Override
    public void execute() {
        dispositivos.forEach((e)->{
            e.off();
        });
    }

    @Override
    public void undo() {
        dispositivos.forEach((e)->{
            e.on();
        });
    }
    
}
