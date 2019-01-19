/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_creacionales.builder;

import java.util.LinkedList;

/**
 *
 * @author User
 */
public class User {
    private int id;
    private String nick;
    private String name;
    private String familyName;
    private String phone;
    
    private LinkedList<String> tags;
    public User(int id,String nick){
        this.id=id;
        this.nick=nick;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LinkedList<String> getTags() {
        return tags;
    }

    public void setTags(LinkedList<String> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", nick=" + nick + ", name=" + name + ", familyName=" + familyName + ", phone=" + phone + ", tags=" + tags + '}';
    }
    
    
}
