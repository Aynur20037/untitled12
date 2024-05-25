import java.time.Duration;
import java.time.LocalTime;

public class Task14 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(8,0);
        LocalTime localTime1 = LocalTime.of(17,0);
        Duration duration = Duration.between(localTime,localTime1);
        System.out.println(duration.toHours());
    }
}
