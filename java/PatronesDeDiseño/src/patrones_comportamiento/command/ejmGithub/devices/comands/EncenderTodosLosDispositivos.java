/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.command.ejmGithub.devices.comands;

import java.util.LinkedList;
import patrones_comportamiento.command.ejmGithub.devices.devices.ElectronicDevice;

/**
 *
 * @author User
 */
public class EncenderTodosLosDispositivos implements Command{
    
    private LinkedList<ElectronicDevice> dispositivos;

    public EncenderTodosLosDispositivos(LinkedList<ElectronicDevice> nuevosDispositivos) {
        dispositivos=nuevosDispositivos;
    }
    
    @Override
    public void execute() {
        dispositivos.forEach((e)->{
            e.on();
        });
    }

    @Override
    public void undo() {
        dispositivos.forEach((e)->{
            e.off();
        });
    }
    
}
