package LEETCODE;

public class SumOfPosandNeg {
    public int maximumCount(int[] nums) {
        int posN = 0;
        int negN = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<0) negN++;
            if (nums[i]>0) posN++;
        }
        return Math.max(posN,negN);
    }

}
