package strings;

public class StringMethods {
    public static void main(String[] args) {
        // .indexOf('a'); as a parameter give one char, return back an int
        //             01234567
        String word = "universe";
        System.out.println(word.indexOf('e')); // helps to find first char letter
        System.out.println(word.lastIndexOf('e'));


        // contains method
        System.out.println(word.contains("se"));

        // equals:
        System.out.println(word.equals("university"));
        System.out.println(word.equalsIgnoreCase("UNIverse"));

        // startsWith
        System.out.println(word.startsWith("uni"));
        System.out.println(word.endsWith("e"));

        // trim:
        String name = "  Jack  Smith  ";
        System.out.println(name.length()); //count all line and space between words
        name = name.trim();
        System.out.println(name.trim() ); //count  only words

        // chaining:
        String el = "  java  ";
        // make sure all letters are uppercase
        // remove empty space from both sides and find if the length of trimmed
        // el is even
       /*
        el = el.toUpperCase();
        el = el.trim();
        int length = el.length();
        boolean isEven = length%2==0;
        if (isEven) System.out.println("Length is even");
        else System.out.println("Length is odd");
        */
        if (el.toUpperCase().trim().length() %2==0) System.out.println("Length is even");
        else System.out.println("Length is odd");





    }
}
