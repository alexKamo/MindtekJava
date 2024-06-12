package homeworks;

import java.util.Scanner;

public class Discussion {
    public static void main(String[] args) {

        int num1, num2, sum;
        Scanner input = new Scanner(System.in);
        System.out.println("Hi! What is your name?");
        String name = input.next();

        System.out.println("Nice to meet you " + name );
        System.out.println("What do you do, " + name);
        String job = input.next();

        System.out.println("So you are a " + job);
        System.out.println("How many days in a week you work?");
        num1 = input.nextInt();

        System.out.println("And how many hours you work daily?");
        num2 = input.nextInt();

        sum = num1 * num2;
        System.out.println("So you work weekly " + sum);
    }
}

