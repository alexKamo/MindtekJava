package moviesApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
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
        System.out.println("===========================================================");
        Scanner sc = new Scanner(System.in);
        List<Movie> movies = new ArrayList<>();

        while (true) {

            System.out.println("Menu:");
            System.out.println("1. Genre");
            System.out.println("2. Director");
            System.out.println("3. Year");
            System.out.println("4. For Children");
            System.out.println("5. Exit");
            System.out.print("Enter your menu number: ");

            int menu = sc.nextInt();

            switch (menu){
                case 1:
                    System.out.println("Which genre? ");
                    String genre = sc.nextLine();
                    sc.nextLine();
                    movies = searchByGenre(Database.provide().stream().filter(m -> m.getGenre().equalsIgnoreCase(genre)).toString());
                    System.out.println(Arrays.toString(movies));
                    break;
                case 2:
                    System.out.print("Which director? ");
                    String director = sc.nextLine();
                    sc.nextLine();
                    searchByDirector(director);
                    break;
                case 3:
                    System.out.print("Which year? ");
                    int year = sc.nextInt();
                    sc.nextLine();
                    searchByYear(year, year);
                    break;
                case 4:
                    System.out.println("Movies for children:");
                    sc.nextLine();
                    searchForChildren(movies);
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");

            }
            System.out.println("===========================================================");
        }











































//       for (Movie m : Database.provide()){
//           System.out.println(m);
//       }



//        List<Movie> movies = searchByYear(2000,2024);
//        print(movies);


    }

    private static List<Movie> searchForChildren(List<Movie> movie){


        return Database.provide().stream().filter(Movie::isForChildren).collect(Collectors.toList());

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
