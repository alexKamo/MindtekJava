package ProjectDay;

import java.util.Scanner;

public class ValidAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        int valid = 2;
        boolean validName = name.length()>=valid;
        if (validName) System.out.println("Valid name");
        else System.out.println("Invalid name");


    }
}
