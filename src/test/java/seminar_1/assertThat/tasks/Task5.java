package seminar_1.assertThat.tasks;

import static java.lang.Long.sum;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * Найти и исправить ошибку
 */
public class Task5 {
    public static void main(String[] args) {
        expectedValue();
    }
    public static void expectedValue() {
        assertThat(sum(2, 3)).isEqualTo(5);
    }
}
