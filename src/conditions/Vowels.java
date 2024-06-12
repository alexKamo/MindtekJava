package conditions;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a word");
        String word = sc.next();
        // print total amount of vowels and non vowels
        int vowels = 0;
        for (int i = 0; i<word.length(); i++){
            char letter = word.charAt(i);
            boolean isVowel = letter=='a'||letter=='e'
                    ||letter=='o'||letter=='u'||letter=='i';
            if (isVowel) vowels++;
        }
        System.out.println("Vow: " + vowels);
        System.out.println("Non vow: " + (word.length()-vowels));
    }

}
