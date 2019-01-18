package patrones_creacionales.prototipo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CuentaAHIimpl implements Icuanta {

    private String tipo;
    private double monto;

    public CuentaAHIimpl() {
        tipo = "AHORRO";
    }

    @Override
    public Icuanta clonar() {
        CuentaAHIimpl cuenta = null;
        try {
            cuenta = (CuentaAHIimpl) clone();
            return cuenta;
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(CuentaAHIimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cuenta;
    }

    @Override
    public String toString() {
        return "CuentaAHIimpl{" + "tipo=" + tipo + ", monto=" + monto + '}';
    }

}
