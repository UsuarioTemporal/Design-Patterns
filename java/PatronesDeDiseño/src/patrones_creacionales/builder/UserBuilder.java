package patrones_creacionales.builder;

import java.util.LinkedList;


public class UserBuilder {
    private User usuario;
    public UserBuilder(int id,String nick){
        usuario=new User(id, nick);
    }
    
    public UserBuilder name(String name){
        usuario.setName(name);
        return this;
    }
    public UserBuilder phone(String phone){
        usuario.setPhone(phone);
        return this;
    }
    public UserBuilder familyName(String familyName){
        usuario.setFamilyName(familyName);
        return this;
    }
    public UserBuilder tag(String tag){
        LinkedList<String> tagss = usuario.getTags();
        if(tagss==null){
            tagss=new LinkedList<>();
        }
        tagss.add(tag);
        usuario.setTags(tagss);
        return this;
    }
    public User build(){
        return usuario;
    }
    
}
