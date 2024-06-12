package VariablesIntro;

import java.util.Scanner;

public class OrIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you like dogs? 1-> Yes 2-> No");
        int likesDogs = sc.nextInt();

        System.out.println("Do you like cats? 1-> Yes 2-> No");
        int likesCats = sc.nextInt();

        System.out.println("Do you like pets? 1-> Yes 2-> No");
        int likesPets = sc.nextInt();

        // find out if this person likes pets

        if((likesDogs==1 || likesCats==1) && likesPets==1) System.out.println("You can be a pet owner");
        else System.out.println("Seems like you will not own cats and dogs");




    }

}
