/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_estructurales.decorador.ejm;

/**
 *
 * @author User
 */
public abstract class DecoradorHamburgesa implements IHambuerguesa{
    
    protected IHambuerguesa hamburguesaDecorada;
    
    public DecoradorHamburgesa(IHambuerguesa hamburguesaDecorada){
        this.hamburguesaDecorada=hamburguesaDecorada;
    }
    
}
