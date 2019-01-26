/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.strategy;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class AntivirusAvanzado extends AnalisisAvanzado {

    @Override
    public void iniciar() {
        System.out.println("Antivirus avanzado inciado");
    }

    @Override
    public void detener() {
        System.out.println("Antivitus avanzado - analisis finalizado");
    }

    @Override
    public void analizarMemoria() {

        try {
            System.out.println("Analizando la memoria RAM");
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
        }
    }

    @Override
    public void analizarKeyLoggers() {
        try {
            System.out.println("Analizando en busca de Keyloggers...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void analizarRootKits() {
        try {
            System.out.println("Analizando en busca de RootKits...");
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void descomprimirZip() {
        try {
            System.out.println("Analizando archivos zip...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
