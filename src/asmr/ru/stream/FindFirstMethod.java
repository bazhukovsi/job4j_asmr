package asmr.ru.stream;

import java.util.List;
import java.util.Optional;

public class FindFirstMethod {
    public static Optional<Integer> first(List<Integer> list) {
        return list.stream().findFirst();
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1);
        Optional<Integer> optional = first(list);
        optional.ifPresent(System.out::println);
    }
}
