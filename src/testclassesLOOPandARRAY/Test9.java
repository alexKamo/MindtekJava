package testclassesLOOPandARRAY;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // keep asking a user to enter a positive number until they enter a negative i will enter a sum of given positive numbers
        System.out.println("I will asking to enter number until u enter a negative loop woll stop");
        int sum = 0;
        while(true){
            System.out.println("Enter a number");
            int num = sc.nextInt();
            if (num<=0) {
                System.out.println("End"); break;
            }
            sum+=num;
        }
        System.out.println("Sum of number is: " +sum);
    }

}
