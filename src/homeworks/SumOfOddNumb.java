package homeworks;

import java.util.Scanner;

public class SumOfOddNumb {
    public static void main(String[] args) {
        /*
        1. Create a class with main method and scanner
        2. Write a program that will ask from user to enter a number.
        Then program will print sum of all odd numbers between 0 and entered number.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int sum = 0;
        int odd = 1;
        while (odd<=num) {
            sum += odd;
            odd += 2;
        }
        System.out.println("Sum of odd numbers is: " +sum);
    }
}
