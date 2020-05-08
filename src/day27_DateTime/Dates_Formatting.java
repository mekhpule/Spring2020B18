package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        // MMM --> Apr, Sep; MM --> 04, 09

        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf));

        /*
        create a date called birthday: month/Days/years
        ex: 2020 04 23
             Aprl/23/20
         */

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern ("EEE MMMM/dd/yy");

        LocalDate date2 = LocalDate.of(1989,10, 30);
        String str1 = date2.format(dtf2);

        System.out.println(str1);

        LocalDate date3 = LocalDate.now();

        System.out.println( date3.format(dtf2) );







    }
}
