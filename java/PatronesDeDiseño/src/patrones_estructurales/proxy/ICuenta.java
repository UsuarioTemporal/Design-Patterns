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
public interface ICuenta {
    Cuenta retirarDinero(Cuenta cuenta,double monto);
    Cuenta depositarDinero(Cuenta cuenta,double monto);
    void mostrarSaldo(Cuenta cuenta);
}
