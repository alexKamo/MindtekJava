package arrays;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {

        int[][] cord = {{77,12,23},{56,78,66},{99,89,432}};

        /*
        add 100 to all numbers less than 90
        subtract(minus) 100 to all numbers greater than 90
        */

        for (int[] num : cord) System.out.println(Arrays.toString(num));
        for (int i = 0; i<cord.length; i++){
            for (int j = 0; j<cord[i].length; j++){
                if (cord[i][j]<90) cord[i][j]+=100;
                else if (cord[i][j]>90) cord[i][j]-=100;
            }
        }
        for (int[] num : cord) System.out.println(Arrays.toString(num));
    }
}
