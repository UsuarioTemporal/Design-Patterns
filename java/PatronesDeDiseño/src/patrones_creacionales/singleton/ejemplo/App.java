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
public class App {
    public static void main(String[] args) {
        PaisDAOImpl dao = new PaisDAOImpl();
        dao.getPaises().forEach(e->System.out.println(e.toString()));
    }
}
