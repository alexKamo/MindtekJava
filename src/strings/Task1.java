package strings;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word with three letters");
        String word = sc.next();
        int count =0;
        if (word.length()==3) {
            if (word.charAt(0) == 'a') count++;
            if (word.charAt(1) == 'a') count++;
            if (word.charAt(2) == 'a') count++;
            System.out.println("Total sum of letter a in - " + word + " is " + count);
        }else System.out.println("Invalid length, please rewrite word again.");
    }
}
