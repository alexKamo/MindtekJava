package VariablesIntro;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {

        // ask a user to enter integer numbers
        // then print + sum of given numbers
        // type num: 4
        // type num: 6
        // + 10
        //implementation:
        Scanner sc = new Scanner(System.in);

        //ask two more numbers and  print their multiplication => 5 and 6 -> 30
        System.out.println("Enter a first number ");
        int num1 = sc.nextInt();
        System.out.println("Enter a second number ");
        int num2 = sc.nextInt();
        int multi = num1 * num2;
        System.out.println("Summary is: " + multi);

        System.out.println("End!");




    }
}
