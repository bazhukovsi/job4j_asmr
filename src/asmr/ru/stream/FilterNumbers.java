package asmr.ru.stream;

import java.util.List;
import java.util.stream.Collectors;

public class FilterNumbers {
    public static List<Integer> filter(List<Integer> data) {
        return data.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> out = FilterNumbers.filter(List.of(1, 2, 3, 4));
        System.out.println(out);
    }
}
