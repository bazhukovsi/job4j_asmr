package asmr.ru.stream;

import java.util.List;
import java.util.stream.Collectors;

public class DropWhileMethod {
    public static List<Integer> dropWhile(List<Integer> numbers) {
            return  numbers.stream().sorted().dropWhile(n -> n < 0).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> out = dropWhile(List.of(1, 2, 3, -6, 7, -8, 3, 3 - 4));
        System.out.println(out);
    }
}
