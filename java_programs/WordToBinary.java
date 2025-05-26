package java_programs;

import java.util.Scanner;

public class WordToBinary {
    public static Scanner scanner = new Scanner(System.in);

    public static String toBinary(int n){
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            int remainder = n % 2;
            binary.insert(0, remainder);
            n = n / 2;
        }
        return binary.toString();
    }
    public static void main(String[] args) {
        System.out.println("Type a word");
        String word = scanner.nextLine();
        char[] characters = word.toCharArray();
        int[] ascii = new int[characters.length];
        System.out.print("Binary code for "+ word + " is ");
        for(int i = 0 ; i < characters.length ; i++){
            ascii[i] = (int) characters[i];
            System.out.print(toBinary(ascii[i]) + " ");
        }
        System.out.println(" ");
    }

}
