/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.command.ejmGithub.devices;

import patrones_comportamiento.command.ejmGithub.devices.commands.Command;

/**
 *
 * @param DeviceButton : Esta clase es el invoker
 */
public class DeviceButton {
    private Command command;
    
    public DeviceButton(Command command) {
        this.command = command;
    }
    public void press(){
        command.execute();
    }
    public void pressUndo(){
        command.undo();
    }
}