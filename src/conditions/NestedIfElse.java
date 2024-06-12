package conditions;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        // you are young(age<13), 13<=age<=19 you ate teenager,
        // 19<age<=60 adult, age>60 senior

        System.out.println("Your age: ");
        int age = sc.nextInt();
        if (age>0 && age<=120){
            if (age<13) {
                System.out.println("You're young");
            }else if (age>=13 && age<=19) {
                System.out.println("You're teenager");
            }else if (age>19 && age<=60){
                System.out.println("You're adult");
            }else System.out.println("You're Senior");
        }else System.out.println("Invalid age");








    }
}
