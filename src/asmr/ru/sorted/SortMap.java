package asmr.ru.sorted;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortMap {
    public static Map<Integer, String> sort(Map<Integer, String> map) {
           TreeMap<Integer, String> out = new TreeMap<>(Comparator.reverseOrder());
           out.putAll(map);
           return out;
    }

    public static void main(String[] args) {
        Map<Integer, String> input = Map.of(
                1, "1",
                2, "2",
                3, "3"
        );
        Map<Integer, String> expected = Map.of(
                3, "3",
                2, "2",
                1, "1"
        );
        Map<Integer, String> result = SortMap.sort(input);
        for (Map.Entry<Integer, String> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
