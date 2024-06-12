package ProjectDay;

public class SumOFOddNums {
    public static void main(String[] args) {
        int[] numbers = {4,2,9,1,0,21,101};
        int sum = 0;
        for(int i = 0; i<numbers.length; i++)
            if (numbers[i]%2!=0){
                sum+=numbers[i];
            }
        System.out.println("Total odd sum is: " +sum);
    }
}

