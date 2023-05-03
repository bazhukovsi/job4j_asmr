package asmr.ru.stream;

import java.util.Arrays;
import java.util.List;

public class ReductionWithTwoArguments {
    public static Integer collect(List<Integer> list) {
        return list.stream().reduce(5, (n1, n2) -> n1 * n2);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Integer rezult = collect(list);
        System.out.println(rezult);
    }
}
