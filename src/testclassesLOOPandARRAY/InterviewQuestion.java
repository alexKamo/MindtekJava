package testclassesLOOPandARRAY;

import java.util.Scanner;

public class InterviewQuestion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ur word: ");
        String text = sc.nextLine();

        /*
        find if the text is a palindrome
        first need to create a reverse String
        then create a loop that make a reverse word
        store a reversed word into empty space
        then check if reversed word is equal to original text
        */
        String rev = "";
        for (int i = text.length()-1; i>=0; i--){
            rev+=text.charAt(i);
        }
        if (text.equals(rev)) System.out.println("Palindrome");
        else System.out.println("No a palindrome");



    }
}
