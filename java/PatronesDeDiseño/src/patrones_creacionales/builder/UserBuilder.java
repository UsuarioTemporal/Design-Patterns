package patrones_creacionales.builder;


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
    
    
}
