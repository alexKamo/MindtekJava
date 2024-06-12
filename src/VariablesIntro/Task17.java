package VariablesIntro;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chicago Marathon application app");
        // to ba able to apply:
        // person must live in Chicago area
        //age must me from 22 to 65
        // gender can be Male or Female
        System.out.println("Do you live in Chicago are? 1-> Yes 2-> NO");
        int a1 = sc.nextInt();
        System.out.println("How old are you");
        int age = sc.nextInt();
        System.out.println("What is your gender? 1-> Male 2-> Female");
        int a3 = sc.nextInt();
        if (a1==1 && age>=22&&age<=65 && a3==1) System.out.println("From all given info you can be apply");
        else System.out.println("Sorry you are not apply for this");



    }
}
