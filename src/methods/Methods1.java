package methods;

import java.util.Arrays;

public class Methods1 {

    public boolean ArrayContainsValue (int[] nums, int num2){
        for (int i = 0; i<nums.length; i++){
            if (nums[i]==num2){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Methods1 methods = new Methods1();
        int[] nums = {2,5,7,9};
        System.out.println(methods.ArrayContainsValue(nums,5));
        System.out.println(methods.ArrayContainsValue(nums,6));

        System.out.println("--------------------------------------------------");



        int[] n1={1,3,5,7,9};
        int[] n2={1,3,7,9,5};
        System.out.println(methods.SameArrNum(n1,n2));
    }

    public boolean SameArrNum(int[] n1, int[] n2){


        if (n1.length!= n2.length)
            return false;

        Arrays.sort(n1);
        Arrays.sort(n2);
        for (int i = 0; i< n1.length; i++){
            if (n1[i]!=n2[i]){
                return false;
            }
        }
        return true;
    }
}
