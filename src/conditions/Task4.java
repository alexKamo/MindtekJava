package conditions;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String text = sc.nextLine();
      //Print every letter in a single new line
        int num = 0;
        while (num<text.length()){
            System.out.println(text.charAt(num));
            num++;
        }


    }
}
