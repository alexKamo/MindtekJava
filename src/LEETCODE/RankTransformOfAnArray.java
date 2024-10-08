package LEETCODE;

import java.util.Arrays;
import java.util.HashMap;

public class RankTransformOfAnArray {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = arr.clone();
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(temp);
        for ( int t : temp){
            map.putIfAbsent(t, map.size() + 1);
        }
        for (int i = 0; i < arr.length; i++){
            temp[i] = map.get(arr[ i]);
        }
        return temp;
    }
}



