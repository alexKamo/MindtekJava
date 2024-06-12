package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int[] nums = {123,145,167,234,345,567,789,1000};
        System.out.println(Arrays.toString(nums));
        // find and print index of given value
        Scanner sc = new Scanner(System.in);
        System.out.println("Search for which value?");
        int value = sc.nextInt();
        int index = 0;
        //compare each element from array with value
        //if they match then save the index of element
    //    for (int i = 0; i<nums.length; i++) if (nums[i]==value) index=i;
        //print
        System.out.println("Index " + Arrays.binarySearch(nums,value));
        // first if we want to do binary search we need to sort nums
        // time complexity: 0(n)






    }

}
