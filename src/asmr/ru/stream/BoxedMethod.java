package asmr.ru.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BoxedMethod {
    public static List<Integer> boxed(int[] data) {
           return Arrays.stream(data).boxed().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> list = boxed(new int[] {1,2,3});
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
