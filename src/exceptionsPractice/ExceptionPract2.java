package exceptionsPractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPract2 {

    public static void main(String[] args) {

        boolean isException = false;

        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter two num");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                int result = num1/num2;
                System.out.println("Division of two numbers equal to " + result);
                isException = false;
            }catch (ArithmeticException | InputMismatchException exception){
                System.out.println(exception.getMessage());
                isException = true;
                if (exception.getMessage().equalsIgnoreCase("/ by zero")){
                    System.out.println("Number 2 can't be 0");
                }
            }
        }while (isException);

    }

}
