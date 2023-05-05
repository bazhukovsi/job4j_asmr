package asmr.ru.stream;

import java.util.List;

public class AllMatchMethod {
    public static boolean check(List<String> list) {
        return list.stream().allMatch(s -> s.length() > 3);
    }

    public static void main(String[] args) {
        List<String> list = List.of("String", "Hello", "qqqqqq");
        boolean check = check(list);
        System.out.println(check);
    }
}
