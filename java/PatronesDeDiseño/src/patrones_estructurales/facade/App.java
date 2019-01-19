package patrones_estructurales.facade;
public class App {
    public static void main(String[] args) {
        CheckFacade iniciar  = new CheckFacade();
        iniciar.buscar("12-12-12", "13-13-13","Lima", "Chile");
    }
}
