package homeworks;

import java.util.Scanner;

public class SumOfNumbers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any num in a range of 0-500");
        int num = sc.nextInt();
        int sum = 0, i = 0;
        boolean range = num>0&&num<=500;
        if (range){
            while(i<num){
                i++;
                sum+=i;
            }System.out.println("The sum from 0 to "+num+ " is: " +sum);
        }else System.out.println("Your num isn't in range 0-500");
    }
}

