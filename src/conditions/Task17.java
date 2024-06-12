package conditions;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        // keep asking a user to enter a word until they enter "Exit"
        // For each given word construct a new word by putting * after every letter and print it
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Type a word");
            String word = sc.next();
            String res = "";
            int i = 0;
            if (word.equalsIgnoreCase("Exit"))
                break;
            while (i<word.length()) res+=word.charAt(i++)+"*";
            System.out.println(res);
        }
        System.out.println("End");
    }

}
