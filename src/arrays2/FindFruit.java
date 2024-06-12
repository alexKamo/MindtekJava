package arrays2;

import java.util.Scanner;

public class FindFruit {
    public static void main(String[] args) {
        /*
        ask a user to enter fruit
        if user ask a watermelon we need to find if we have
        Apple we have apple in store
         */
        String[] store = {"Orange","Banana","Kiwi","Apple","Grapes","Mango"};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter fruit: ");
        String fruit = sc.next();

        boolean found = false;

        for (String fr : store){
            if (fr.equalsIgnoreCase(fruit)) {
                System.out.println("We have "+fruit+" in store");
                found=true;
            }
        }
        if (!found) System.out.println("We don't have it");
    }
}
