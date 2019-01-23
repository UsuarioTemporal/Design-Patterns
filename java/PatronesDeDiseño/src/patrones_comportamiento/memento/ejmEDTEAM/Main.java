/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.memento.ejmEDTEAM;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        CareTaker careTaker=new CareTaker();
        Originator originator=new Originator();
        originator.setState("A");
        careTaker.addMemento(originator.save());
        originator.setState("B");
        careTaker.addMemento(originator.save());
        originator.setState("C");
//        System.out.println(careTaker.getMemento(0).getState());
//        System.out.println(careTaker.getMemento(1).getState());
        careTaker.getStates();
    }
}
