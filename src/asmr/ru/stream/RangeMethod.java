package asmr.ru.stream;

import java.util.stream.IntStream;

public class RangeMethod {
    public static IntStream createStream(int start, int end) {
        return IntStream.rangeClosed(start, end);
    }

    public static void main(String[] args) {
        IntStream stream = createStream(1,10);
        stream.forEach(System.out::print);

    }
}
