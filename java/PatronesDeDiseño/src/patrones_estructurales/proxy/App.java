package patrones_estructurales.proxy;
public class App {
    public static void main(String[] args) {
        Cuenta c=new Cuenta(1, "Thom", 2000);
        ICuenta proxy =new CuentaProxy(new CuentaBancoImplB());
        c=proxy.depositarDinero(c,120);
        proxy.mostrarSaldo(c);
        c=proxy.retirarDinero(c, 100);
        proxy.mostrarSaldo(c);
        proxy =new CuentaProxy(new CuentaBancoAImple());
        c=proxy.depositarDinero(c,120);
        proxy.mostrarSaldo(c);
        c=proxy.retirarDinero(c, 100);
        proxy.mostrarSaldo(c);
    }
}
//intermediario entre el cliente y el objeto destino