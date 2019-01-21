/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_estructurales.proxy.ejemplo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author User
 */
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
    }

    private void decirEstado() {
    }

    private void despedirse() {
    }
    
}
