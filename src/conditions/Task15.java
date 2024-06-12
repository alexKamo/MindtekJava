package conditions;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        int secretNum = (int)(Math.random() * ((10 - 1) + 1));
        if (secretNum==0) secretNum++;
        System.out.println("You have 3 chances. Try to guess my number"
        + " It's in a range of 1 tp 10");
       int chances = 3;
       boolean isVic = false;
        Scanner sc = new Scanner(System.in);
        while (chances>0){
            System.out.println("Your guess");
           int num = sc.nextInt();
            chances--;
            if (chances==0) break;
            if (num>secretNum) System.out.println("Go down");
            else if (num<secretNum) System.out.println("Go up");
            else {
                System.out.println("You won, the number was " +secretNum);
                isVic=true;
                break;
            }
        }
       if (!isVic) System.out.println("You lost, my number was: " +secretNum);
    }
}
