package asmr.ru.stream;

import java.util.Comparator;
import java.util.List;

public class MinMethod {
    public static String min(List<String> list) {
        return list.stream().min(Comparator.comparingInt(String::length)).get();
    }

    public static void main(String[] args) {
        List<String> list = List.of("ccc", "bb", "a");
        String out = min(list);
        System.out.println(out);
    }
}
