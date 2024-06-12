package homeworks;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        //Ask for an input from a user and find out if a given word is a palindrome or not.
        Scanner sc = new Scanner(System.in);
        System.out.println("Type any text: ");
        String text = sc.nextLine();
        int i = text.length()-1;
        String s = "";
        while (i>=0){
            s = s+text.charAt(i);
            i--;
        }
        if (text.equals(s)) System.out.println("Palindrome");
        else System.out.println("Not a palindrome");
    }
}

