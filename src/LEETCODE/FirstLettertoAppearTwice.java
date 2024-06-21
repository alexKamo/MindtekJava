package LEETCODE;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstLettertoAppearTwice {

    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i<s.length(); i++){
            if(!set.add(s.charAt(i))){
                return s.charAt(i);
            }
        }
        return 'a';
    }

}
