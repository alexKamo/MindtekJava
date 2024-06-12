package homeworks;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        /*
        factorial formula
        5! = 5 * 4 * 3 * 2 * 1 = 120;
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int n = scanner.nextInt();
        int factorial = 1;
        int i = 1;
        if (n>0){
            while (i<n){
                i++;
                factorial*=i;
            }System.out.println("Factorial number " +n +" is: " +factorial);
        } else System.out.println("Number shouldn't be negative");
    }
}