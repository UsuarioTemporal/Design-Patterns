/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_creacionales.singleton;

/**
 *
 * @author User
 */
public class App {
    public static void main(String[] args) {
        Conexion cx = Conexion.getInstacia();
        cx.conectar();
        cx.desconectar();
        boolean rpsta = cx instanceof Conexion;
        System.out.println(rpsta);
    }
}
