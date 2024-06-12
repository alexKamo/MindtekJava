package ProjectDay;

import java.util.Scanner;

public class SwapLetters {
    public static void main(String[] args) {
        /*
        Create a SwapLetters class with main method. Write a
        code that will accept a word as input from user and will
        swap first and last letter in word. Cases will be printed all
        lower case.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.next().toLowerCase();
        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(word.length()-1);
        String swap = (lastLetter+word.substring(1,word.length()-1)+firstLetter);
        System.out.println(swap);

    }
}

