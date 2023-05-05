package asmr.ru.stream;

import java.util.List;
import java.util.stream.Collectors;

public class NumberMap {
    public static List<Integer> map(List<Integer> numbers) {
        return numbers.stream().map(n -> n * n).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> out = map(list);
        for (Integer n : out) {
            System.out.print(n + " ");
        }
    }
}
