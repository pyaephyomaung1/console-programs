import java.util.Scanner;

public class UpperCase {
    public static Scanner scanner = new Scanner(System.in);
    public static void toUpperCase(String text){
        char[] alphabets = text.toCharArray();
        int length = alphabets.length;
        int[] asciiValue = new int[length];
        int[] upperAsciiValue = new int[length];
        char[] uppperAlphabets = new char[length];
        for (int i = 0 ; i < alphabets.length ; i++){
            asciiValue[i] = (int) alphabets[i];
            if(asciiValue[i] >= 97){
                upperAsciiValue[i] = asciiValue[i] - 32;
            } else {
                upperAsciiValue[i] = asciiValue[i];
            }
            uppperAlphabets[i] = (char) upperAsciiValue[i];
            System.out.print(uppperAlphabets[i]);
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter any word or text: ");
        String input = scanner.nextLine();
        toUpperCase(input);
        System.out.println("");
        scanner.close();
    }
}
