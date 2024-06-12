package homeworks;

import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit");
        double fah = sc.nextDouble();
        double result = (fah -32) * 5/9;
        System.out.println((fah) + " Fahrenheit is " + (result) + " Celsius");



    }
}

