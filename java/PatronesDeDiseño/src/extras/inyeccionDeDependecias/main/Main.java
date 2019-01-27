/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras.inyeccionDeDependecias.main;

import extras.inyeccionDeDependecias.dao.bd.BDConexion;
import extras.inyeccionDeDependecias.dao.bd.BDPersona;
import extras.inyeccionDeDependecias.dao.bd.IConexion;
import extras.inyeccionDeDependecias.model.Persona;


/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        IConexion conx = BDConexion.getInstance();
        BDPersona bdPersona=new BDPersona(conx);
        bdPersona.insert(new Persona(1, "thom"));
        bdPersona.insert(new Persona(2, "Carlos"));
        
    }

}
