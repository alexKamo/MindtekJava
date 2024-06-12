package ProjectDay;

import java.util.Scanner;

public class GroceryStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your bank balance");
        double balance = sc.nextDouble();
        System.out.println("What the price oranges");
        double price = sc.nextDouble();
        System.out.println("How many pound you want top o buy");
        double pounds = sc.nextDouble();
        System.out.println("Your transaction amount is: $" + (int)(pounds*price));
        System.out.println("Your account's new balance is: $" + (balance - (pounds*price)));
    }
}
