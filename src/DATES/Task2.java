package DATES;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Task2 {

    public static void main(String[] args) {

        String[] birthdays = {"John Doe 2000.05.17", "Alex Kamo 2000.05.17", "Kim Yan 1989.10.20"};
        /*
        1. Find average total days for all employees
         */

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        long totalDays = 0;

        for (String data: birthdays){
            String birthday = data.substring(data.lastIndexOf(" ")+1);
            //2000.05.17 -> LocalDate
            LocalDate date = LocalDate.parse(birthday,formatter);
            long days = ChronoUnit.DAYS.between(date,LocalDate.now());
            totalDays += days;
        }
        System.out.println("Average total days: " + totalDays/birthdays.length);
    }

}
