package Task_2;

import java.time.LocalDate;
import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2019, 3, 1);
        LocalDate endDate = LocalDate.of(2024, 9, 30);
        int totalHours = 0;
        for (LocalDate date = startDate; !date.isAfter(endDate); date = date.plusDays(1)) {
            if (date.getDayOfWeek() == DayOfWeek.SATURDAY) {
                totalHours += 6;
            } else if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                totalHours += 9;
            }
        }
        System.out.println("Jami " + totalHours + " soat ishlagan.");
    }
}
