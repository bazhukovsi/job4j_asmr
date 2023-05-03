package asmr.ru.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class StreamMethod {
    public static Stream<Integer> createStream(Collection<Integer> data) {
        return data.stream();
    }

    public static void main(String[] args) {
        Collection<Integer> collection = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Stream<Integer> stream = createStream(collection);
        System.out.println(stream.count());
    }
}
