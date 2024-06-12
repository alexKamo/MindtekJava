package strings;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        /*
        ask a user to enter a word with a length of 5
        if length isn't 5 do nothing but print invalid word
        if length is 5, then print total amount of vowel letter in a given word
        vowel = "a,e,i,u,o";
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word of fifth length");
        String word = sc.next().toLowerCase();
        if (word.length()==5) {
           int count = 0;
           char letter = word.charAt(0);
            if (letter == 'a' ||letter == 'e' || letter == 'i' || letter == 'u' || letter == 'o') count++;
            letter = word.charAt(1);
            if (letter == 'a' ||letter == 'e' || letter == 'i' || letter == 'u' || letter == 'o') count++;
            letter = word.charAt(2);
            if (letter == 'a' ||letter == 'e' || letter == 'i' || letter == 'u' || letter == 'o') count++;
            letter = word.charAt(3);
            if (letter == 'a' ||letter == 'e' || letter == 'i' || letter == 'u' || letter == 'o') count++;
            letter = word.charAt(4);
            System.out.println(count + " vowels found");
            System.out.println(5-count + "Non vowels found");
        }else System.out.println("Invalid");

    }
}
