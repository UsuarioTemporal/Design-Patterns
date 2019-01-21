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
public class CuentaProxy implements ICuenta{
    private CuentaBancoAImple cuentaReal;
    public CuentaProxy(){
        cuentaReal=null;
    }
    @Override
    public Cuenta retirarDinero(Cuenta cuenta, double monto) {
        if(cuentaReal==null){
            cuentaReal=new CuentaBancoAImple();
        }
        return cuentaReal.retirarDinero(cuenta, monto);
    }

    @Override
    public Cuenta depositarDinero(Cuenta cuenta, double monto) {
        if(cuentaReal==null){
            cuentaReal=new CuentaBancoAImple();
        }
        return cuentaReal.depositarDinero(cuenta, monto);
    }

    @Override
    public void mostrarSaldo(Cuenta cuenta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
