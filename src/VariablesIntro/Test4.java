package VariablesIntro;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 0.62137
        System.out.println("Print miles to covert into kilometer");
        double num = sc.nextDouble();
        System.out.println("You are write " + num);
        double num2 = 0.62137;
        System.out.println("Miles into kilometer will be " + (num*num2));
    }
}

