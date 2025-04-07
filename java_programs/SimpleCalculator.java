package java_programs;

import java.util.Scanner;

public class SimpleCalculator {
    public static Scanner scanner = new Scanner(System.in);

    public static void calculate(char ch, int firstNumber, int secondNumber) {
        switch (ch) {
            case '+':
                System.out.println("Addition: " + (firstNumber + secondNumber));
                break;
            case '-':
                System.out.println("Subtraction: " + (firstNumber - secondNumber));
                break;
            case '*':
                System.out.println("Multiplication: " + (firstNumber * secondNumber));
                break;
            case '/':
                if (secondNumber != 0) {
                    System.out.println("Division: " + (firstNumber / secondNumber));
                } else {
                    System.out.println("Error! Division by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Simple Calculator");
        char ch = 'n';
        do {
            System.out.print("Enter First Number: ");
            int firstNumber = scanner.nextInt();
            System.out.print("Enter Second Number: ");
            int secondNumber = scanner.nextInt();
            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
            calculate(operator, firstNumber, secondNumber);
            System.out.print("Do you want to perform another calculation? (y/n): ");
            ch = scanner.next().charAt(0);
            if (ch == 'y' || ch == 'Y') {
                System.out.println("Continuing...");
            } else {
                System.out.println("Exiting...");
            }
            System.out.println();
        } while (ch == 'y' || ch == 'Y');
        scanner.close();
        System.out.println("Thank you for using Simple Calculator!");
        System.out.println("Goodbye!");

    }
}