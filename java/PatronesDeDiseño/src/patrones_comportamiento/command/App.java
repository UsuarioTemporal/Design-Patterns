/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.command;

/**
 *
 * @author User
 */
public class App {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1, 1000);
        DepositarImpl opDepositar=new DepositarImpl(cuenta, 100);
        RetirarImpl opRetirar=new RetirarImpl(cuenta, 500);
        Invoker ivk = new Invoker();
        ivk.recibirOpeacion(opDepositar);
        ivk.recibirOpeacion(opRetirar);
        ivk.realizarOperaciones();
    } 
}
