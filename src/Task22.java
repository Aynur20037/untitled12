import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Task22 {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime =ZonedDateTime.now();
        System.out.println(zonedDateTime);
        ZonedDateTime utc = zonedDateTime.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println(utc);

    }
}
