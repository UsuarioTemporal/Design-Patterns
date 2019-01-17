
package patrones_creacionales.singleton;


public class Conexion {
    private static Conexion instancia;
    private Conexion(){
        
    }
    
    public static Conexion getInstacia(){
        if(instancia==null){
            return new Conexion();
        }
        return instancia;
    }
    
    public void conectar(){
        System.out.println("Me conecté ala BD");
    }
    public void desconectar(){
        System.out.println("Me desconecte de la Bd");
    }
}
