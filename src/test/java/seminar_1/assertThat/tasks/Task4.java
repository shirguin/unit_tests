package seminar_1.assertThat.tasks;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Найдите и исправьте логическую ошибку в коде, который планирует поздравление с Новым Годом в полночь.
 */
public class Task4 {
    public static void main(String[] args) {
        happyNY();
    }
    public static void happyNY() {
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String currentDateTime = dateFormat.format(calendar.getTime());

        assert currentDateTime.equals("01/01/2023 00:00:00") : "Еще 2022 год :(";
        System.out.println("С новым годом!");
    }
}
