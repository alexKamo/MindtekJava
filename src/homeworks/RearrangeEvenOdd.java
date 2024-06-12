package homeworks;

import java.util.Arrays;

public class RearrangeEvenOdd {
    public static void main(String[] args) {
        /*
        Write a Java program to separate even and odd numbers from a given array of integers. Put all even numbers first, and then odd numbers.
        int[] arr = {11,22,23,34,45,56,67,89};
        output:
        [22,34,56,11,23,45,67,89]
         */
        int[] arr = {11, 22, 23, 34, 45, 56, 67, 89};
        System.out.println(Arrays.toString(arr));
        int[] newArr = new int[8];
        int i = 0;
        for (int j : arr){
            if (j%2==0){
                newArr[i] = j;
                i++;
            }
        }
        for (int j : arr){
            if (j%2!=0){
                newArr[i] = j;
                i++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
