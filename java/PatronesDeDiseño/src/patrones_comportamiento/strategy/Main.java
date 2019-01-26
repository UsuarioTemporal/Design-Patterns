/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.strategy;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Contexto contexto=new Contexto(new AntivirusAvanzado());
        contexto.ejecutar();
        contexto=new Contexto(new AntivirusSimple());
        contexto.ejecutar();
    }
}
