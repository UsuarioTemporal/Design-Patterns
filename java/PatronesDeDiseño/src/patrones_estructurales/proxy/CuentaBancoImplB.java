/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_estructurales.proxy;

/**
 *
 * @author User
 */
public class CuentaBancoImplB implements ICuenta{

    @Override
    public Cuenta retirarDinero(Cuenta cuenta, double monto) {
        double saldoActual = cuenta.getSaldoInicial()-monto - 10;
        cuenta.setSaldoInicial(saldoActual);
        System.out.println("El saldo actual es : "+cuenta.getSaldoInicial());
        return cuenta;
    }

    @Override
    public Cuenta depositarDinero(Cuenta cuenta, double monto) {
        double saldoActual = cuenta.getSaldoInicial()+monto+65;
        cuenta.setSaldoInicial(saldoActual);
        System.out.println("El saldo actual es : "+cuenta.getSaldoInicial());
        return cuenta;
    }

    @Override
    public void mostrarSaldo(Cuenta cuenta) {
        System.out.println(cuenta.getSaldoInicial());
    }
    
}
