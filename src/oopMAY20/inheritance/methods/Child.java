package oopMAY20.inheritance.methods;

public class Child extends Parent{

    /*
    Inherited Methods:
        - Final Method
        - Regular Method

     Method can be Overridden:
         - Regular Method
     */

    public static String staticMethod(){
        return "Static Method of Child Class";
    }

    @Override
    public String regularMethod(){
        return "Regular Method of Child Class";
    }
}
