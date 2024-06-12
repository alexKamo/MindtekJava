package homeworks;

import java.util.Scanner;

public class MinMaxTotal {
    public static void main(String[] args) {
        /*
        1. Create a class with main method
        2. Ask a user to enter 5 integers. Print the minimum number, the maximum number, the total sum.
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 numbers");
        int max = 0;
        int min = 0;
        int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt(),num4 = sc.nextInt(), num5 = sc.nextInt();
        max=num1; min=num1;
        if (num2>max) max=num2;if (num2<min) min=num2;
        if (num3>max) max=num3;if (num3<min) min=num3;
        if (num4>max) max=num4;if (num4<min) min=num4;
        if (num5>max) max=num5;if (num5<min) min=num5;
        int total = num1+num2+num3+num4+num5;
        System.out.println("Maximum is: " +max);
        System.out.println("Minimum is: " +min);
        System.out.println("Total sum is: " +total);








    }
}
