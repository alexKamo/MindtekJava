package conditions;

import java.util.Scanner;

public class ReverseJavaLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String text = sc.nextLine();
        // print reversed version of a given string
        int reverse = text.length()-1;
        while (reverse>=0){
            System.out.print(text.charAt(reverse));
            reverse--;
        }
    }

}
