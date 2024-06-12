package conditions;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        // ask a user to enter a word
        // construct a new word by putting * after every letter
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.nextLine();
        int i = 0;
        String res = "";
        while (i<word.length()) res+=word.charAt(i++)+"*";
        System.out.print(res);
    }

}
