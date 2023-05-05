package asmr.ru.stream;

import java.util.List;

public class NoneMatchMethod {
    public static boolean check(List<String> list) {
            return list.stream().noneMatch(s -> s.equals(""));
    }

    public static void main(String[] args) {
        List<String> list = List.of("String", "Hello", "job4jJava", "");
        boolean check = check(list);
        System.out.println(check);
    }
}
