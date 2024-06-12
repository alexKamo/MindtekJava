package streamsJun10;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractice {

    public static void main(String[] args) {

        List<String> colors = List.of("Red","Blue","White","Black","Green","Pink");

        Stream<String> stream = colors.stream();

        Stream<String> sortedColors = stream
                .filter(color -> color.startsWith("B")) // Blue , Black
                .sorted(); // Black , Blue
        //  returns Stream<T> it calls INTERMEDIATE Operations

        List<String> output = sortedColors.filter(color -> color.contains("a")) // Stream<String>
                .collect(Collectors.toList()); //  List<String>
        // if return another data type it is called TERMINAL OPERATIONS

        System.out.println(output);

        System.out.println("--------------------------");
       List<Integer> length = colors.stream()
                .map(color -> color.length())
                .collect(Collectors.toList());
        System.out.println(length);

        System.out.println("--------------------------");
       boolean result = colors.stream()
                .filter(x -> x.length()==5)
                .anyMatch(x -> x.toLowerCase().contains("b"));
        System.out.println(result);


        System.out.println("--------------------------");
       boolean result2 = colors.stream()
                .filter(x -> x.length()==4)
                .noneMatch(x -> x.toLowerCase().contains("b"));
        System.out.println(result2);

        System.out.println("--------------------------");

       Integer max = colors.stream()
                .map(x -> x.length())
                .max(Integer::compareTo).get();
        System.out.println("Maximum length: "+max);
        System.out.println("--------------------------");

        Integer min = colors.stream()
                .map(String::length)
                .min(Integer::compareTo).get();
        System.out.println("Maximum length: "+min);
        System.out.println("--------------------------");

        colors.forEach(System.out::println);
        System.out.println("--------------------------"); // TERMINAL OPERATION

    }

}
