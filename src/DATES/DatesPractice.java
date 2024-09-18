package DATES;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DatesPractice {

    public static void main(String[] args) {

        // DATE library/api/in build classes and methods

        // List, Set, Map, ArrayList, Collection, Collections -> library/api/in build classes and methods

        // String library/api/in build classes and methods
        // Streams api


        /*
        1. Date        ->    old deprecated(that no use anymore), non thread safe, mutable
        2. LocalDate   -> new, thread safe, immutable, rich with methods
         */

        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        System.out.println("-------------------------------------------------");

        // set any date what i want
        LocalDate myDate = LocalDate.of(2020,01,10);
        System.out.println(myDate);

        LocalDate myDate2 = LocalDate.of(2020, Month.APRIL,10);
        System.out.println(myDate);

        System.out.println("-------------------------------------------------");

        LocalDate twoWeeksAfter = date.plusWeeks(2);
        System.out.println(twoWeeksAfter);

        LocalDate twoWeeksBefore = date.minusWeeks(5);
        System.out.println(twoWeeksBefore);

        LocalDate customDate = LocalDate.now().minusDays(100);
        System.out.println(customDate.getDayOfWeek());




    }

}
