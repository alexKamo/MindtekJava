package LEETCODE;

import java.util.HashMap;
import java.util.Map;

public class validAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            char letter1 = s.charAt(i);
            if(map.containsKey(letter1)){
                map.put(letter1,map.get(letter1)+1);
            }else map.put(letter1,1);

            char letter2 = t.charAt(i);
            if (map.containsKey(letter2)) map.put(letter2, map.get(letter1)-1);
            else map.put(letter2,1);
        }
        return true;
    }
}
