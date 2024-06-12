package ProjectDay;

import java.time.DayOfWeek;
import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.next();
        if (day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")||day.equals("Friday")) System.out.println("This is week day");
        else if (day.equals("Saturday")||day.equals("Sunday")) System.out.println("This is a weekend");
        else System.out.println("Invalid");









    }
}
