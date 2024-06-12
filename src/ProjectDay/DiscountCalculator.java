package ProjectDay;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total purchase amount");
        double purchase = sc.nextDouble();
        boolean tenPer = purchase>=100;
        boolean fivePer = purchase>=50&&purchase<=99.99;
        boolean zeroPer = purchase>0&&purchase<50;
        if (tenPer){
            System.out.println("Discount Percentage: 10%");
            System.out.println("Discount Price: " + (purchase-(purchase*0.10)));
        }else if (fivePer) {
            System.out.println("Discount Percentage: 5%");
            System.out.println("Discount Price: " + (purchase-(purchase*0.05)));
        }else if (zeroPer){
            System.out.println("Discount Percentage: 0%");
            System.out.println("You don't have discount. Your price: "+purchase);
        }
            else System.out.println("Incorrect Entry");
        }

    }

