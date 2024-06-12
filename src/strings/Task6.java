package strings;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "5689";
        System.out.println("Enter a password to open the garage");
        String numPass = sc.next();
        if (numPass.equals(password)) System.out.println("Door is opening");
        else System.out.println("Wrong password");






    }
}
