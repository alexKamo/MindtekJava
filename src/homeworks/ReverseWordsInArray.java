package homeworks;

import java.util.Arrays;

public class ReverseWordsInArray {
    public static void main(String[] args) {
        /*
        1. Create a class with main method
        2. Create below array
        String[] words={“Hi”, “java”, “String”};
        3. Reassign each value of array with reversed word. Then print that array.

        Output:
        [iH, avaj, gnirtS]
         */
        String[] words = {"Hi", "java", "String"};

        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            int first = 0;
            int last = words[i].length() - 1;
            while (first < last) {
                char temp = chars[first];
                chars[first] = chars[last];
                chars[last] = temp;
                first++;
                last--;
            }
            words[i] = new String(chars);
        }
        System.out.print(Arrays.toString(words));
    }
}






