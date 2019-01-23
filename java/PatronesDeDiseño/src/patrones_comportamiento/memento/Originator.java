/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.memento;

/**
 *
 * @author User
 */
public class Originator {
    private Juego estado;

    public void setEstado(Juego estado) {
//        this.estado=estado;
        this.estado=new Juego();
        this.estado.setNombre(estado.getNombre());
        this.estado.setPuntaje(estado.getPuntaje());
    }
    public Memento save(){
        return new Memento(estado);
    }
    
    public void restore(Memento memento){
        estado=memento.getEstado();
    }
}
