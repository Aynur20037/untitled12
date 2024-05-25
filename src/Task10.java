import java.time.Year;

public class Task10 {
    public static void main(String[] args) {
        int year = 2004;
        boolean isLeap = Year.isLeap(year);
        if (isLeap) {
            System.out.println("Этот год является високосным : " + year);
        } else {
            System.out.println("Этот год не является високосным : " + year);
        }
    }
}
