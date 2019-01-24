/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.command.ejmGithub.devices.commands;

import patrones_comportamiento.command.ejmGithub.devices.devices.ElectronicDevice;

/**
 *
 * @author User
 */
public class VolumenUp implements Command{
    private ElectronicDevice device;

    public VolumenUp(ElectronicDevice device) {
        this.device = device;
    }
    
    @Override
    public void execute() {
        device.volumenUp();
    }

    @Override
    public void undo() {
        device.volumenDown();
    }
}
