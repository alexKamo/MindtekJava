package LEETCODE;

import java.util.HashMap;
import java.util.Map;

public class validAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            char letter = s.charAt(i);
            if(map.containsKey(letter)){
                map.put(letter,map.get(letter)+1);
            }
            else map.put(letter,1);
        }
        return true;
    }
}
