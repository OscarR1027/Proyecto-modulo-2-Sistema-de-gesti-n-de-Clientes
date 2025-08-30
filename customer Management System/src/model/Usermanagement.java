package model;

import java.util.ArrayList;
import java.util.List;

public class Usermanagement {
    
    private List<User> users;
    

    public Usermanagement() {
        this.users = new ArrayList<>();
    }

    public void Usermanagement(List<User> users) {
        this.users = users;
        Usermanagement.add(new User(1,"","Admin","admin123",Userrole.ADMIN));
    }

    public void showAllUsers(){
        for(User user : users){
            System.out.println(user);
        }
    }

    public void showUser(Integer id){
        for(User user : users){
            if(user.getId().equals(id)){
                System.out.println(user);
                return;
            }
        }
        System.out.println("User not found");
    } 
    //TODO: Falta implementar el metodo de editar usuario y eliminar usuario}

    public void addUser(User user){
        users.add(user);
        System.out.println("User added successfully");
    } 
    //TODO: Falta escribir bien el metodo de agregar usuario
}

