package ruslan.time;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class TimeMain {

    static String dateToString(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return dateTime.format(formatter);
    }

    static LocalDateTime stringToDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return LocalDateTime.parse(date, formatter);
    }

    public static void main(String[] args) {
        String str = "1986-04-08 12:30";
        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 = LocalDateTime.of(1986, Month.APRIL, 8, 12, 30);

        System.out.println(dateToString(dateTime1));
        System.out.println(dateToString(dateTime2));

        System.out.println(stringToDate(str));
    }

}
