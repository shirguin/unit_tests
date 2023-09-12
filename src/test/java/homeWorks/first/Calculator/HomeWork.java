package homeWorks.first.Calculator;

import homeWorks.first.Calculator.Calculator;

import static org.assertj.core.api.Assertions.*;

public class HomeWork {
    public static void main(String[] args) {
        String error1 = "Не правильный результат работы функции";
        System.out.println(Calculator.calculatingDiscount(1000, 35));
        System.out.println(Calculator.calculatingDiscount(1000, 0));
        assert 650.0 == Calculator.calculatingDiscount(1000, 35):error1;
        assert 1000.0 == Calculator.calculatingDiscount(1000, 0):error1;
    }
}
