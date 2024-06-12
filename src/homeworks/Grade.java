package homeworks;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        /*
        1. Create a class with main method.
        2. Create a scanner.
        3. Write a program that will ask from user to enter the grade in scale of 100,
        and program will print grade in letter.
        (80 – 100 is A, 60 – 79 is B, 40 – 59 is C, 0 - 39 F)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you grade scale of 100");
        int num = sc.nextInt();
        boolean isA = num>=80&&num<=100, isB = num>=60&&num<=79, isC = num>=40&&num<=59, isF = num>=0&&num<=39;
        if (isA) System.out.println("Your grade is A");
        if (isB) System.out.println("Your grade is B");
        if (isC) System.out.println("Your grade is C");
        if (isF) System.out.println("Your grade is F");
        else System.out.println("Incorrect grade scale");


    }
}
