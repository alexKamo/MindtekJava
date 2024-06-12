package testclassesLOOPandARRAY;

import java.util.Scanner;

public class EnterUntil55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("I will keep asking you to enter a number until you enter 55");
        while(true){
            System.out.println("Enter a number");
            int num = sc.nextInt();
            if (num == 55) {
                System.out.println("End");
                break;
            }
        }
    }
}
