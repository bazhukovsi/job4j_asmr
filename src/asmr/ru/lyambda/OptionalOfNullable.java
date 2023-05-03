package asmr.ru.lyambda;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OptionalOfNullable {
    public static Optional<String> findValue(List<String> strings, String value) {
        Optional<String> optional = Optional.empty();
        for (int i = 0; i < strings.size(); i++) {
            if (Objects.equals(value, strings.get(i))) {
                optional = Optional.ofNullable(value);
                break;
            }
        }
        return optional;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b");
        Optional<String> optional = findValue(list, "a");
        optional.ifPresent(s -> System.out.println(optional.get()));
    }
}
