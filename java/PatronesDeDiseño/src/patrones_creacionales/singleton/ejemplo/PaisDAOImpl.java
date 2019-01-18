/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_creacionales.singleton.ejemplo;

import java.util.LinkedList;

/**
 *
 * @author User
 */
public class PaisDAOImpl {
    private static LinkedList<Pais> paises=null;
    public LinkedList<Pais> getPaises(){
        if(paises==null){
            paises=new LinkedList<>();
            paises.add(new Pais("Peru"));
            paises.add(new Pais("Colombia"));
            paises.add(new Pais("Chile"));
            paises.add(new Pais("Mexico"));
            
        }
        return paises;
        
    }
    
}
