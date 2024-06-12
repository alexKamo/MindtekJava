package arrays;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[] nums = {1,-5,0,3,-7};
        int pos = 0;
        int neg = 0;
        // count how many pos and neg i have
        for (int el : nums){
            if (el>0) pos++;
            else if (el<0) neg++;
        }
        int[] positive = new int[pos];
        int[] negative = new int[neg];
        //regroup
        int posArrIn = 0, negArrIn = 0;
        for (int el : nums){
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
