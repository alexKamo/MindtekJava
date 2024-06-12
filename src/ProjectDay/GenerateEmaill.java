package ProjectDay;

import java.util.Scanner;

public class GenerateEmaill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = sc.next().trim().toLowerCase();
        System.out.println("Enter your last name");
        String lastName = sc.next().trim().toLowerCase();
        System.out.println("Enter your company name");
        String companyName = sc.next().trim().toLowerCase();
        System.out.println("Your email is: " + firstName.charAt(0)
        + "."+ lastName.replace(" ","") + "@"+ companyName + ".com");
    }
}

