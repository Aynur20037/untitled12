import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Random;

public class Task20 {
    public static void main(String[] args) throws InterruptedException {
        LocalDateTime start = LocalDateTime.now();
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            Thread.sleep(i);
        }
        LocalDateTime finish = LocalDateTime.now();
        Duration duration = Duration.between(start, finish);
        System.out.println("Код выполнился за " + duration.getSeconds() + "." + duration.getNano() + "с.");
    }
}
