import java.time.LocalDate;
import java.time.Period;

public class Task21 {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2023, 12, 25);
        LocalDate localDate1 = LocalDate.of(2024, 3, 12);
        int cycle = 3;
        Period period = Period.ofDays(cycle);
        int cycleCount = 0;
        for (LocalDate localDate2 = localDate; localDate2.isBefore(localDate1); localDate2 = localDate2.plus(period)) {
            cycleCount++;
        }
        System.out.println(cycleCount);
    }
}
