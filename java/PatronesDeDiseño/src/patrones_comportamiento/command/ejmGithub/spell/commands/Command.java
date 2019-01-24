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
public interface Command {
    void execute();
    void undo();
    void redo();

    @Override
    String toString();
    
}
