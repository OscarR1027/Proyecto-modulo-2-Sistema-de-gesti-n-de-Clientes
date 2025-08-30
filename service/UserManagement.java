package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import exceptions.ExistingUser;
import exceptions.Usernotfound;
import model.User;
import model.Userrole;

public class UserManagement {
    
    private List<User> userBase;
    

    public UserManagement() {
        this.userBase = new ArrayList<>();
        initializeDefaultAdmin(userBase);
    }

    public void initializeDefaultAdmin(List<User> users) {
        userBase.add(new User(1,"","Admin","admin123",Userrole.ADMIN));
    }

    public void showAllUsers(){
        for(User user : userBase){
            System.out.println(user);
        }
    }

    public void searchUser(Integer id) throws Usernotfound{
        Optional<User> searchUser = userBase.stream()
            .filter(userBase -> userBase.getId().equals(id))
            .findFirst();
        if (searchUser.isPresent()) {
            System.out.println(searchUser.get());
        } else {
            throw new Usernotfound("User with ID " + id + " not found.");
    } 
    
    }
    //TODO: Falta implementar el metodo de editar usuario y eliminar usuario}
    public void addUser(User user)throws ExistingUser{
        if(userBase.contains(user)){
            throw new ExistingUser("User with ID " + user.getId() + " already exists.");
        } else {
            userBase.add(user);
            System.out.println("User added successfully: " + user);
        }
    }


    public void deleteUser(Integer id) throws Usernotfound{
        Optional<User> deleteUser= userBase.stream()
            .filter(userBase -> userBase.getId().equals(id))
            .findFirst();
            if(deleteUser.isPresent()){
                userBase.remove(deleteUser.get());
                System.out.println("User with ID " + id + " has been deleted.");
            } else {
                throw new Usernotfound("User with ID " + id + " not found.");
            }

    }
    public void editUser(Integer id, String newUsername, String newPassword) throws Usernotfound {
        Optional<User> editUser = userBase.stream()
            .filter(userBase -> userBase.getId().equals(id))
            .findFirst();
        if (editUser.isPresent()) {
            User user = editUser.get();
            user.setUsername(newUsername);
            user.setPassword(newPassword);
            System.out.println("User updated successfully: " + user);
        } else {
            throw new Usernotfound("User with ID " + id + " not found.");
        }
    }

    private User getUserById(Integer id) throws Usernotfound {
       Optional<User> user = userBase.stream()
            .filter(userBase -> userBase.getId().equals(id))
            .findFirst();
            return user.orElseThrow(() -> new Usernotfound("User with ID " + id + " not found."));
    }


    
  
}

