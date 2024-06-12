package conditions;

import java.util.Scanner;

public class IncreasedOrder {
    public static void main(String[] args) {
        // print if given numbers were given in increased order or not
        Scanner sc = new Scanner(System.in);
        int cur = 0;
        boolean isInc = true;
        while(isInc){
            System.out.println("Enter a num");
            int num = sc.nextInt();
            if (num<0) break;
            if (cur<num) cur = num;
            else isInc = false;
        }
        if (isInc) System.out.println("Increasing order");
        else System.out.println("Not increasing order");
    }

}
