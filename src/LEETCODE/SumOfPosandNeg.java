package LEETCODE;

public class SumOfPosandNeg {
    public int maximumCount1(int[] nums) {
        int posN = 0;
        int negN = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<0) negN++;
            if (nums[i]>0) posN++;
        }
        return Math.max(posN,negN);
    }

    public int maximumCount2(int[] nums) {
        if (nums[0] > 0 || nums[nums.length - 1] < 0) return nums.length;

        int left = 0, right = nums.length - 1, mid = 0;
        //fing first occurrence of zero
        while (left < right) {
            mid = left + (right - left) / 2;
            if (nums[mid] < 0) left = mid + 1;
            else right = mid;
        }
        int neg = left;
        int l = 0, r = nums.length;
        while (left < right) {
            mid = l + (r - l) / 2;
            if (nums[mid] > 0) r = mid;
            else l = mid + 1;
        }
        int pos = nums.length - l;
        return Math.max(neg,pos);
    }
}
