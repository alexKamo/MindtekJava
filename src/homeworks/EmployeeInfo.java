package homeworks;

import java.util.Scanner;

public class EmployeeInfo {
    public static void main(String[] args) {
        /*
        1. Create a class with main method
        2. Create below String variable
           String info="David,SDET,Chicago";
        3. Applying String methods to info variable print output like below:
        DAVID
        SDET
        CHICAGO
        use \n to write in next line
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name, what you do, city where live");
        String info = sc.nextLine();
        String replace = info.replace(",", "\n");
        System.out.println(replace);



    }
}

