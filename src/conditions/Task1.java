package conditions;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of week day");
        int weekDay = sc.nextInt();
//        if (weekDay==1) System.out.println("Monday");
//        else if (weekDay==2) System.out.println("Tuesday");
//        else if (weekDay==3) System.out.println("Wednesday");
//        else if (weekDay==4) System.out.println("Thursday");
//        else if (weekDay==5) System.out.println("Friday");
//        else if (weekDay==6) System.out.println("Saturday");
//        else if (weekDay==7) System.out.println("Sunday");
//        else System.out.println("Invalid day!");

        switch (weekDay){
            case 1 : System.out.println("Monday");
                break;
            case 2 : System.out.println("Tuesday");
                break;
            case 3 : System.out.println("Wednesday");
                break;
            case 4 : System.out.println("Thursday");
                break;
            case 5 : System.out.println("Friday");
                break;
            case 6 : System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default: System.out.println("Invalid day");
        }








        }
    }

