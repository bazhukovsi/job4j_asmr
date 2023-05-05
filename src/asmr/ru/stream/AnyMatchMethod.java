package asmr.ru.stream;

import java.util.List;

public class AnyMatchMethod {
    public static boolean check(List<String> data) {
            return data.stream().anyMatch(s -> s.startsWith("job4j"));
    }

    public static void main(String[] args) {
        List<String> list = List.of("String", "Hello", "job4jJava");
        boolean check = check(list);
        System.out.println(check);
    }
}
