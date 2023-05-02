package asmr.ru.sorted;

import java.util.*;

public class SortBySetUsingComparator {
    public static Set<String> sort(List<String> list) {
        TreeSet<String> set = new TreeSet<>(Comparator.reverseOrder());
        set.addAll(list);
        return set;
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("1", "2", "3", "4", "5");
        Set<String> result = SortBySetUsingComparator.sort(input);
        System.out.println(result);
        Set<String> expect = new TreeSet<>(Set.of("5", "4", "3", "2", "1"));
    }
}
