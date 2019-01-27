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
    private IConexion conx;
    public BDPersona(IConexion conx){
        this.conx=conx;
    }
    @Override
    public void update(Persona object) {
        conx.conectar();
        System.out.println("Persona "+object.getName()+" actualizada");
        conx.desconectar();
    }

    @Override
    public void insert(Persona object) {
        conx.conectar();
        System.out.println("Persona "+object.getName()+" registrada");
        conx.desconectar();
    }

    @Override
    public void delete(Integer key) {
        //
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

    private static class Conexion {

        public Conexion() {
        }
    }
    
}
