package model;

public class User{

private Integer id;
private String name;
private String username;
private String password;
 private Userrole role;
 private Actionshistory actionHistory;
public User (Integer id, String name, String username, String password, Userrole role) {
    this.id = id;
    this.name = name;
    this.username = username;
    this.password = password;
    this.role = role;
}
public User(Integer id, String name, String username, String password) {
    this.id = id;
    this.name = name;
    this.username = username;
    this.password = password;
    this.role= Userrole.Standard; // Default role
}
public Actionshistory[]{
    

}
//TODO: Me falta implementar la clase Actionshistory

public Integer getId() {
    return id;
}
public String getName() {
    return name;
}
public String getUsername() {
    return username;
}
public void setUsername(String username) {
    this.username = username;
}
public void setPassword(String password) {
    this.password = password;
}
@Override
public String toString() {
    return "User [id=" + id + ", name=" + name + ", username=" + username + ", role=" + role + "]";










}