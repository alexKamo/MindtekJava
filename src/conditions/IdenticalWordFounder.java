package conditions;

import java.util.Scanner;

public class IdenticalWordFounder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String text = sc.nextLine();
        //find out if text has identical neighbor pairs
        // text "sunny"
        int i = 0;
        boolean iden = false;
        while (i<text.length()-1){
            if (text.charAt(i) == text.charAt(i+1)){
                iden = true;
                break; //escape the loop; do not continue the loop; THE LAST STATEMENT
            }
            i++;
        }
        if (iden) System.out.println("Identical pair found");
        else System.out.println("No identical pair found");
    }

}
