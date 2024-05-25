import java.time.LocalDate;

public class Task7 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.plusDays(10));
    }
}
