package VariablesIntro;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adult or not Adult");
        //ask a user theit age
        // if age >= 18 print "adult", otherwise print not adult
        System.out.println("Enter how old are you");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("You are adult");
        }
        else{
            System.out.println("You're not adult");
        }
    }
}
