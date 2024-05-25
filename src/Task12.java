import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class Task12 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        Month month = localDate.getMonth();
        int year = localDate.getYear();
        System.out.println( "Current month : " + month);
        System.out.println("Current year : " + year);

    }
}
