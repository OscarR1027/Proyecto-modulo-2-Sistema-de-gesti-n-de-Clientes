package service;

import java.util.Scanner;

public class login {
    Scanner scanner = new Scanner(System.in);

    public User loginUser() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Here you would typically check the credentials against a database or a predefined list
        // For simplicity, we will assume a single user with hardcoded credentials
        if ("admin".equals(username) && "admin123".equals(password)) {
            return new User(1, "Admin User", username, password, Userrole.ADMIN);
        } else if ("user".equals(username) && "user123".equals(password)) {
            return new User(2, "Standard User", username, password, Userrole.Standard);
        } else {
            System.out.println("Invalid credentials. Please try again.");
            return null;
        }
    }

}
