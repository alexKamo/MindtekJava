package functionalinterfaces;

public class TestFunctionalInterface {

    public static void main(String[] args) {

        // LAMBDA EXPRESSION
        Printer p = (str) ->  System.out.println("Printing: "+str);

        p.print("Message");
        p.print("Alex");

        Printer p2 = (str)-> System.out.println("Running: " +str);
        p2.print("Johny");

        Calculator c = (int a, int b) -> a+b;
        System.out.println(c.calculator(4,5));
        Calculator multiplication = (a,b) -> a*b;
        System.out.println(multiplication.calculator(2,3));


    }

}

