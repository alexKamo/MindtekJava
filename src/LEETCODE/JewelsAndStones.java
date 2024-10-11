package LEETCODE;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class JewelsAndStones {

    public int numJewelsInStones(String jewels, String stones) {

//        int res = 0;
//
//        for (char el : stones.toCharArray()) if (jewels.contains(el+""))
//            res++;
//        return res;


//        int res = 0;
//
//        for(int i = 0; i < stones.length(); i++) {
//            for(int j = 0; j < jewels.length(); j++) {
//                if(stones.charAt(i) == jewels.charAt(j)){
//                    res++;
//                }
//            }
//        }
//
//        return res;


        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (char el : stones.toCharArray()){
            if(!map.containsKey(el)) map.put(el,1);
            else map.put(el,map.get(el)+1);
        }

        for(char el : jewels.toCharArray()){
            if(map.containsKey(el)) res += map.get(el);
        }
        return res;
    }

}
