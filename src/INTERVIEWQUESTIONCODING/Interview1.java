package INTERVIEWQUESTIONCODING;

import java.util.Arrays;

public class Interview1 {

    public static void main(String[] args) {

        //1. Combine two arrays into one array. int nums[]={2,4,3}; int nums2[]={1,8};
        //
        //2. Write a code that will reverse sentence. String str=”String is immutable”; output: “immutable is String“;



        int nums1[]={2,4,3};
        int nums2[]={1,8};
        int[] res = new int[nums1.length+ nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                res[i] = nums1[i];
                res[nums1.length+j] = nums2[j];
            }
        }
        System.out.println(Arrays.toString(res));





    }

}
