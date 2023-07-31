import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class prog26_date_time {
    public static void main(String[] args) {
        LocalDate obj = LocalDate.now();
        System.out.println(obj);

        LocalTime obj1 = LocalTime.now();
        System.out.println(obj1);

        LocalDateTime obj2 = LocalDateTime.now();
        System.out.println("before formatting: " + obj2);

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = obj2.format(myFormatObj);
        System.out.println("after formatting: " + formattedDate);
    }
}
