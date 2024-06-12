package methods;

import java.util.Arrays;

public class Methods2 {

    public int[]  findTarget(int[] nums, int target){

        int[] indexes = new int[2];

        for( int i = 0; i< nums.length; i++){
            for (int j = i+1; j< nums.length; j++){
                if (nums[i]+nums[j]==target){
                    indexes[0]=i;
                    indexes[1]=j;
                    return indexes;
                }
            }
        }
        if (indexes[0]==0 && indexes[1]==0) return null;
        return indexes;
    }

    public static void main(String[] args) {
        Methods2 methods = new Methods2();
        int[] nums = {2,5,1,8};
        System.out.println(Arrays.toString(methods.findTarget(nums,6)));
        // we found not 5+1 we found where located 5 and 1 at index 1 and 2

    }

}
