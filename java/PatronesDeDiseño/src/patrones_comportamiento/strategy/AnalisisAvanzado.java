/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.strategy;

/**
 *
 * @author User
 */
public abstract class AnalisisAvanzado implements IEstrategia{

    @Override
    public void analizar() {
        iniciar();
        analizarMemoria();
        analizarKeyLoggers();
        analizarRootKits();
        descomprimirZip();
        detener();
    }
    public abstract void iniciar();
    public abstract void detener();
    public abstract void analizarMemoria();
    public abstract void analizarKeyLoggers();
    public abstract void analizarRootKits();
    public abstract void descomprimirZip();
}
