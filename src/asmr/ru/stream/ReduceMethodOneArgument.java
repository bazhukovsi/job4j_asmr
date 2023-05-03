package asmr.ru.stream;

import java.util.Arrays;
import java.util.List;

public class ReduceMethodOneArgument {
    public static Integer reduce(List<Integer> list) {

        return 0;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
        Integer rezult = reduce(list);
        System.out.println(rezult);
    }
}
