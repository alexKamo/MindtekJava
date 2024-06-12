package strings;

import java.util.Scanner;

public class Task7FaceBookLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*ask a user to enter: email and pass
        if give email matches with emailDB && given password matches with passDB -> logging In
        otherwise print -> wrong credentials
         */
        String emailDB = "user@gmail.com";
        String passDB = "user1234";
        System.out.println("Enter email");
        String email = sc.next();
        System.out.println("Enter password");
        String password = sc.next();
        if (email.equals(emailDB)&&(password.equals(passDB))) System.out.println("Welcome back");
        else System.out.println("Wrong credentials");




    }
}

