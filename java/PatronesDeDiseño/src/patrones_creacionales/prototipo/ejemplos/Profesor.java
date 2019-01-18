/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_creacionales.prototipo.ejemplos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Profesor extends Persona{
    
    @Override
    Persona clonar() {
            Profesor p = null;
        try {
            p = (Profesor) clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }

    
}
