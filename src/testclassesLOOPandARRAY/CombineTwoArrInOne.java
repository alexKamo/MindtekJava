package testclassesLOOPandARRAY;

import java.util.Arrays;

public class CombineTwoArrInOne {

    public static int[] twoArrInOne(int[] num1, int[] num2){
        // Combine two arrays into one array. int nums[]={2,4,3}; int nums2[]={1,8};]
        int[] nums = new int[num1.length+num2.length];
        for (int i = 0, j = 0; i< nums.length; i++) {
            if(i< num1.length){
                nums[i] = num1[i];
            }else {
                nums[i] = num2[j];
                j++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {

        int[] n1 = {2,4,6,8};
        int[] n2 = {3,44,36,82};

        System.out.println(Arrays.toString(twoArrInOne(n1,n2)));

    }









}
