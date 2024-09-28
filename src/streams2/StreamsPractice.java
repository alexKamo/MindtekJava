package streams2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsPractice {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("Apple","Banana","Orange","Kiwi","Melon"));
        // Get oranges that contains letter 'a'

        list.stream()
                .filter(fruit -> fruit.toLowerCase().contains("a"))
                .forEach(fruit -> System.out.println(fruit));

        //Method Reference
        // System.out::println   OR   x -> System.out.println(x);


        // Get lengths of each fruit as a list.

        List<Integer> length = list.stream()
        //        .map(String::length)
                .map(x -> x.length()) //String -> int
                .collect(Collectors.toList());
        System.out.println(length);


        //DISTINCT

        List<String> uniqueElement = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueElement);


        long numberOfUnique = list.stream()
                .distinct()
                .count();
        System.out.println(numberOfUnique);

    }

}
