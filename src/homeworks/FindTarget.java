package homeworks;

import java.util.Arrays;

public class FindTarget {
    /*
    Write a method that accepts 2 parameters.
    First parameter is Array of integers and second parameter is target number.
    Method should return array of three integers that sum equal to target number.
    Return null if array has less than 3 numbers.
     */
    public static int[] findTarget(int[] nums, int target) {
        if (nums.length < 3) return null;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int a = i + 1; a < nums.length - 1; a++) {
                for (int s = a + 1; s < nums.length; s++) {
                    if (nums[i] + nums[a] + nums[s] == target) {
                        return new int[]{nums[i], nums[a], nums[s]};
                    }
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findTarget(new int[]{3, 1, 5, 8}, 12)));
        System.out.println(Arrays.toString(findTarget(new int[]{2, 1}, 3)));
        System.out.println(Arrays.toString(findTarget(new int[]{4, 2, 1, 9, 6, 7}, 9)));
    }
}

