package collectionsJun13.MapIntroJun20;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapIntro {

    public static void main(String[] args) {

        Map<Integer,String> days = new TreeMap<>();

        // key and values pairs are stored
        // keys must be unique
        // initial capacity of map is 16 buckets
        // map uses hashcode method - x and divides with 16, uses remainder to determine a bucket where this object is going to be stored
        // hash collision: when in one single bucket many objects are stored
        // equals method is used to find correct object from a bucket
        // till 8 objects hashmap utilizes linked list to store objects for  8+ situation it utilizes
        // binary tree, because binary tree is much efficient that linked list
        // add elements
        days.put(1,"Sunday");
        days.put(2,"Monday");
        days.put(6,"Friday");

        // get element
        System.out.println(days.get(6));
        System.out.println("************************");
        System.out.println(days.get(66));
        System.out.println("************************");

        // remove
        System.out.println(days.remove(6));
        System.out.println("************************");

        // contains (true or false)
        System.out.println(days.containsKey(2));
        System.out.println("************************");

        System.out.println(days.putIfAbsent(12,"Twelve"));

        System.out.println(days);
        System.out.println("************************");


    }

}
