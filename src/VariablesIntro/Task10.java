package VariablesIntro;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        System.out.println("Maximum finder");
        // ask a user to enter 3 integers. Print the maximum one.
        //  12, 1, 6 -> the max is 12

        int max = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Num1");
        int num1 = sc.nextInt();
        max = num1;

        System.out.println("Num2");
        int num2 = sc.nextInt();
        if(num2>max) max = num2;

        System.out.println("Num3");
        int num3 = sc.nextInt();
        if(num3>max) max = num3;

        System.out.println("Maximum:" + max);

    }
}

