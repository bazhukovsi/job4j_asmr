package asmr.ru.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReduceMethodOneArgument {
    public static Integer reduce(List<Integer> list) {
        return list.stream().reduce((n1, n2) -> n1 * n2).get();
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);
        Integer rezult = reduce(list);
        System.out.println(rezult);
    }
}
