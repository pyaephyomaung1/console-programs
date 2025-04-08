package java_programs.StudentManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementApp {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Student> students = new ArrayList<>();

    public void showMenu() {
        System.out.println("Welcome to the Student Management App");
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Search Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Exit");
    }

    public static void addStudent() {
        System.out.println("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Student Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter Student Grade: ");
        String grade = scanner.nextLine();
        students.add(new Student(name, age, grade));
        System.out.println("Student added successfully!");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            System.out.println("Students List:");
            for (Student student : students) {
                student.displayStudentInfo();
                System.out.println("---------------------");
            }
        }
    }

    public void deleteStudent() {
        System.out.println("Enter the name of the student to delete: ");
        String deleteName = scanner.nextLine();
        boolean removed = students.removeIf(s -> s.name.equalsIgnoreCase(deleteName));
        if (removed) {
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void searchStudent() {
        System.out.println("Enter the name of the student to search: ");
        String searchName = scanner.nextLine();
        boolean found = false;
        for (Student student : students) {
            if (student.name.equalsIgnoreCase(searchName)) {
                student.displayStudentInfo();
                found = true;
                break;
            }
        }  
        if (!found) {
            System.out.println("Student not found.");
        }
    }

    public static void main(String[] args) {
        StudentManagementApp app = new StudentManagementApp();
        while (true) {
            app.showMenu();
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    app.viewStudents();
                    break;
                case 3:
                    app.searchStudent();
                    break;
                case 4:
                    app.deleteStudent();
                    break;
                case 5:
                    System.out.println("Exiting the application.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
