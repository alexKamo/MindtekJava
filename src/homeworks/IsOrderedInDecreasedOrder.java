package homeworks;

import java.util.Arrays;

public class IsOrderedInDecreasedOrder {
    public static void main(String[] args) {
        /*
        Create a new class and a main method.
        Create new array:
        int[] arr1 = {45,44,32,21,2,1,-5};
        1 print array itself.
        2 write a code that finds out if elements of the array are in decreasing order. (Decreasing order: When numbers are arranged from high to low.)
        if there is a decreasing order then print "In decreasing order" otherwise print "Not in order"Ex:
        [45,44,32,21,2,1,-5]
        In decreasing order
        Ex:
        [45,44,312,21,2,1,500]
        "Not in decreasing order"
         */
        int[] arr1 = {45,44,312,21,2,1,500};
        System.out.println(Arrays.toString(arr1));
        boolean decrOrder = true;
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] >= arr1[i - 1]) {
                decrOrder = false;
                break;
            }
        }
        if (decrOrder) System.out.println("In decreasing order");
        else System.out.println("Not in decreasing order");
    }
}


