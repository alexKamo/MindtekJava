package strings;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // initials creator => Oleksandr Pik -> OP
        //ask a user to enter firstName, lastName
        //print initials of that person
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        String firstName = sc.next().toUpperCase();
        //if (firstName.isEmpty()) System.out.println("The given name is empty");
        System.out.println("Enter Last Name");
        String lastName = sc.next().toUpperCase();
        System.out.println("Your initials "+firstName.charAt(0)+lastName.charAt(0));
    }
}
