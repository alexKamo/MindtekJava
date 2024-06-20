package LEETCODE;

import java.util.Arrays;

public class MissingNumber {

    public int missingNumber(int[] nums){
        int sum = 0;
        for (int el : nums) sum+=el;
        return (nums.length * (nums.length + 1)) /2 - sum;
    }

}
