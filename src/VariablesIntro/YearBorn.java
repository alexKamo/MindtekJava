package VariablesIntro;

import java.util.Scanner;

public class YearBorn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check your eligibility to apply for Driver license");
        // ask a user what year were born
        // calculate their age
        // if age is >= 16 print "You are eligible"
        // else print " Sorry not yet"
        System.out.println("What year were you born");
        int year = sc.nextInt();
        int age = 2024 - year;
        boolean isEligible = age >= 16;
        if (isEligible){
            System.out.println("You are eligible");
        }
        else{
            System.out.println("Sorry not yet");
            System.out.println("You can come back in " + (16-age) + " year");
        }
    }
}
