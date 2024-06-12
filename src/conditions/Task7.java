package conditions;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String text = sc.nextLine();
        // print  pair of letter  from left and right sides
        // example: "coffee" -> ce, oe, ff
        int lefti = 0, righti = text.length()-1;
        while(lefti<=righti){
            if (lefti==righti) System.out.println(text.charAt(lefti));
            else System.out.println(text.charAt(lefti)+" "+ text.charAt(righti));
            lefti++;
            righti--;
        }
    }
}
