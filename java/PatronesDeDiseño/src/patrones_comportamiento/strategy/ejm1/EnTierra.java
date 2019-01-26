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
public class EnTierra implements Algoritmo{

    @Override
    public void move() {
        System.out.println("Por tierra");
    }
}
