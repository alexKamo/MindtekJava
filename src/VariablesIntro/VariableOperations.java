package VariablesIntro;

public class VariableOperations {
    public static void main(String[] args) {
        // assigning operator: =
        int num1 = 5;
        int num2 = num1;
        int num3 = num2;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        System.out.println("********");

        String name = "Jack";
        String name2 = "Druno;";
        String name3 = name;
        name = name2;
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);

        System.out.println("********");
        char symbol1 = 's', symbol2 = 'k', symbol3 = symbol1;
        symbol2 = symbol3;
        System.out.println(symbol1);
        System.out.println(symbol2);
        System.out.println(symbol3);





    }
}
