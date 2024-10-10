package LEETCODE;

import java.util.Arrays;
import java.util.List;

public class JewelsAndStones {

    public int numJewelsInStones(String jewels, String stones) {

        int i = 0;

        List<String> list = Arrays.asList(stones.split(" "));

        for(String s : list){
            if (jewels.contains(s)){
                i++;
            }
        }
        return i;
    }

}
