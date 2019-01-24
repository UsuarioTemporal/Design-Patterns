/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.command.ejmGithub.spell.commands;

/**
 *
 * @author User
 */
public enum Size {
    SMALL("small"),NOMAL("normal"),LARGE("large"),UNDEFINED("");
    private String title;
    Size(String title) {
        this.title=title;
    }

    @Override
    public String toString() {
        return title;
    }
    
}
