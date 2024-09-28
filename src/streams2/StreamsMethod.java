package streams2;

import java.util.ArrayList;
import java.util.List;

public class StreamsMethod {

    public static void main(String[] args) {

        // .reduce()
        List<Integer> list = new ArrayList<>(List.of(1,3,4,6,7,9));

        // get sum of even number

        int sum = list.stream()
                .filter(x -> x%2==0)
                .reduce(0,(a,b) -> a+b);
        System.out.println(sum);

        int sum2 = list.stream()
                .filter(x -> x%2==0)
                .reduce(1,(a,b) -> a*b);
        System.out.println(sum2);


        //.grouping():
        //select departmentId, count(*) from employees group by departmentId;


    }

}
