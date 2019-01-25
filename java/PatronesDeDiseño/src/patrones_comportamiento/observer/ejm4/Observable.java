/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.observer.ejm4;

import java.util.LinkedList;

/**
 *
 * @author User
 */
public class Observable {
    private LinkedList<AlarmListener> observables=new LinkedList<>();
    public void register(AlarmListener alarmListener){
        observables.add(alarmListener);
    }
    public void soundTheAlarm(){
        observables.forEach((e)->e.alarm());
    }
}
