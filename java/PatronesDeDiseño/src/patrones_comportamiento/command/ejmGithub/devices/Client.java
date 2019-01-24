/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.command.ejmGithub.devices;

import patrones_comportamiento.command.ejmGithub.devices.commands.EncenderDevice;
import patrones_comportamiento.command.ejmGithub.devices.commands.VolumenUp;
import patrones_comportamiento.command.ejmGithub.devices.devices.ElectronicDevice;
import patrones_comportamiento.command.ejmGithub.devices.devices.Television;

/**
 *
 * @author User
 */
public class Client {
    public static void main(String[] args) {
        ElectronicDevice tele=new Television("Samsumg");
        DeviceButton boton=new DeviceButton(new EncenderDevice(tele));
        
        boton.press();
        boton=new DeviceButton(new VolumenUp(tele));
        boton.press();
        boton.press();
        boton.press();
    }
}
