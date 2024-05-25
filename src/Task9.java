import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        LocalDate firstDate = LocalDate.of(2022, 8, 13);
        LocalDate secondDate = LocalDate.of(2023, 7, 12);
        if (firstDate.isBefore(secondDate)) {
            System.out.println(firstDate + " раньше чем " + secondDate);
        }
        if (firstDate.isAfter(secondDate)) {
            System.out.println(secondDate + " раньше чем " + firstDate);
        }
        if (firstDate.equals(secondDate)) {
            System.out.println(firstDate + " и " + secondDate + " равны ");
        }

    }
}
