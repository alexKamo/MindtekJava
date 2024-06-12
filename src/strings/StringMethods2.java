package strings;

public class StringMethods2 {
    public static void main(String[] args) {
        String word = "programming";
        //substring:
        //String text = word.substring(0,7); //start from 4 go up tp  7
        String text = word.substring(4); //start from 4 go until end
        System.out.println(text);


        //replace:
        System.out.println(word.replace('m','M'));
        System.out.println(word);

    }
}

