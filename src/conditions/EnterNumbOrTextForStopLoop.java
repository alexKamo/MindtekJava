package conditions;

import java.util.Scanner;

public class EnterNumbOrTextForStopLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        while(true){
//            System.out.println("I will keep asking numbers, until you enter \"55\" ");
//            System.out.println("Enter any number");
//            int num = sc.nextInt();
//            if (num==55){
//                System.out.println("The end");
//                break;
//            }
//        }
            int num = 0;
            while(num!=55){
                System.out.println("I will keep asking numbers, until you enter \"55\" ");
                System.out.println("Enter any number");
                num = sc.nextInt();
            }
        System.out.println("The end");
            int num1 = 0;
            String text = "55";
            if (!text.equals("Exit")) {
                num1 = Integer.valueOf(text);
            }
            System.out.println();



    }
}
