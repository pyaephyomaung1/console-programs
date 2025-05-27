import java.util.Scanner;

public class ReverseText{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a text: ");
        String text =scanner.nextLine();
        char[] characters = text.toCharArray();
        char[] reversed = new char[characters.length];
        for(int i = characters.length - 1; i >= 0; i--){
            reversed[characters.length - 1 - i] = characters[i];
        }
        String reversedText = new String(reversed);
        System.out.println("Reversed Text: " + reversedText);
    }
}