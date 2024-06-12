package arrayList;

import java.util.ArrayList;
import java.util.List;


public class BasicList {

    public static void main(String[] args) {

        // List data type is Object
        List list = new ArrayList<>();

        list.add("John");
        list.add(123);
        list.add(2.55);
        list.add(true);
        list.add('b');

        System.out.println(list);
        list.set(0,"Patel");
        System.out.println(list);
        list.remove(new Character('b')); // remove character
        System.out.println(list);
        System.out.println("Index of Patel " + list.indexOf("Patel"));

        List sublist = list.subList(1,3); // write only special index like substring
        System.out.println(sublist);

        list.clear();
        System.out.println(list);

        System.out.println(list.isEmpty());

    }

}
