package ArrayList3May1416;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMethods {

    public static void main(String[] args) {

        List<String> cards = new ArrayList<>();

        Collections.addAll(cards,"VISA","Master Card","Discover","AMEX");
        Collections.sort(cards);
        System.out.println(cards);

        Collections.reverse(cards);
        System.out.println(cards);

        Collections.shuffle(cards);






    }

}
