package com.bank;

import com.bank.model.Account;
import com.bank.service.AccountManager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AccountManager manager = new AccountManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== Bank Account Management System ===");

        while (running) {
            System.out.println("\n1. Add Account");
            System.out.println("2. Display All Accounts");
            System.out.println("3. Find Account by Number");
            System.out.println("4. Delete Account");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String accNum = scanner.nextLine();
                    System.out.print("Enter Holder Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double balance = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Account Type (Savings/Current): ");
                    String type = scanner.nextLine();

                    manager.addAccount(new Account(accNum, name, balance, type));
                    break;

                case 2:
                    manager.displayAllAccounts();
                    break;

                case 3:
                    System.out.print("Enter Account Number to search: ");
                    String searchNum = scanner.nextLine();
                    Account found = manager.getAccount(searchNum);
                    if (found != null) {
                        System.out.println("Account Found: " + found);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number to delete: ");
                    String delNum = scanner.nextLine();
                    if (manager.deleteAccount(delNum)) {
                        System.out.println("Account deleted successfully.");
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
