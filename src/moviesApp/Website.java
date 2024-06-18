package moviesApp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Website {

    public static void main(String[] args) {

        /* Scanner:
            Search by:
            Keep showing menu until user put exit
                1. Genre
                2. Director
                3. Year
                4. For Children
                5. Exit

                EX:
                    1 -> which genre? - Drama : Movies found with give genre: print movies


         */


//       for (Movie m : Database.provide()){
//           System.out.println(m);
//       }



        List<Movie> movies = searchByYear(2000,2024);
        print(movies);


    }

    private static List<Movie> searchByYear(int i, int i1) {
        return Database.provide().stream().filter(m -> m.getReleaseYear()>=i && m.getReleaseYear()<=i1).collect(Collectors.toList());
    }

    private static List<Movie> searchByDirector(String director) {
        return Database.provide().stream().filter(d -> d.getDirector().contains(director)).collect(Collectors.toList());
    }

    private static void print(List<Movie> movies) {
        int num = 1;
        for (Movie m : movies){
            System.out.println(num+") "+m);
            num++;
        }

//        movies.stream().forEach(movie -> System.out.println(movie));
    }


    private static List<Movie> searchByGenre(String genre) {
//        List<Movie> list = new ArrayList<>();
//        for (Movie m : Database.provide()){
//            if (m.getGenre().equalsIgnoreCase(genre)){
//                list.add(m);
//            }
//        }
        return Database.provide().stream().filter(m -> m.getGenre().equalsIgnoreCase(genre)).collect(Collectors.toList());
    }

}
