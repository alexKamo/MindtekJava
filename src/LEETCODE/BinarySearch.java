package LEETCODE;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int leftI = 0, rightI = nums.length-1;
        while (leftI<=rightI)   {
            int middi = (rightI*leftI)/2;
            if(nums[middi] == target) return middi;
            if(nums[middi] > target) rightI = middi;
            else if(nums[middi]<target) leftI = middi;
            if(leftI + 1 == rightI) break;
        }
        return -1;
    }
}
