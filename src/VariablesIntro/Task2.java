package VariablesIntro;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double breadPrice = 4.78;
        System.out.println("The price of bread is: $" + breadPrice);
        System.out.println("How much are you going to pay");
        int num = sc.nextInt();
        double change = num - breadPrice;
        System.out.println("You're give me " + num);
        System.out.println("And your change is " + change);
    }
}
