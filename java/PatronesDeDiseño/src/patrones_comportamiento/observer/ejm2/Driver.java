/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.observer.ejm2;

/**
 *
 * @author User
 */
public class Driver {

    public static void main(String[] args) {
        Subject subject = new Subject("Vote ?");
        new ConcrectObserver(subject);
        subject.vote("yes");
        subject.vote("yes");
        subject.vote("no");
        subject.vote("nell");
        subject.vote("no");
    }
}
