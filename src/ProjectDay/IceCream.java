package ProjectDay;

import java.util.Scanner;

public class IceCream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of month");
        int month = sc.nextInt();
        String Winter = "Ice-cream: Strawberry";
        String Spring = "Ice-cream: Chocolate";
        String Fall = "Ice-cream: Pumpkin";
        String Summer = "Ice-cream: Vanilla";
        if (month==12||month==1||month==2) System.out.println("Season is winter " +Winter);
        if (month==3||month==4||month==5) System.out.println("Season is spring " +Spring);
        if (month==6||month==7||month==8) System.out.println("Season is summer " +Summer);
        if (month==9||month==10||month==11) System.out.println("Season is fall " +Fall);
        else System.out.println("Your month is invalid...");







    }
}

