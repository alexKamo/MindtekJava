package LEETCODE;

import java.util.HashMap;

public class RomanToInteger {

    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                res -= map.get(s.charAt(i));
            } else {
                res += map.get(s.charAt(i));
            }
            res += map.get(s.charAt(s.length() - 1));
        }
        return res;
    }

    public static void main(String[] args) {
        int res = romanToInt("IV");
        System.out.println(res);
    }
}
