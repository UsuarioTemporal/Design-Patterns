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

//receiver / request
public class Cuenta {
    private int id;
    private double saldo;
    
    public Cuenta(int id,double saldo){
        this.id=id;
        this.saldo=saldo;
    }
    
    
    public void retirar(double monto){
        this.saldo-=monto;
        System.out.println("[Comando retirar] cuenta : "+id + " saldo : "+this.saldo);
    }
    public void depositar(double monto){
        this.saldo+=monto;   
        System.out.println("[Comando despositar] cuenta : "+id + " saldo : "+this.saldo);
    }
}
