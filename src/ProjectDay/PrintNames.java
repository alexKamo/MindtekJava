package ProjectDay;

import java.util.Scanner;

public class PrintNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name");
        String fName = sc.next();
        System.out.println("How many time you want to write your name");
        int num = sc.nextInt();
        while(num>0) {
            System.out.print(fName+" ");
            num--;
        }
    }
}

