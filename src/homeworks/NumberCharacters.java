package homeworks;

import java.util.Scanner;

public class NumberCharacters {
    public static void main(String[] args) {
        /*
        1. Create a class with main method and Scanner
        2. Write a program that asks to user to enter any word and number of characters that program should print.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word: ");
        String word = sc.nextLine().trim();
        System.out.println("Enter number of characters: ");
        int num = sc.nextInt();
        if (num<=word.length()) System.out.println(word.substring(0,num));
        else System.out.println("The character does not find");

    }
}
