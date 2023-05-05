package asmr.ru.stream;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapForObject {
    public static List<Integer> flatMap(List<List<Integer>> lists) {
        return lists.stream().flatMap(Collection::stream).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> out = FlatMapForObject.flatMap(List.of(
                List.of(1, 2),
                List.of(3, 4)
        ));
        for (Integer i : out) {
            System.out.print(i + " ");
        }
    }
}
