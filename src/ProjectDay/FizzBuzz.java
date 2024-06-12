package ProjectDay;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        /*
        Write a program that asks a user to enter a number. If number can evenly be divided by 3,
        then program prints "Fizz". If number can evenly be divided by 5, then program prints "Buzz".
        If number can evenly be divided by 3 and 5 at the same time, then program prints "FizzBuzz".
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        if (num%15==0) System.out.println("FizzBuzz");
        else if (num%5==0) System.out.println("Buzz");
        else if (num%3==0) System.out.println("Fizz");
        else System.out.println("Not divisible by 3 and 5");
    }
}

