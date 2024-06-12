package VariablesIntro;

import java.util.Scanner;

public class Decisions {
    public static void main(String[] args) {
        // how to make decisions in java: if(){} else{}
        // if(boolean){run if true} else{ run if false }
        // write a program that tells if   give number is positive/negative
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number");
        int givenNum = sc.nextInt();
        boolean isPositive = givenNum > 0;
        if(isPositive){
            System.out.println("Positive number");
        }
        else{
            System.out.println("Negative number");
        }
    }
}
