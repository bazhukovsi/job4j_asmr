package asmr.ru.lyambda;

import java.util.Optional;

//1. Написать метод indexOf(). Он ищет индекс по значению.
// Если индекс не найден, должно вернуться Optional.empty(). Если найден, то Optional из этого индекса
//2. В методе get() нужно вызвать метод indexOf().
// Если вернулся пустой Optinal, то метод должен вернуть -1, в противном случае сам индекс

public class OptionalGetAndIsPresentTest {
    public static int get(int[] data, int el) {
        int rezult = - 1;
        Optional<Integer> optional = indexOf(data, el);
        if (optional.isPresent()) {
            rezult = optional.get();
        }
        return rezult;
    }

    private static Optional<Integer> indexOf(int[] data, int el) {
        Optional<Integer> optional = Optional.empty();
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                optional = Optional.of(i);
                break;
            }
        }
        return optional;
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        int rezult = get(data, 10);
        System.out.println(rezult);
    }
}
