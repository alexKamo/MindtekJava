package methods;

public class CalculatorMethods {

    public  int getSum (int num1, int num2){
        return num1+num2;
    }

    public static void main(String[] args) {
        //creating object
        CalculatorMethods methods = new CalculatorMethods();
        System.out.println(methods.getSum(2,3));

        System.out.println(methods.multiTotal(2,5));
    }

    public int multiTotal (int num1, int num2){
        int multi = num1*num2;
        return multi;

    }


}
