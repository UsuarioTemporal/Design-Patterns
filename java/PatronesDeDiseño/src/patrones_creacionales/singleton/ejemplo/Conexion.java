/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_creacionales.singleton.ejemplo;

/**
 *
 * @author User
 */
public class Conexion {
    private static Conexion instacia ;
    private Conexion(){
    
    }
    
    public static Conexion getInstance (){
        if(instacia==null){
            instacia=new Conexion();
        }
        return instacia;
    }
}
