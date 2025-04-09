package java_programs;

import java.util.Scanner;

public class StarProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the star pattern: ");
        int rows = scanner.nextInt();

        for(int x = 1 ; x <= rows ; x++) {
            for(int y = 1 ; y <= rows - x ; y++){
                System.out.print(" ");
            }
            for(int z = 1 ; z <= (2 * x - 1) ; z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
