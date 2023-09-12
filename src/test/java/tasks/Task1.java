package tasks;
/***
Задание: Используйте ключевое слово assert для проверки
        вашего предположения в коде. Если утверждение не выполняется,
        программа сгенерирует AssertionError. Сможете ли вы исправить
        утверждение в этом коде, чтобы оно стало верным?
 */

public class Task1 {
    public static void assertConditionA() {
        String[] weekends = {"Суббота", "Воскресенье"};
        assert weekends.length == 3;
        System.out.println("В неделе " + weekends.length + " дня выходных");
    }
}
