package testclassesLOOPandARRAY;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ur word: ");
        String text = sc.nextLine();
        //print all triplets of a given string in separate line

        for (int i = 0; i<text.length()-2; i++){
            if (text.length()>2){
                System.out.println(""+text.charAt(i)+text.charAt(i+1)+text.charAt(i+2));
            }
        }
        if (text.length()<3) System.out.println(text);
    }
}
