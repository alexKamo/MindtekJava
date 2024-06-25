package LEETCODE;

import java.util.HashMap;
import java.util.Map;

public class validAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        int[] letters = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            int index = 'z' - letter;
            letters[index]++;

            char letter2 = t.charAt(i);
            int index2 = 'z' - letter2;
            letters[index2]--;
        }
        for (int el : letters) if (el!=0) return false;

        return true;
    }
}
