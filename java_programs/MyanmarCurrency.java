import java.util.Scanner;

public class MyanmarCurrency {
    public static Scanner scanner = new Scanner(System.in);
    StringBuilder str = new StringBuilder();
    public static void main(String[] args) {
        System.out.print("Enter Number: ");
        int number = scanner.nextInt();
        converter(number);
    }   
    
    public static String mmNumber(char ch){
        switch (ch) {
            case '0':
                return "";
            case '1':
                return "တစ်";
            case '2':
                return "နှစ်";
            case '3':
                return "သုံး";
            case '4':
                return "လေး";
            case '5':
                return "ငါး";
            case '6':
                return "ခြောက်";
            case '7':
                return "ခုနှစ်";
            case '8':
                return "ရှစ်";
            case '9':
                return "ကိုး";
            default:
                return "Not A Number";
        }
    }
    public static void converter(int n){
        String numbers = Integer.toString(n);
        char[] chNumber = numbers.toCharArray();
        char[] mmNumber = new char[chNumber.length];
        for(int i = 0 ; i < chNumber.length ; i++){
            mmNumber[i] = chNumber[i];
        }
        for(int i = 0 ; i < mmNumber.length ; i++){
            System.out.print(mmNumber(mmNumber[i]));
        }
    }
}
