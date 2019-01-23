/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.command.ejmGithub.devices.devices;

/**
 *
 * @author User
 */
public class Television implements ElectronicDevice{
   private String name;
    private int volumen;

    public Television(String name) {
        volumen = 0;
        this.name = name;
    }

    @Override
    public void on() {
        System.out.println(name + " esta tele esta encendida");
    }

    @Override
    public void off() {
        System.out.println(name + " esta tele esta apagada");
    }

    @Override
    public void volumenUp() {
        volumen++;
        System.out.println(name + " subiendo el volumen de la tele " + volumen);
    }

    @Override
    public void volumenDown() {
        volumen--;
        if (volumen < 0) {
            volumen = 0;
        }
        System.out.println(name + " bajando el volumen de la tele " + volumen);
    }
    
}
