import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task17 {
    public static void main(String[] args) {
        String dateTime = "2004-08-01 01:02:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(dateTime,formatter);
        System.out.println(localDateTime);
    }
}
