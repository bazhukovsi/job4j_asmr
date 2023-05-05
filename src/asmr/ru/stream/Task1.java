package asmr.ru.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static List<Integer> retain(List<Integer> list) {
        return list.stream().filter(n -> n % 4 != 0).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
        List<Integer> out = retain(list);
        System.out.println(out);
    }
}
