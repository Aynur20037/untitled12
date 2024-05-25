import java.time.DayOfWeek;
import java.time.LocalDate;

public class Task8 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();


        String dayOfWeekName = getDayName(dayOfWeek);
        System.out.println("Сегодня " + dayOfWeekName);

    }


    public static String getDayName(DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case MONDAY:
                return "Понедельник";
            case TUESDAY:
                return "Вторник";
            case WEDNESDAY:
                return "Среда";
            case THURSDAY:
                return "Четверг";
            case FRIDAY:
                return "Пятница";
            case SATURDAY:
                return "Суббота";
            case SUNDAY:
                return "Воскресенье";
            default:
                throw new IllegalArgumentException("Invalid day of the week: " + dayOfWeek);

        }

    }

}

