/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_estructurales.proxy.otroEjemplo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author User
 */
public class App {
    private static BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
    private static Servidor proxy=new Proxy(new RealServer("miserver"));
    public static void main(String[] args) {
        
    }
}
