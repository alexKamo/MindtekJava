package ProjectDay;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int max = 0;
        int num1 = sc.nextInt();
        num1 = max;
        int num2 = sc.nextInt();
        if (num2>max) max = num2;
        int num3 = sc.nextInt();
        if (num3>max) max = num3;
        System.out.println("Greatest number is: " +max);



    }
}
