package ProjectDay;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you know Java? (Enter 1 for Yes and 2 for No)");
        int num1 = sc.nextInt();
        System.out.println("How many percent is your attendance? (0-100)");
        int num2 = sc.nextInt();
        System.out.println("Did you finish all assignments? (Enter 1 for Yes and 2 for No)");
        int num3 = sc.nextInt();
        if (num1==1 && (num2>=80&&num2<=100) && num3==1) System.out.println("It's time to learn Selenium");
        else System.out.println("Practice Java");
    }
}
