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
public class App {
    public static void main(String[] args) {
        ConexionFabrica fabrica=new ConexionFabrica();
        IConexion cx1 = fabrica.getConexion("ORACLE");
        cx1.conectar();
        cx1.desconectar();
        
        IConexion cx2 = fabrica.getConexion("MYSQL");
        cx2.conectar();
        cx2.desconectar();
    }
}
