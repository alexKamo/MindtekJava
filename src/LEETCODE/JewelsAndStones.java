package LEETCODE;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class JewelsAndStones {

    public int numJewelsInStones(String jewels, String stones) {

        int res = 0;

        for (char el : stones.toCharArray()){
             if (jewels.contains(el+"")){
                 res++;
             }
        }

        return res;
    }

}
