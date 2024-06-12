package ProjectDay;

import java.util.Arrays;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        //Write a code that finds duplicates in Array.
        //output: 2, 3
        //Task C
        int[] nums={4,3,2,7,8,2,3,1,2};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]==nums[j]){
                    System.out.print(nums[i]+" ");
                    break;
                }
            }

        }

    }
}

