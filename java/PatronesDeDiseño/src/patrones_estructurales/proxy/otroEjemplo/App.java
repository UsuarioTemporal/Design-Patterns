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

    private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    private static Servidor proxy = new Proxy(new RealServer("miserver"));

    public static void main(String[] args) {
        String respuesta, nombre, id;
            try {
                do {
                    System.out.println("Entrando");
                    System.out.println("\n\nOperaciones del servidor : ");
                    System.out.println("1. Subir fichero ");
                    System.out.println("2. descargar fichero ");
                    System.out.println("3. Listado ficheros");
                    respuesta = entrada.readLine();
                    switch (respuesta) {
                        case "1":
                            System.out.println("Introduzca nombre de fichero ");
                            nombre=entrada.readLine();
                            System.out.println(proxy.subir(nombre));
                            break;
                        case "2":
                            System.out.println("Introduzca nombre de fichero ");
                            nombre=entrada.readLine();
                            System.out.println(proxy);
                            break;
                        case "3":
                            System.out.println("");
                            break;
                       
                    }
                    
                } while (true);
            } catch (Exception e) {
            }
    }
}
