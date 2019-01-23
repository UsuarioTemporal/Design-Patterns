/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.command.ejm2;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 *
 * @author User
 */
public class Invoker {
    private Deque<Order> ordenes = new LinkedList<>();
    private Map<String,Order> ordenesMap=new HashMap<>();
    
    public void add(Order order){
    }
    
    public void invoker(String key){
        
    }
    
    public void keys(){
        
    }
    
    
}
