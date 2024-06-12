package testclassesLOOPandARRAY;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ur word: ");
        String text = sc.nextLine();

        // print pair of letters from left and right sides

        int left = 0, right = text.length()-1;
        while(left<=right){
            if (left==right) System.out.println(text.charAt(left));
            else
            System.out.println(text.charAt(left) + " " + text.charAt(right));
            left++;
            right--;


        }
    }
}
