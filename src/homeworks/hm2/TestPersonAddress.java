package homeworks.hm2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestPersonAddress {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("John", 28, Arrays.asList(new Address("New York", "USA"), new Address("Boston", "USA"))),
                new Person("Jane", 22, Arrays.asList(new Address("London", "UK"), new Address("Manchester", "UK"))),
                new Person("Alice", 35, Arrays.asList(new Address("Sydney", "Australia"))),
                new Person("Bob", 40, Arrays.asList(new Address("Paris", "France"), new Address("Lyon", "France")))
        );

        List<Person> older30 = persons.stream().filter(p -> p.getAge()>=30).collect(Collectors.toList());
        System.out.println(older30);



    }

}
