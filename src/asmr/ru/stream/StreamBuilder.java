package asmr.ru.stream;

import java.util.stream.Stream;

public class StreamBuilder {
    public static Stream<Object> createStream(Integer[] data) {
        return Stream.builder().add(data[0]).add(data[data.length - 1]).build();
    }

    public static void main(String[] args) {
        Integer [] data = {1,2,3,4,5,6,7,8,9};
        Stream<Object> stream = createStream(data);
        stream.forEach(System.out::println);
    }
}
