package VariablesIntro;

public class VariableMath {
    public static void main(String[] args) {

        // operations: + - * / %

        System.out.println("start");

        // +
         int num1 = 5, num2 = 8;
         int sum = num1 + num2;
         System.out.println(sum);

        int minus = num1 - num2;
        System.out.println(minus);

        int multi = num1 * num2;
        System.out.println(multi);

//        int div = num2/2;
//        System.out.println(div);

        double div = (double) num2/3;
        System.out.println(div);

        System.out.println("--------");
        // % -. remainder
        int num =100;
        // a % b -. find remainder from division of a/b
        int remainder = num%4;
        // even numbers : 10,12,16,88 -> when divided by 2 the rem 0
        // odd numbers: 11,13,33... -> when divided the rem 1
        System.out.println(remainder);








    }
}
