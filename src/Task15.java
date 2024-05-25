import java.time.LocalDateTime;

public class Task15 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(" Current time : " + localDateTime);
        System.out.println(" Current time + 5 days and 2 hours : " + localDateTime.plusDays(5).plusHours(2));
        System.out.println(" Current time - 3 days and 4 hours : " + localDateTime.minusDays(3).minusHours(4));


    }
}
