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
public class Originator { // punto de partida
    private String state;

    public void setState(String state) {
        this.state = state;
    }
    public Memento save(){
        return new Memento(state);
    }
    public void restore(Memento memento){
        state=memento.getState();
    }
}
