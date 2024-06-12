package streamsJun10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapEx2 {

    public static void main(String[] args) {

        List<List<Integer>> numbers = new ArrayList<>();
        List<Integer> list1 = List.of(5,2,10,2);
        List<Integer> list2 = List.of(15,2,16);
        numbers.add(list1);
        numbers.add(list2);



     List<Integer> num =  numbers.stream()
                .flatMap(List::stream)
                .filter(n -> n<10)
                .map(n -> n*2)
                .collect(Collectors.toList());
        System.out.println(num);

        System.out.println("hello");
        //askjs

    }

}
