/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras.inyeccionDeDependecias.dao.bd;

import extras.inyeccionDeDependecias.dao.interfaz.PersonaDAO;
import extras.inyeccionDeDependecias.model.Persona;
import java.util.List;

/**
 *
 * @author User
 */
public class BDPersona implements PersonaDAO{

    @Override
    public void update(Persona object) {
        System.out.println("Persona "+object.getName()+" actualizada");
    }

    @Override
    public void insert(Persona object) {
        System.out.println("Persona "+object.getName()+" registrada");
    }

    @Override
    public void delete(Integer key) {
        //logica
    }

    @Override
    public List<Persona> show() {
        //logica
        return null;
    }

    @Override
    public Persona showByID(Integer key) {
        //logica
        return null;
    }
    
}
