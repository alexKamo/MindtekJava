package VariablesIntro;

import java.util.Scanner;

public class EvenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Even vs Odd");
        // ask a user to enter any integer
        // if given number is even print "Even", otherwise print "Odd"
        int num1 = sc.nextInt();
        if(num1%2==0){
            System.out.println("Number is even");
        } else{
            System.out.println("Number is odd");
        }





    }

}
