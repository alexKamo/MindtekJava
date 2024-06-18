package moviesApp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Website {

    public static void main(String[] args) {

//       for (Movie m : Database.provide()){
//           System.out.println(m);
//       }

        List<Movie> movies = searchByDirector("Nolan");
        print(movies);


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
