package asmr.ru.lyambda;

import java.util.List;
import java.util.Optional;

public class OptionalOfAndEmpty {
    public static Optional<String> findValue(List<String> strings, String value) {
        Optional<String> optional = Optional.empty();
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).equals(value)){
                optional = Optional.of(strings.get(i));
                break;
            }
        }
        return optional;
    }

    public static void main(String[] args) {
        List<String> list = List.of("a","b","c");
        Optional<String> optional = findValue(list, "d");
        System.out.println(optional.get());
    }
}
