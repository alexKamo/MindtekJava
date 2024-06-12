package conditions;

import java.util.Scanner;

public class SumInLoop {
    public static void main(String[] args) {
        //print the total sum of all given positive numbers
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.println("Enter a positive num");
            int num = sc.nextInt();
            if (num<0) break;
            sum += num;
        }
        System.out.println("The end");
        System.out.println("Total sum of positive num is: "+sum);

    }

}
