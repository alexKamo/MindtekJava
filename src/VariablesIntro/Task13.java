package VariablesIntro;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posSum = 0, negSum = 0;
        System.out.println("Enter 1st number");
        int num = sc.nextInt();
        if(num>=0) posSum = posSum+num;
        else negSum = negSum+num;
        System.out.println("Enter 2nd number");
        num = sc.nextInt();
        if(num>=0) posSum = posSum+num;
        else negSum = negSum+num;
        System.out.println("Enter 3rd number");
        num = sc.nextInt();
        if(num>=0) posSum = posSum+num;
        else negSum = negSum+num;
        System.out.println("Positive numbers sum: " +posSum);
        System.out.println("Negative numbers sum:" +negSum);





    }
}

