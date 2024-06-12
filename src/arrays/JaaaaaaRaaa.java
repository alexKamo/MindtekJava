package arrays;

import java.util.Arrays;

public class JaaaaaaRaaa {

    public static void main(String[] args) {
        int[] arr = {11,22,23,34,45,56,67,89};
        separateEvenAndOdd(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void separateEvenAndOdd(int[] arr) {
        int even = 0;
        int odd = arr.length - 1;

        while (even < odd) {
            if (arr[even] % 2 != 0 && arr[odd] % 2 == 0) {
                int temp = arr[even];
                arr[even] = arr[odd];
                arr[odd] = temp;
            }

            if (arr[even] % 2 == 0) {
                even++;
            }

            if (arr[odd] % 2 != 0) {
                odd--;
            }
        }
    }
}
