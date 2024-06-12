package ProjectDay;

import java.util.Scanner;

public class Stairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        for (int i = 0; i<=num; i++){
            for (int s=1; s<=i; s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
