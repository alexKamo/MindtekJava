package ProjectDay;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 nums");
        for (int i = 0; i < 5; i++) numbers[i] = sc.nextInt();
        int max = numbers[0];
        for (int j = 0; j < numbers.length; j++)
            if (numbers[j] > max) max = numbers[j];
        System.out.println("Arrays: " + Arrays.toString(numbers));
        System.out.println("Largest number is: " +max);
    }
}

