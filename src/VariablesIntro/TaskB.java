package VariablesIntro;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of rectangle: ");
        int sd1 = sc.nextInt();
        System.out.println("Enter the width of rectangle: ");
        int sd2 = sc.nextInt();
        int per = 2*(sd1+sd2);

        System.out.println("The perimeter of rectangle is " + (per));
        System.out.println("The area of rectangle is " + (sd1*sd2));





    }
}
