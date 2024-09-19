package LEETCODE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class UncommonWordsFromTwoSentences {
    public String[] uncommonFromSentences(String s1, String s2) {
        // count appearence of each word from both sentences
        // put words that appear only 1 time into an array
        // return that array

        /*
        A sentence is a string of single-space separated words where each word consists only of lowercase letters.
        A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.
        Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.
    Example 1:
        Input: s1 = "this apple is sweet", s2 = "this apple is sour"
        Output: ["sweet","sour"]
    Explanation:
        The word "sweet" appears only in s1, while the word "sour" appears only in s2.
    Example 2:
        Input: s1 = "apple apple", s2 = "banana"
        Output: ["banana"]
         */
        Map<String,Integer> map = new HashMap<>();
        for (String words : s1.split(" ")){
            map.put(words, map.getOrDefault(words,0)+1);
        }
        for (String words : s2.split(" ")){
            map.put(words, map.getOrDefault(words,0)+1);
        }
        List<String> res = new ArrayList<>();
        for (String words : map.keySet()){
            if (map.get(words) == 1){
                res.add(words);
            }
        }
        return res.toArray(new String[0]);
    }
}