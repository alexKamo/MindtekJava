package testclassesLOOPandARRAY;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class IntQ {

    public static Map<Character,Integer> countLetters(String str){
        Map<Character,Integer> map = new TreeMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            }else{
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(countLetters("Java"));

    }
}
