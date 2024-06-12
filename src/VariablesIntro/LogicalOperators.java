package VariablesIntro;

public class LogicalOperators {
    public static void main(String[] args) {
        // AND -> &&  (must be all true for make a true
        // if we have only one false all truth will make a false)
        boolean isGreen = true;
        boolean noOneIsCrossing = true;
        boolean carIsRunning = true;
        boolean canStartDriving = isGreen && noOneIsCrossing && carIsRunning;


        if(canStartDriving)
            // or we can write this -> if(isGreen && noOneIsCrossing)
            System.out.println("Press the gas pedal");
        else System.out.println("Wait!");

        // OR -> || (for make whole false need to be all false
        // to make true can be only one true)
        // buy oranges AND apples -> buy 2 product
        //  buy oranges OR apple -> buy 1 product
        System.out.println("Book Club for people with age between 25-35"); // age>=25  age<=35

        int age = 12;
        boolean validAge = age>=25 || age<=35;
        if(validAge) System.out.println("You can apply");
        else System.out.println("Your age isn't in a range of 25-35");

        System.out.println("Teenager Female Book club"); // age  13<=age<=20 and Female   age>=13 && age<=19 && gender==1




    }

}
