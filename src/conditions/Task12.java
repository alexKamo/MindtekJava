package conditions;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        // keep asking a user to enter a positive numbers
        // until they enter negative value
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a positive num");
            int num = sc.nextInt();
            if (num<0) break;
        }
        System.out.println("The end");


    }
}
