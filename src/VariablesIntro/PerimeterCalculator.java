package VariablesIntro;

import java.util.Scanner;

public class PerimeterCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Square area and perimeter calculator");
        //ask a user to enter length of a square (int)
        // print calculated area and calculated perimeter
        System.out.println("Enter length of square");
        int n1 = sc.nextInt();
        int area = n1 * n1;
        System.out.println("The area of square is: " + area);
        int per = n1 * 4;
        System.out.println("The perimeter is " + per);



    }
}
