package homeworks;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number in miles to convert into kilometers");
        double mil = sc.nextDouble();
        System.out.println("You are enter " + mil + " miles");
        double km2 = 1.60934;
        System.out.println("That will be " + (mil * km2) + " kilometers");
    }
}

