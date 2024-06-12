package strings;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /*
        ask a user to enter a word with a length of 4
        if length isn't 4 do nothing but print invalid word
        if length is 4, then print reversed version of given word
        "name" -> eman
        "hello" -> olleh
        "mouse" -> invalid name
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word with a length of 4");
        String word = sc.next();
        if(word.length()==4) System.out.println(""+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0));
        else System.out.println("Your word doesn't consist 4 letters");
    }
}

