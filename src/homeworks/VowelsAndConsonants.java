package homeworks;

import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        /*1. Create a class with main method and Scanner
        2. Write a code where program will ask from user to enter a letter,
        and program will print Vowel if letter is vowel otherwise Consonant.
        (Vowel letters: a, e, u, i, o, A, E, U, I, O)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter");
        String letter = sc.next();
        char c = letter.charAt(0);
        if(c=='a'||c=='e'||c=='i'||c=='u'||c=='o'||c=='A'||c=='E'||c=='I'||c=='U'||c=='O')
             System.out.println("It is Vowel");
        else System.out.println("It is Consonant");









    }
}
