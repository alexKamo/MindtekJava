package VariablesIntro;

import java.util.Scanner;

public class EvenOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ask a user to enter 4 numbers
        // print: sum of even numbers: x
        // print: sum of even numbers: y
        // Example: 3,4,5,6 Sum of even: 10   Sum of odd: 8
        int evenSum = 0, oddSum = 0;

        System.out.println("Enter first number: ");
        int num = sc.nextInt();
        boolean isEven = num%2==0;
        if(isEven) evenSum += num;
        else oddSum += num;

        System.out.println("Second number");
        num = sc.nextInt();
        isEven = num%2==0;
        if(isEven) evenSum += num;
        else oddSum += num;


        System.out.println("Third number");
        num = sc.nextInt();
        isEven = num%2==0;
        if(isEven) evenSum += num;
        else oddSum += num;

        System.out.println("Fourth number");
        num = sc.nextInt();
        isEven = num%2==0;
        if(isEven) evenSum += num;
        else oddSum += num;

        System.out.println("Even sum: " +evenSum);
        System.out.println("Odd sum: " +oddSum);
    }
}
