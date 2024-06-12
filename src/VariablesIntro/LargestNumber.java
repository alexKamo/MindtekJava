package VariablesIntro;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        max = num1;
        if(num2>max) max = num2;

        System.out.println("Greatest number is: " +max);

    }

}
