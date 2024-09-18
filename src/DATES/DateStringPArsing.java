package DATES;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateStringPArsing {

    public static void main(String[] args) {

        // WE START JAVA COURSE

        String date = "2024-03-16";
        // String -> LocalDate

        LocalDate parsedDate = LocalDate.parse(date);
        System.out.println(parsedDate.getDayOfWeek());

        LocalDate todayDate = LocalDate.now();

        // todayDate - parsedDate
        System.out.println("-------------------------------------------------");

        Period period = Period.between(parsedDate,todayDate);
        int days = period.getDays();
        System.out.println("Days since we started out course " + period);

        System.out.println("*************************************************");
        String myDate = "2024/08/02 06:22";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm");

        LocalDate mockInterviewDate = LocalDate.parse(myDate,formatter);
        System.out.println(mockInterviewDate);


    }
}
