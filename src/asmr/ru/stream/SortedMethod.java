package asmr.ru.stream;

import java.util.List;
import java.util.stream.Collectors;

public class SortedMethod {
    public static List<String> sorted(List<String> strings) {
        return strings.stream().sorted().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> out = SortedMethod.sorted(List.of("c", "b", "a"));
        System.out.println(out);
    }
}
