package conditions;

import java.util.Scanner;

public class Triplet {
    public static void main(String[] args) {
        // print all triplets of a give string is separate line
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String text = sc.nextLine();
        int index = 2;
        while (index<text.length()){
            System.out.println(""+text.charAt(index-2+text.charAt(index-1)+text.charAt(index)));
            index++;
        }
        System.out.println("Can't be triplex");





    }
}
