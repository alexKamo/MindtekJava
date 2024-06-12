package conditions;

import java.util.Scanner;

public class DollarChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter $ amount");
        double value = sc.nextDouble();
        int total = (int)(value*100);

        int quarters = total/25;
        total = total%25;
        System.out.println("Quarters: " +quarters);

        int dimes = total/10;
        total = total%10;
        System.out.println("Dimes: " +dimes);
        int nickels = total/5;
        total = total%5;
        System.out.println("Nickels: " + nickels);
        int pennies = total;
        total = total%1;
        System.out.println("Pennies: " +pennies);
        System.out.println("rem: " +total);

    }
}
