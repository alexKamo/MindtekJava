package funtionalinterfaces3;

import java.util.List;
import java.util.jar.Attributes;

public class CarTest {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota",2020,"White", "Sedan");
        Car car2 = new Car("Honda",2024,"Red", "SUV");
        Car car3 = new Car("Mercedes",2022,"Black", "Sedan");
        Car car4 = new Car("Volkswagen",2015,"Grey", "Hatchback");
        Car car5 = new Car("Ferrari",2000,"Blue", "Coupe");

        List<Car> cars = List.of(car1,car2,car3,car4,car5);

        /*
        Get cars model that is 2020 and newer.
         */

//        for (Car c : cars){
//            if (c.getTear()>=2020){
//                System.out.println(c.getModel());
//            }
//        }

        ge0tDataFromCars(cars, x -> x.getTear()>=2020, car -> car.getModel());

         /*
         Get colors of SUV cars
          */
//        for (Car c : cars){
//            if (c.getType().equalsIgnoreCase("SUV")){
//                System.out.println(c.getColor());
//            }
//        }

        ge0tDataFromCars(cars, car -> car.getType().equalsIgnoreCase("SUV"), car -> car.getColor());

        ge0tDataFromCars(cars, car -> car.getType().equalsIgnoreCase("Sedan"), car -> car.getTear());

        ge0tDataFromCars(cars, car -> car.getTear()%2==0 && car.getType().equalsIgnoreCase("SUV"),car -> car.getModel().substring(0,3).toUpperCase());
        System.out.println("----------------------------------");
//      Count SUV cars
        System.out.println("Number of SUV cars: " + getCountOfCars(cars,x -> x.getType().equalsIgnoreCase("SUV")));
//      Count Sedan cars
        System.out.println("Number of Sedan cars: " + getCountOfCars(cars,x -> x.getType().equalsIgnoreCase("Sedan")));
//      Count Black cars
        System.out.println("Number of Black cars: " + getCountOfCars(cars,x -> x.getColor().equalsIgnoreCase("Black")));

    }
    public static int getCountOfCars(List<Car> cars, CarCondition condition){
        int count = 0;
        for (Car c : cars){
            if (condition.apply(c)){
                count++;
            }
        }
        return count;
    }

    public static void  ge0tDataFromCars(List<Car> cars, CarCondition condition, AttributeFunction<Object> function){
        System.out.println("----------------------------------");

        for (Car c : cars){
            if (condition.apply(c)){
                System.out.println(function.get(c));
            }
        }

    }

}
