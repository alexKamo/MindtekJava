package arrays;

import java.util.Arrays;

public class TwoDimensionalArrayIntro {
    public static void main(String[] args) {
        int[][] coordenations = {{77,12,23},{56,78,66},{99,89,432}};
        //                           0           1          2
        //                         0  1  2  , 0  1  2 , 0   1   2
        System.out.println(Arrays.toString(coordenations));
        for (int[] arr : coordenations) System.out.println(Arrays.toString(arr));
        System.out.println("-------");
    //    System.out.println(coordenations[1][2]);


        // add 1 to every odd element
    //    coordenations[1][0] = coordenations[1][0] + 1; // coordenations[1][0]++;
        for (int i =0; i<coordenations.length; i++){
            for (int j = 0; j<coordenations[i].length; j++){
                if (coordenations[i][j]%2==1) coordenations[i][j]++;
            }
        }
        for (int[] arr : coordenations) System.out.println(Arrays.toString(arr));




    }

}
