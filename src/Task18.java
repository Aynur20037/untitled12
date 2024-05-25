import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Task18 {
    public static void main(String[] args) {
        ZonedDateTime utcTime = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println("Current time in UTC: " + utcTime);
        ZonedDateTime estTime = utcTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        System.out.println("Current time in EST: " + estTime);
    }
}



