/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.command.ejm1;

/**
 *
 * @author User
 */
public class App {
    public static void main(String[] args) {
        Invoker invocador=new Invoker();
        RealReceiver receptor=new RealReceiver();
        invocador.addCommand(receptor);
        invocador.addCommand(new RealReceiver());
        invocador.addCommand(new RealReceiver());
        invocador.executeCommand(new RealCommand(), receptor);
    }
}
