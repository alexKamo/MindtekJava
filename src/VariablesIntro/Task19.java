package VariablesIntro;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int side1 = sc.nextInt();
        System.out.println("Enter second number");
        int side2 = sc.nextInt();
        System.out.println("Enter third number");
        int side3 = sc.nextInt();

        if (side1 != side2 && side1 != side3 && side2 != side3) System.out.println("Scalene triangle");
        if (side1 == side2 && side2 == side3 && side1 == side3) System.out.println("Equilateral triangle");
        if ((side1 == side2 && side1 != side3)
                || (side1 == side3 && side1 != side2)
                || (side2==side3 && side2 != side1))
            System.out.println("Isosceles triangle");





    }
}

