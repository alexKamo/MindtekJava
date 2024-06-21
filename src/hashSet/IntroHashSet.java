package hashSet;

import collectionsJun13.Pet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class IntroHashSet {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        System.out.println(set.add(55));
        System.out.println(set.add(55));
        set.add(67);
        set.add(66);
        System.out.println(set);
        set.remove(11);
        System.out.println(set);

        System.out.println("*************************");
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Java");
        treeSet.add("Zebra");
        treeSet.add("Apple");
        treeSet.add("Zebra");
        System.out.println(treeSet);


    }

}
