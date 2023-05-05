package asmr.ru.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StringMap {
    public static List<String> map(List<String> names) {
        return names.stream().map(str -> str + ".java").collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> list = List.of("One", "Two", "Three");
        List<String> out = map(list);
        for (String str : out) {
            System.out.println(str);
        }
    }
}
