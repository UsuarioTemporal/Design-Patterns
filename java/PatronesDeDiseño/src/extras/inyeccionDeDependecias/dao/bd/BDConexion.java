/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras.inyeccionDeDependecias.dao.bd;

/**
 *
 * @author User
 */
public class BDConexion { // singleton
    private static BDConexion conexionBD;
    private BDConexion(){
        
    }
    public BDConexion getInstance(){
        if(conexionBD==null){
            conexionBD=new BDConexion();
        }
        return conexionBD;
    }
}
