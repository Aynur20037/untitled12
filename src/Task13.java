import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Task13 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2022,8,13);
        LocalDate localDate1 = LocalDate.of(2023,1,4);
        long DaysBetween = ChronoUnit.DAYS.between(localDate,localDate1);
        System.out.println(" between " + localDate + " and " + localDate1 + DaysBetween + " days ");
    }
}
