/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_creacionales.fabrica;

/**
 *
 * @author User
 */
public class ConexionFabrica {

    public IConexion getConexion(String motor) {
        if (motor.equalsIgnoreCase("MYSQL")) {
            return new ConexionMysql();
        } else if (motor.equalsIgnoreCase("POSTGRESQL")) {
            return new ConexionPostgreSQL();
        } else {
            return new ConexionOracle();
        }
    }
}
