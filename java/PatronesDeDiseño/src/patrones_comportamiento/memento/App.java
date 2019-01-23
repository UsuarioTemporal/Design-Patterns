package patrones_comportamiento.memento;

public class App {
    public static void main(String[] args) {
        CareTaker careTaker =new CareTaker();
        Originator originator=new Originator();
        Juego juego=new Juego();
        juego.setNombre("Crash");
        juego.setPuntaje(1);
        originator.setEstado(juego);
        careTaker.addMemento(originator.save());
        juego.setPuntaje(15);
        originator.setEstado(juego);
        careTaker.addMemento(originator.save());
        careTaker.getStates();
        juego=careTaker.getState(0).getEstado();
        System.out.println(juego);
    }
}
