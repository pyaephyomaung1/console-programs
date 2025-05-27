package ContactApp;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactApp {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Contact> contacts = new ArrayList<>();
    public static void showMenu() {
        System.out.println("Welcome to the Contact App");
        System.out.println("1. Add Contact");
        System.out.println("2. View Contacts");
        System.out.println("3. Search Contact");
        System.out.println("4. Delete Contact");
        System.out.println("5. Exit");
    }
    public static void addContact(){
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        contacts.add(new Contact(name, phoneNumber, email));
        System.out.println("Contact added successfully!");
    }
    public static void viewContacts(){
        if (contacts.isEmpty()){
            System.out.println("No contacts available.");
        } else {
           System.out.println("Contacts List:");
            for (Contact contact : contacts){
                contact.displayContact();
                System.out.println("---------------------");
            }
        }
    }
    public static void deleteContact(){
        System.out.println("Enter the name of the contact to delete: ");
        String deleteName = scanner.nextLine();
        boolean removed = contacts.removeIf(c -> c.name.equalsIgnoreCase(deleteName));
        if (removed) {
            System.out.println("Contact deleted successfully!");
        } else {
            System.out.println("Contact not found.");
        }
    }
    public static void searchContact(){
        System.out.println("Enter the name of the contact to search: ");
        String searchName = scanner.nextLine();
        boolean found = false;
        for (Contact contact : contacts){
            if (contact.name.equalsIgnoreCase(searchName)){
                contact.displayContact();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Contact not found.");
        }
    }
    public static void main(String[] args){
        int choice;
        do {
            showMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 1 -> addContact();
                case 2 -> viewContacts();
                case 3 -> searchContact();
                case 4 -> deleteContact();
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while(choice != 5);
        scanner.close();
    }
}
