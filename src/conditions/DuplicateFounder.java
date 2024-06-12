package conditions;

import java.util.Scanner;

public class DuplicateFounder {
    public static void main(String[] args) {
        //find if given word contains any duplicate letter
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a word");
        String word = sc.next();
        boolean dup = false;
        for(int i=0; i<word.length(); i++){
            for (int j = i+1; j<word.length(); j++) {
                if (word.charAt(i)==word.charAt(j)){
                    dup=true; break;
                }
            }
            if (dup)break;
        }
        if (dup) System.out.println("Duplicate found");
        else System.out.println("No duplicate found");
    }
}
