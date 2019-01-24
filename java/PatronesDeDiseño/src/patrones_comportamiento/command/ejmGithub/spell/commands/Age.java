/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_comportamiento.command.ejmGithub.spell.commands;

import sun.management.Agent;

/**
 *
 * @author User
 */
public enum Age {
    CHILD("small"), ADULT("adult"), ELDER("elder"), UNDEFINED("");
    private String title;

    private Age(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

}
