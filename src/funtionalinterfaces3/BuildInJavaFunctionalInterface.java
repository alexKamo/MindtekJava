package funtionalinterfaces3;

import java.util.function.Function;

public class BuildInJavaFunctionalInterface {
    public static void main(String[] args) {

        Function<Integer,Boolean> validAge = x -> x>=18;
        System.out.println(validAge.apply(20));

        System.out.println("***************************");

        Function<String,String> getInitials = x -> {
            char firstNameI = x.charAt(0);
            char lastNameI = x.charAt(x.indexOf(" ")+1);
            return ""+firstNameI+lastNameI;
        };
        System.out.println(getInitials.apply("John Doe"));
        System.out.println(getInitials.apply("Leo Kaprio"));

        System.out.println("***************************");
        Function<Car,Boolean> isBrandNew = x -> x.getTear()==2024;
        Car car = new Car("Toyota",2024,"Miami Blue", "Coupe");
        System.out.println(isBrandNew.apply(car));



    }
}
