package homeworks;

public class CountNegativeAndPositiveNums {
    public static void main(String[] args) {
        /*
        1. Create a class with main method
        2. Create an array of ints: int[] numbers= new int[]{4,3,6,5,9,10, -12, -2, 0};
        3. Using for loop get count of positive numbers and count of negative numbers. Print total counts.
         */

        int[] numbers = new int[]{4,3,6,5,9,10,-12,-2,0};

        int posNum =0, negNum =0;
        for (int el : numbers){
            if (el>0) posNum++;
            else if (el<0) negNum++;
        }
        System.out.println("Positive numbers: "+posNum);
        System.out.println("Negative numbers: "+negNum);
    }
}
