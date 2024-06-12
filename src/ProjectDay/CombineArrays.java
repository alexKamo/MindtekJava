package ProjectDay;

import java.util.Arrays;

public class CombineArrays {
    public static void main(String[] args) {
        /*
        Write a code that combines two below arrays into
        one array and prints combined array. (Array can have different values)
        int[] array1={5,3,2};
        int[] array2={9,1,3,0,5};
        Output for an array should be: [5,3,2,9,1,3,0,5]
         */
        int[] array1 = {5, 3, 2};
        int[] array2 = {9, 1, 3, 0, 5};
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        int[] twoArr = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) twoArr[i] = array1[i];

        for (int i = 0; i < array2.length; i++) twoArr[array1.length + i] = array2[i];

        System.out.print(Arrays.toString(twoArr));
    }
}