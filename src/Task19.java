import java.time.LocalDate;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Task19 {

    public static void main(String[] args) {
        LocalDateTime firstDate = LocalDateTime.of(2022, 8, 13,0,25,45);
        LocalDateTime secondDate = LocalDateTime.of(2023, 7, 12,12,59,16);
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
