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
public class BDConexion implements IConexion{ // singleton
    private static IConexion conexionBD;
    private BDConexion(){
        
    }
    public static BDConexion getInstance(){
        if(conexionBD==null){
            conexionBD=new BDConexion();
        }
        return (BDConexion) conexionBD;
    }
    
    @Override
    public void conectar(){
        System.out.println("Conectado");
    }
    @Override
    public void desconectar(){
        System.out.println("Desconectar");
    }
}
