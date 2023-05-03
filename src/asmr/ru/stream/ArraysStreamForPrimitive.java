package asmr.ru.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysStreamForPrimitive {
    public static IntStream createStream(int[] data) {
        return Arrays.stream(data);
    }

    public static void main(String[] args) {
        int [] data = {1,2,3,4,5,6,7,8,9};
        IntStream stream = createStream(data);
        stream.forEach(System.out::println);
    }
}
