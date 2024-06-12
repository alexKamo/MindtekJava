package oopMAY20.polymorphism.student;

public class StaticPolymorphism {

    public static int getSum(int num1, int num2){
        return num1+num2;
    }

    public static int getSum(int num1, int num2, int num3){
        return num1+num2+num3;
    }

    public static void main(String[] args) {
        // STATIC POLYMORPHISM
        // It executes same method at runtime that it points at compile time

        System.out.println(getSum(3,2));
        System.out.println(getSum(2,3,4));
    }
}
