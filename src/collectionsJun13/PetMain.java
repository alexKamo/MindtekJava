package collectionsJun13;

import java.util.HashSet;
import java.util.Set;

public class PetMain {

    public static void main(String[] args) {

        Pet catLeo = new Pet("cat","Leo",3);
        Pet dogLayka = new Pet("dog","Layka",5);
        Pet cat = new Pet("cat","Leo",3);

        boolean areSame = catLeo == cat;
        System.out.println(areSame);
        System.out.println(catLeo.hashCode());
        System.out.println(cat.hashCode());


        Set<Pet> pets = new HashSet<>();
        pets.add(catLeo);
        System.out.println(pets);



    }

}
