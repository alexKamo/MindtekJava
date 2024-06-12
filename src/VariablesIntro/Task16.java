package VariablesIntro;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you a citizen? 1-> Yes 2-> NO");
        int q1 = sc.nextInt();
        System.out.println("Are you a green card holder? 1-> Yes 2-> NO");
        int q2 = sc.nextInt();
        System.out.println("Are you a h1b visa holder? 1-> Yes 2-> NO");
        int q3 = sc.nextInt();
        if(q3==1||q2==1||q3==1) System.out.println("You are allowed to work in US");
        else System.out.println("You are not allowed to word in US");

        // print if user can vote -> only citizen
        boolean isCitizen = q1==1;
        if (!isCitizen) System.out.println("You can't vote");

    }
}

