/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.strategy.ejm1;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        AvionRapido avionRapido=new AvionRapido();// contexto
        avionRapido.setAlgoritmo(new EnAire()); // insrtando la estrategia
        avionRapido.mover();
    }
}
