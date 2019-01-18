/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_creacionales.prototipo.ejemplos;

/**
 *
 * @author User
 */
public class Factory {
    public Persona getPersona(String type){
        if(type.equalsIgnoreCase("ALUMNO")){
            return new Alumno();
        }else{
            return new Profesor();
        }
    }
}
