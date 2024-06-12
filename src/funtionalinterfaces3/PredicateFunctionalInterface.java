package funtionalinterfaces3;

import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateFunctionalInterface {

    public static void main(String[] args) {

        Predicate<String> contLetA = x->x.toLowerCase().contains("a");
        System.out.println(contLetA.test("Java"));
        System.out.println(contLetA.test("Python"));
        System.out.println("***************************");

        BiPredicate<String,String> isAnagram = (x,y) ->{
          char[] xLetters = x.toLowerCase().toCharArray();
          char[] yLetters = y.toLowerCase().toCharArray();
            Arrays.sort(xLetters);
            Arrays.sort(yLetters);
            return Arrays.toString(xLetters).equals(Arrays.toString(yLetters));
        };

        System.out.println(isAnagram.test("abcd","dcba"));
        System.out.println(isAnagram.test("Java","Lava"));
        System.out.println(isAnagram.test("Java","java"));


    }
}
