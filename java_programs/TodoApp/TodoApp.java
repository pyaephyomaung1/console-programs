package TodoApp;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoApp {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Todo> todos = new ArrayList<>();

    public static void showMenu() {
        System.out.println("Welcome to the Todo App");
        System.out.println("1. Add Todo");
        System.out.println("2. View Todos");
        System.out.println("3. Search Todo");
        System.out.println("4. Delete Todo");
        System.out.println("5. Exit");
    }
    public static void addTodo() {
        System.out.println("Enter Todo Title: ");
        String title = scanner.nextLine();
        System.out.println("Enter Todo Description: ");
        String description = scanner.nextLine();
        todos.add(new Todo(title, description));
        System.out.println("Todo added successfully!");
    }

    public static void viewTodos() {
        if (todos.isEmpty()) {
            System.out.println("No todos available.");
        } else {
            System.out.println("Todos List:");
            for (Todo todo : todos) {
                todo.displayTodo();
                System.out.println("---------------------");
            }
        }
    }

    public static void deleteTodo() {
        System.out.println("Enter the title of the todo to delete: ");
        String deleteTitle = scanner.nextLine();
        boolean removed = todos.removeIf(t -> t.title.equalsIgnoreCase(deleteTitle));
        if (removed) {
            System.out.println("Todo deleted successfully!");
        } else {
            System.out.println("Todo not found.");
        }
    }

    public static void searchTodo() {
        System.out.println("Enter the title of the todo to search: ");
        String searchTitle = scanner.nextLine();
        boolean found = false;
        for (Todo todo : todos) {
            if (todo.title.equalsIgnoreCase(searchTitle)) {
                todo.displayTodo();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Todo not found.");
        }
    }

    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    addTodo();
                    break;
                case 2:
                    viewTodos();
                    break;
                case 3:
                    searchTodo();
                    break;
                case 4:
                    deleteTodo();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 5);
        scanner.close();
        System.out.println("Thank you for using Todo App!");
        System.out.println("Goodbye!");
        }
}
