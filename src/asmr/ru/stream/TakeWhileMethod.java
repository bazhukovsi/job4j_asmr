package asmr.ru.stream;

import java.util.List;
import java.util.stream.Collectors;

public class TakeWhileMethod {
    public static List<Integer> takeWhile(List<Integer> numbers) {
        return numbers.stream().sorted().takeWhile(n -> n < 0).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> out = TakeWhileMethod.takeWhile(List.of(3, 2, 1, 0, -2, -1));
        System.out.println(out);
    }
}
