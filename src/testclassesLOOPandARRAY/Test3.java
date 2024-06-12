package testclassesLOOPandARRAY;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ur word: ");
        String text = sc.nextLine();

        // print reverse version of a given string

        int reverse = text.length()-1;
        while(reverse>=0){
            System.out.println(text.charAt(reverse));
            reverse--;
        }
        System.out.println("-------------------------");
        for (int i = text.length()-1; i>=0; i--){
            System.out.println(text.charAt(i));
        }
    }

}
