package asmr.ru.sorted;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListSort {
    public static List<String> sort(List<String> data) {
        List<String> rezult = new ArrayList<>();
        data.sort(Comparator.nullsLast(Comparator.reverseOrder()));
        for (int i = 0; i < data.size(); i++) {
            rezult.add(data.get(i));
        }
        return rezult;
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList(null, "a", "b", "c");
        List<String> result = ListSort.sort(input);
        System.out.println(result);
        List<String> expect = Arrays.asList("c", "b", "a", null);
    }
}
