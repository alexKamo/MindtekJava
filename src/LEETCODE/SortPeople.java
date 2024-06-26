package LEETCODE;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortPeople {

    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        String[] sortedNames = new String[names.length];
        int ind = 0;
        for (int i = 0; i < heights.length-1; i++) {
            sortedNames[ind] = map.get(heights[i]);
            ind++;
        }
        return sortedNames;
    }

}
