package asmr.ru.stream;

import java.util.List;

public class MapToIntMethod {
    public static long sum(List<Character> characters) {
        return characters.stream().mapToInt(s -> (int) s).sum();
    }

    public static void main(String[] args) {
        List<Character> list = List.of('a', 'b', 'c');
        long sum = sum(list);
        System.out.println(sum);
    }
}
