/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.observer.ejm2;

import java.util.Observable;

/**
 *
 * @author User
 */
public class Subject extends Observable{
    private String question;
    private int yesCount=0;
    private int noCount=0;

    public Subject(String question) {
        this.question=question;
    }
    public void vote(String vote){
        if("yes".equalsIgnoreCase(vote)){
            yesCount++;
            setChanged();
        }else if("no".equalsIgnoreCase(vote)){
            noCount++;
            setChanged();
        }
        notifyObservers(vote);
    }

    public int getNoCount() {
        return noCount;
    }

    public int getYesCount() {
        return yesCount;
    }
    
    
}
