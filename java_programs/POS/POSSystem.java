package POS;


// package java_programs.POS;

import java.util.Scanner;

public class POSSystem {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Cart cart = new Cart();

    private static final Item[] itemsAvailable = {
        new Item("Apple", 2.0),
        new Item("Orange", 2.0),
        new Item("Banana", 1.0),
        new Item("Grapes", 3.0),
        new Item("Watermelon", 5.0),
        new Item("Milk", 1.5),
        new Item("Bread", 2.0),
        new Item("Butter", 2.5)
    };

    public static void showMenu() {
        System.out.println("1. Add item to cart");
        System.out.println("2. View cart");
        System.out.println("3. Complete sale");
        System.out.println("4. Exit");
    }

    public static void main(String[] args) {
        while (true) {
            showMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addItemToCart();
                    break;
                case 2:
                    cart.viewCart();
                    break;
                case 3:
                    completeSale();
                    return;
                case 4:
                    System.out.println("Exiting POS system...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addItemToCart() {
        System.out.print("Enter the item name: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        Item item = findItemByName(itemName);
        if (item != null) {
            cart.addItem(item, quantity);
            System.out.println("Item added to cart.");
        } else {
            System.out.println("Item not found.");
        }
    }

    private static Item findItemByName(String itemName) {
        for (Item item : itemsAvailable) {
            if (item.getProductName().equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null;
    }

    private static void completeSale() {
        double total = cart.calculateTotal();
        System.out.println("Total amount: $" + total);
        cart.clearCart();
        System.out.println("Sale completed. Thank you for your purchase!");
    }
}
