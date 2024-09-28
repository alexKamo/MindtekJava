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

        Employee employee = new Employee("John",100,10);
        Employee employee2 = new Employee("Patel",101,20);
        Employee employee3 = new Employee("Karthik",102,10);
        Employee employee4 = new Employee("Bhanu",103,30);

        List<Employee> employees = new ArrayList<>(List.of(employee,employee2,employee3,employee4));


    }

}
