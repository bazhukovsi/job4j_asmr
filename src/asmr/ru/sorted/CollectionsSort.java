package asmr.ru.sorted;

import java.util.*;

public class CollectionsSort {
    public static List<String> sort(List<String> data) {
        data.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
        return new ArrayList<>(data);
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("c", "b", "a", null, null);
        List<String> expect = Arrays.asList("a", "b", "c");
        List<String> out = CollectionsSort.sort(input);
        System.out.println(out);
    }
}
