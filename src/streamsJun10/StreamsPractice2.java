package streamsJun10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsPractice2 {

    public static void main(String[] args) {

        Parent parent1 = new Parent("Ruslana Zaytseva",'F',new ArrayList<>(List.of("Dany","Tetyana","Oleksiy")));
        Parent parent2 = new Parent("Rebecca Garcia",'F',new ArrayList<>(List.of("Jose","Luiza","Monica")));
        Parent parent3 = new Parent("Luce McDonald",'M',new ArrayList<>(List.of("Michael","Luna","Jessica")));

        List<Parent> parents = List.of(parent1,parent2,parent3);

        // Store  name of children in list of String
        List<String> children = parents.stream()
                .flatMap(x -> x.getChildren().stream())
                .collect(Collectors.toList());
        System.out.println(children);

        // Get first kid name into list of every male parent
        List<String> firstKidOfMaleParent = parents.stream()
                .filter(x -> x.getGender().equals('M'))
                .flatMap(x -> List.of(x.getChildren().get(0)).stream())
                .collect(Collectors.toList());
        System.out.println(firstKidOfMaleParent);

    }

}
