package arrays;

import java.util.Arrays;

public class PositiveNegative {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,0,0,-3,-4,64,12,-11};
        // create 2 new arrays, regroup elements into positive and negative
        int pos = 0;
        int neg = 0;
        // count how many pos and neg i have
        for (int i = 0; i < nums.length; i++){
            int element = nums[i];
            if (element>0) pos++;
            else if (element<0) neg++;
        }
        int[] positive = new int[pos];
        int[] negative = new int[neg];
        //regroup
        int posArrIn = 0, negArrIn = 0;
        for (int i = 0; i < nums.length; i++){
            int el = nums[i];
            if (el>0){
                positive[posArrIn] = el;
                posArrIn++;
            } else if (el<0) {
                negative[negArrIn] = el;
                negArrIn++;

            }
        }
        System.out.println(Arrays.toString(positive));
        System.out.println(Arrays.toString(negative));
    }
}
