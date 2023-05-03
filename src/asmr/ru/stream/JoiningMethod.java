package asmr.ru.stream;

import java.util.List;
import java.util.stream.Collectors;

public class JoiningMethod {
    public static String join(List<String> strings) {
        return strings.stream().collect(Collectors.joining(System.lineSeparator(), "Prefix", "Suffix"));
    }

    public static void main(String[] args) {
        List<String> strings = List.of("A", "B", "C");
        String out = join(strings);
        System.out.println(out);
    }
}
