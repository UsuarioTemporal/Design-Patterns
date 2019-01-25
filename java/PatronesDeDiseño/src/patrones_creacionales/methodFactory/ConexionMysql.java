/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_creacionales.methodFactory;

/**
 *
 * @author User
 */
public class ConexionMysql implements IConexion{

    @Override
    public void conectar() {
        System.out.println("Se conecto a MYSQL");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconecto a MYSQL");
    }
    
}
