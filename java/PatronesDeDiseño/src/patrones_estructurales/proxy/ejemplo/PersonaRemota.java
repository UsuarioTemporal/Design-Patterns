package patrones_estructurales.proxy.ejemplo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class PersonaRemota implements Runnable{
    private Thread thread;
    protected ServerSocket socket; // abrira un puerto para escuchar la peticiones que se realicen
    protected PrintWriter salida;
    protected Socket comunicacionSocket;
    public PersonaRemota(){
        try {
            socket=new ServerSocket(45454);
            comunicacionSocket=socket.accept();
            salida=new PrintWriter(comunicacionSocket.getOutputStream(),true);
            thread = new Thread(this);
            thread.start();
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
    }
    @Override
    public void run() {
        String textoEntrada;
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(comunicacionSocket.getInputStream()));
            while((textoEntrada=in.readLine())!=null){
                if(textoEntrada.equals("saludar")){
                    saludar();
                }else if(textoEntrada.equals("decirEstado")){
                    decirEstado();
                }else if(textoEntrada.equals("despedirse")){
                    despedirse();
                }
            }
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
    }

    private void saludar() {
        System.out.println("Hola ...");
    }

    private void decirEstado() {
        System.out.println("Contento...");
    }

    private void despedirse() {
        System.out.println("Adios...");
    }
    
}
