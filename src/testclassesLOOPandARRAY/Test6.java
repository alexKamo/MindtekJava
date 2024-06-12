package testclassesLOOPandARRAY;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ur word: ");
        String text = sc.nextLine();

        /*
        find out if text has identical neighbor pairs
        1) Create a boolean with false;
        2) Create a loop that you can check every letter
        3) If your letter is equal to next letter in neighbor make a false boolean to true
        4) Than after loop create if else statement with a true boolean
         */
        boolean pairFound = false;
        for (int i = 0; i<text.length()-1; i++){
            if (text.charAt(i)==text.charAt(i+1)) {
                pairFound = true;
                break;
            }
        }
        if (pairFound) System.out.println("Pair found");
        else System.out.println("Pair isn't found");
    }

}
