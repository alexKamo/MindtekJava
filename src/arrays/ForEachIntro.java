package arrays;

public class ForEachIntro {

    public static void main(String[] args) {
        char[] symbols = {'A','$','h','H','y','#','*','@','k','$'};

        //for (int i = 0; i< symbols.length; i++) System.out.println(symbols[i]);
        //char el : symbols -> element represents each value from symbols array
        for (char el : symbols) System.out.println(el); //read only from left to right



    }
}
