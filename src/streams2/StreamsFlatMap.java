package streams2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMap {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(4,2,6));
        List<Integer> list2 = new ArrayList<>(List.of(1,9));
        List<Integer> list3 = new ArrayList<>(List.of(5,7));
        List<Integer> list4 = new ArrayList<>(List.of(3,8,2,4));

        List<List<Integer>> listList = new ArrayList<>(List.of(list,list2,list3,list4));

        System.out.println(listList);
        //[[4, 2, 6], [1, 9], [5, 7], [3, 8, 2, 4]]

        List<Integer> list1 = listList.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(list1);
    }

}
