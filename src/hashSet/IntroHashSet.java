package hashSet;

import collectionsJun13.Pet;

import java.util.HashSet;
import java.util.Set;

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

    }

}
