package java_programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DigitFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string of digits: ");
        String input = scanner.nextLine();

        // HashMap to store frequency of each digit
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Loop through each character in the input
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
        }

        // Display the frequency of each digit
        for (char ch = '0'; ch <= '9'; ch++) {
            if (frequencyMap.containsKey(ch)) {
                System.out.println(ch + " → " + frequencyMap.get(ch) + " time(s)");
            }
        }

        scanner.close();
    }
}
