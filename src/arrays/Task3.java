package arrays;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,4,2};
        /*
        count total number of even elements
         */

        int c = 0;
        for(int i =0; i<arr.length; i++)
            if (arr[i]%2==0) c++;
        System.out.println("Even elements: "+c);

        //create a new arrays which hold all even values take from arr and print in new array

        int[] even = new int[c];
        int ei = 0;
        for (int i =0; i<arr.length; i++){
            int el = arr[i];
            if (el%2==0){
                even[ei] = el;
                ei++;
            }
        }
        System.out.println(Arrays.toString(even));







    }
}
