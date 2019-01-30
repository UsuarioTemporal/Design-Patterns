/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras.mvc.model.dao.bd;

import extras.mvc.model.dao.interfaces.IPersonaDAO;
import extras.mvc.model.pojo.Persona;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author User
 */
public class BDPersona implements IPersonaDAO{

    @Override
    public List<Persona> listar() {
        List<Persona> personas=new LinkedList<>();
        personas.add(new Persona("Thom",12));
        personas.add(new Persona("Carlos",30));
        personas.add(new Persona("Juan",14));
        return personas;
    }
    
}
