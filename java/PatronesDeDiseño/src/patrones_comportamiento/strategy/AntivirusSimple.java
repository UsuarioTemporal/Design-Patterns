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
public class AntivirusSimple extends AnalisisSimple{

    @Override
    void iniciar() {
        System.out.println("Antivirus simple inciado");
    }

    @Override
    void saltarZip() {
        try {
            System.out.println("Analizando...");
            Thread.sleep(2500);
            System.out.println("No se pudo analizar los archivos con extencio .zip");
        } catch (InterruptedException ex) {
        }
    }

    @Override
    void detener() {
        System.out.println("Antivitus Simple - analisisi finalizado");
    }

    
}
