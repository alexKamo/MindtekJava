package strings;

public class StringIntro {
    public static void main(String[] args) {
        // re variables may have methods
        // to use methods: varName.

        String text = "j_a_v_a";
        text = text.toLowerCase(); //make from this part all lowercase to Upper
        System.out.println(text.toUpperCase()); //.toUpperCase() -> method
        System.out.println(text);
        System.out.println("MINDEK".toLowerCase());
        System.out.println(text.length()); //count letter and space
        //return: brings back to the caller
        //caller -> code from where the method is being called

        //Structure of String variables:
        //String word = "ja va"
        // j_a_v_A_
        // 01234567
        //first index: 0
        //last index: word.length()-1
        System.out.println(text.charAt(3));
    }
}

