package ProjectDay;

import java.util.Arrays;

public class FindMissingNumber {
    public static void main(String[] args) {

        int[] nums = {1,3,5,8,6,9,2,10,4,12};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 1; i<nums.length; i++){
            if (nums[i-1]+1!=nums[i]){
                System.out.println("Missing num: "+(nums[i]-1));

            }
        }
    }
}

