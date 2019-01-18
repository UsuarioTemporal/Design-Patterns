package patrones_creacionales.prototipo;
public class App {
    public static void main(String[] args) {
        CuentaAHIimpl cuentaAhorro = new CuentaAHIimpl();
        cuentaAhorro.setMonto(200);
        CuentaAHIimpl cuentaClonada = (CuentaAHIimpl) cuentaAhorro.clonar();
        if(cuentaClonada!=null){
            System.out.println(cuentaClonada);
        }
        System.out.println(cuentaAhorro==cuentaClonada);
    }
}
