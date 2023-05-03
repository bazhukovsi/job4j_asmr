package asmr.ru.lyambda;

import java.util.Optional;

public class OptionalOrlElse {
    public static Integer orElse(Optional<Integer> optional) {
        return optional.orElse(-1);
    }

    public static void main(String[] args) {
        Optional<Integer> optional = Optional.of(1);
        Integer integer = orElse(optional);
        System.out.println(integer);
    }
}
