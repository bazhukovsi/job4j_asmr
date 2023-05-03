package asmr.ru.stream;

import java.util.stream.Stream;

public class StreamIterate {
    public static void showArray(Integer[] data) {
        Stream.iterate(0, index -> index < data.length, index -> index + 2)
                .forEach(i -> System.out.println(data[i]));
    }

    public static void main(String[] args) {
        Integer [] data = {1,2,3,4,5,6,7,8,9};
        showArray(data);
    }
}
