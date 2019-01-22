/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_estructurales.proxy.otroEjemplo;


/**
 *
 * @author User
 */
public class Fichero {
    private String id;
    private String name;
    private Fecha creationDate;
    private static int count = 0;
    
    
    public Fichero(String path){
        count++;
        this.id=Integer.toString(count);
        this.name = path;
        creationDate =new Fecha();
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fecha getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Fecha creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Fichero{" + "id=" + id + ", name=" + name + ", creationDate=" + creationDate + '}';
    }
    
}
