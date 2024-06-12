package arrays2;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        /*
        Enter your balance
        100
        How would you rate our service? (great/good/fair/custom)
        great - 25%
        good - 20%
        fair - 10%
        custom - your amount % (Enter your tim amount)
        your total 25% tip is added
        your total is amount+%
        Do you want to split a check
        if say no - you total is balance and + %
        if yes - how many people you want to split it - .....
        you want to split the check for how many people
        Each pays: ...
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you balance");
        double balance = sc.nextDouble();
        boolean invalid = false;
        double tip = 0;
        do {
            System.out.println("How would you rate our service? (great/good/fair/custom)");
            String rate = sc.next();
            invalid = false;
            switch (rate.toLowerCase()) {
                case "great":
                    tip = 25;
                    break;
                case "good":
                    tip = 20;
                    break;
                case "fait":
                    tip = 10;
                    break;
                case "custom":
                    System.out.println("Enter tip amount");
                    double useramount = sc.nextDouble()
                            ;
                    balance += useramount;
                    break;
                default:
                    System.out.println("Invalid entry");
                    invalid=true;
            }
        }while(invalid);
            balance += balance * tip / 100;
            System.out.println("Your total is: " + balance);
        do {
            System.out.println("Do you want to split it (Yes or No)");
            String split = sc.next();
            invalid=false;
            if (split.equalsIgnoreCase("yes")) {
                System.out.println("How many people you want to split");
                int people = sc.nextInt();
                double each = balance / people;
                String icon = "";
                while (people > 0) {
                    icon += "&";
                    people--;
                }
                System.out.println("You are splitting the check " + icon + " people");
                System.out.println("Each people will pay: " + each);
            } else if (split.equalsIgnoreCase("no")){
                System.out.println("Your total is:" + balance);
            }
            else {
                System.out.println("Invalid entry");
                invalid = true;
            }
        }while(invalid);
    }
}
