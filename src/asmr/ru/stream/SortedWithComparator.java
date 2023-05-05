package asmr.ru.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedWithComparator {
    public static List<String> sorted(List<String> strings) {
        return strings.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> out = SortedWithComparator.sorted(List.of("a", "b", "c"));
        System.out.println(out);
    }
}
