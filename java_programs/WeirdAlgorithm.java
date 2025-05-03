package java_programs;

import java.util.Scanner;

public class WeirdAlgorithm {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        while(true){
            System.out.println(n);
            if(n == 1){
                break;
            }
            if (n%2 == 0 ){
                n /= 2;
            }
            else  {
                n = n*3+1;
            }
            System.out.print(n + ",");
        }
    }
}
