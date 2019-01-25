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
public class ConexionPostgreSQL implements IConexion{

    @Override
    public void conectar() {
        System.out.println("Se conecto a PostgreSQL");
    }
    @Override
    public void desconectar() {
        System.out.println("Se desconecto a PostgreSQL");
    }
}
