package testclassesLOOPandARRAY;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ur word: ");
        String text = sc.nextLine();

        //find total amount of vowel letters from given string
        // vowels is a, e, u, o, i;

        int i = 0;
        int totalVowels = 0;
        while (i < text.length()) {
            char vowelL = text.charAt(i);
            boolean isVowel = vowelL == 'a' || vowelL == 'e' || vowelL == 'u' || vowelL == 'o' || vowelL == 'i';
            if (isVowel) totalVowels++;
            i++;
        }
        System.out.println("Total vowels is: "+totalVowels);
    }
    
}
