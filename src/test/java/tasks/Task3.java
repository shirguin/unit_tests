package tasks;

/**
 * Нужно исправить метод сложения двух чисел так, чтобы при переполнении переменной
 * (Запустить пример  System.out.println(sum(2_147_483_647, 2)) ) выбрасывалось предупреждение
 */
public class Task3 {
    public static int sum(int a, int b) {
        int result = a+b;
        assert result > Integer.MAX_VALUE: "Слишком большое число";
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(2_147_483_647, 2));
    }
}
