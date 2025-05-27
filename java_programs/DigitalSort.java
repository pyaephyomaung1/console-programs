import java.util.Arrays;
import java.util.Scanner;

public class DigitalSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        String input = scanner.nextLine();
        char[] digits = input.toCharArray();

        Arrays.sort(digits);
        System.out.println("Sorted digits: ");
        for (char digit: digits) {
            System.out.print(digit + " ");
        } 
        System.out.println();
        System.out.println("The sorted digits are: " + new String(digits));
        scanner.close();
    }
}
