package VariablesIntro;

public class Comparing {
    public static void main(String[] args) {
        int num1 = 56;
        int num2 = 66;
        // >, >=, <, <=, ==, !=;
        System.out.println("num1: " +num1);
        System.out.println("num2: " +num2);
        boolean isGreat = num1 > num2;
        System.out.println("num1 > num2: " + (num1>num2));
        System.out.println("num1 >= num2: " +(num1 >= num2));
        System.out.println("num1 < num2: " +(num1<num2));
        System.out.println("num1 <= num2: " +(num1<=num2));
        System.out.println("num1 == num2: " +(num1==num2));
        System.out.println("num1 != num2: " +(num1!=num2));

    }
}

