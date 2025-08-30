package model;

import java.util.Scanner;

public class Menu {
    

    public void showMainMenu() {
        System.out.println("=== Customer Management System ===");
        System.out.println("1. User Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Exit");
        System.out.print("Select an option: ");
        Scanner scanner = new Scanner(System.in);
       scanner.nextLine();
        switch (scanner.nextInt()) {
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                System.out.println("Exiting the system. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
        scanner.close();
    }
    
}
