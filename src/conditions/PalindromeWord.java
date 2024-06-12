package conditions;

import java.util.Scanner;

public class PalindromeWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String text = sc.nextLine();
        //find if the text is a palindrome?
        // (racecar -> palindrome word) (mom -> palindrome word) read from both sides it will be same word
        int index = text.length()-1;
        String rev = "";
        //reverse
        while(index>=0){
            rev = rev + text.charAt(index);
            index--;
        }
        //check if equals
        if (text.equals(rev)) System.out.println("Palindrome");
        else System.out.println("Not a palindrome");
    }
}
