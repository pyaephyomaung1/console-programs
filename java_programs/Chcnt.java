package java_programs;

import java.util.Scanner;

public class Chcnt{
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int chCount = 0;
        int wdCount = 0;
        System.out.println("Type something");
        String text = scanner.nextLine();
        char[] characters = text.toCharArray();
        System.out.println(characters);
        for(int i = 0 ; i < characters.length ; i++){
            if(characters[i] == ' '){
                chCount++;
            } else {
                wdCount++;
            }
        }
        System.out.println("Space " + chCount);
        System.out.println("Words " + wdCount);      
    }
}