package homeworks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetSumWithTarget {

    /*
    Write a method that has two parameters with array of ints and target int. If any of the integers are less than or equals to the target number,
    add those numbers to each other, provided they are unique (If the number duplicate, then add only once). Compare this sum to the target number.
    If this sum is greater than the target number, return an array with the sum of all the unique numbers that were less than or equal to the target number as well as true.
    Otherwise return the sum of all the numbers in the original array argument, as well as false.

Example:
int[] nums1={5, 2, 1, -5, -7, -14, 4, 3, 3};
   .getOutput(nums1, 3); -> returns array of objects [-20, true]

int[] nums2={7, 8, 5, 1, -4, -4, 11, 6, 12, 1, 1, -12, 100}
   .getOutput(nums2, 10); -> returns array of objects [132, false]

     */

    public Object[] getSum(int[] nums, int target){
        List<Integer> listOf = new ArrayList<>();
        int sum = 0;
        int unique = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (nums[i]<=target && !listOf.contains(nums[i])){
                unique += nums[i];
                listOf.add(nums[i]);
            }
        }
        boolean isGreater = unique < target;
        if (isGreater) return new Object[]{unique,true};
        else return new Object[]{sum,false};
    }


    public static void main(String[] args) {
        GetSumWithTarget getSumWithTarget = new GetSumWithTarget();
        int[] nums1={5, 2, 1, -5, -7, -14, 4, 3, 3};
        int[] nums2={7, 8, 5, 1, -4, -4, 11, 6, 12, 1, 1, -12, 100};
        System.out.println(Arrays.toString(getSumWithTarget.getSum(nums1,3)));
        System.out.println(Arrays.toString(getSumWithTarget.getSum(nums2,10)));
    }
}



