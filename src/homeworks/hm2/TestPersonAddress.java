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

        List<Person> olderThan30 = persons.stream()
                .filter(p -> p.getAge() > 30)
                .collect(Collectors.toList());
        System.out.println("People older than 30: " + olderThan30);

        List<String> names = persons.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println("List of names: " + names);

        List<String> cities = persons.stream()
                .flatMap(p -> p.getAddresses().stream())
                .map(Address::getCity)
                .collect(Collectors.toList());
        System.out.println("List of cities: " + cities);

        long uniqueCountriesCount = persons.stream()
                .flatMap(p -> p.getAddresses().stream())
                .map(Address::getCounty)
                .distinct()
                .count();
        System.out.println("Number of unique countries: " + uniqueCountriesCount);
    }
}
