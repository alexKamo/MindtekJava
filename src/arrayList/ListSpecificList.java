package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSpecificList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(16);
        list.add(24);
        list.add(33);

        //Print sum of odd numbers
        int odd = 0;
        for (Integer l : list){
            if (l%2==1) odd+=l;
        }
        System.out.println("Sum of odd nums: "+odd);

        list.add(10);
        System.out.println(list);

        // How to sort numbers in ArrayList -> ascending order (from lower to higher)
        Collections.sort(list);
        System.out.println(list);

        // How to reverse descending order (from higher to lower)
        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);



    }

}
