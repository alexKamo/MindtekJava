package conditions;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        // keep asking a user to enter a word until they enter "Exit"
        // ask which char they want to put after each letter: 1:# 2:*
        // For each given word construct a new word by putting "selected char" after every letter and print it
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Enter a word");
            String word = sc.next();
            if (word.equalsIgnoreCase("Exit")) break;
            String res = "";
            while(true){
                System.out.println("Enter a char: 1-#  2-*");
                int ch = sc.nextInt();
                int i = 0;
                if (ch==1){
                    while (i<word.length()) res+=word.charAt(i++)+"#"; break;
                }else if (ch==2){
                    while (i<word.length()) res+=word.charAt(i++)+"*"; break;
                }else System.out.println("Invalid enter");
                System.out.println(res);
            }
        }
        System.out.println("The end");
    }
}
