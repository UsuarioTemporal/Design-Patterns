/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras.mvc.controller;

import extras.mvc.model.dao.bd.BDPersona;
import extras.mvc.model.dao.interfaces.IPersonaDAO;
import extras.mvc.model.pojo.Persona;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author User
 */
public class PersonaControlador {
    private List<Persona> lista;
    private IPersonaDAO dao;

    public PersonaControlador() {
        lista=new LinkedList<>();
        dao=new BDPersona();
    }
    
    public void listar(){
        lista = dao.listar();
    }

    public List<Persona> getLista() {
        return lista;
    }

    public void setLista(List<Persona> lista) {
        this.lista = lista;
    }

    public IPersonaDAO getDao() {
        return dao;
    }

    public void setDao(IPersonaDAO dao) {
        this.dao = dao;
    }
    
    
}
