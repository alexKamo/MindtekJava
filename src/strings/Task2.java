package strings;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word");
        String word = sc.next();
        int firstIndex = 0;
        int lastIndex = word.length()-1;
        char firstChar = word.charAt(firstIndex);
        char lastChar = word.charAt(lastIndex);
        // if(firstChar==lastChar) System.out.println("Chars is same");
        if(word.charAt(0)==(word.charAt(word.length()-1))) System.out.println("Chars is same");
        else System.out.println("Chars is different");
    }
}
