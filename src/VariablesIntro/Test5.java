package VariablesIntro;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        // ask a user what year they were born "1978"
        // print : You should be "x" years old
        Scanner sc = new Scanner(System.in);
        System.out.println("What year were you born");
        int year = sc.nextInt();
        int present = 2024;
        System.out.println("You should be " + (present-year) + " years old");
    }
}

