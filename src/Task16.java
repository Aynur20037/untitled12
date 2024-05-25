import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Task16 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2022,2,5);
        LocalDate localDate1 = LocalDate.of(2023,5,4);
        Period period = Period.between(localDate,localDate1);
        System.out.println(" period between " + localDate + " & " + localDate1 +" : " + period);


    }
}
