package conditions;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String text = sc.nextLine().toLowerCase();
        //find total amount of vowel letter from given string
        int index = 0;
        int count = 0;
        while(index<text.length()){
            char letter = text.charAt(index);
            boolean isVowel = letter=='a'||letter=='e'||letter=='u'
                    ||letter=='o'||letter=='i';
            if (isVowel) count++;
            index++;
        }
        System.out.println("Total amount of vowels: " +count);
    }

}
