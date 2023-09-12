package homeWorks.first.Calculator;

import homeWorks.first.Calculator.Calculator;

import static org.assertj.core.api.Assertions.*;

public class HomeWork {
    public static void main(String[] args) {
        String error1 = "Не правильный результат работы функции";
        assert 650 == Calculator.calculatingDiscount(1000, 35):error1;
        assert 1000 == Calculator.calculatingDiscount(1000, 0):error1;

        System.out.println(Calculator.calculatingDiscount(1000, -10));
        System.out.println(Calculator.calculatingDiscount(-1000, 10));
    }
}
/**
 * Java, для меня язык мало знакомый, путаюсь пока в среде разработки
 * Не понял как с помощью assert написать утверждение для Exception.
 */
