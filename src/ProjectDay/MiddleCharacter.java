package ProjectDay;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.next();
        if (word.length()>2){
            if (word.length()%2==0)
                System.out.println("Middle Character(s): " +word.charAt(word.length()/2-1) + word.charAt(word.length()/2));
            else System.out.println("Middle Characters " + word.charAt(word.length()/2));
        }else System.out.println("Word doesn't have 3 characters or more");
    }
}

