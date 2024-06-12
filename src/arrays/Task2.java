package arrays;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {


        int[] arr = {1,3,5,4,2};
        //replace each elem,ent is array with its cube: 5 -> 5*5*5 = 125;
        //find total sum of all elements
        //find average of all elements
        int s = 0;
        for (int i =0;i<arr.length;i++){
            arr[i] = arr[i] * arr[i] * arr[i];
            s+=arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Sum: "+s);
        System.out.println("Average: "+((double)s/arr.length));






    }
}
