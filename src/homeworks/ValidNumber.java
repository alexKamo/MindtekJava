package homeworks;

import java.util.Scanner;

public class ValidNumber {
    public static void main(String[] args) {
        /*
        1. Create a class with name ValidNumber
        2. Create a main method with Scanner
        3. Write a program that asks a user to enter a number. If entered number is even number and
        it is between 0 and 100 then program prints 'Valid number', otherwise 'Invalid number'.

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a even number between 0 and 100:");
        int num = sc.nextInt();
        if(num%2==0 && num>0&&num<=100) System.out.println("Valid number");
        else System.out.println("Invalid number ");

        num = sc.nextInt();
        if(num%2==0 && num>0&&num<=100) System.out.println("Valid number");
        else System.out.println("Invalid number ");

        num = sc.nextInt();
        if(num%2==0 && num>0&&num<=100) System.out.println("Valid number");
        else System.out.println("Invalid number ");

        num = sc.nextInt();
        if(num%2==0 && num>0&&num<=100) System.out.println("Valid number");
        else System.out.println("Invalid number ");




    }
}
