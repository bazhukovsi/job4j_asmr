package asmr.ru.stream;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class CollectorClass {
    public static List<Integer> collect(List<Integer> list) {
        Supplier<List<Integer>> supplier = LinkedList::new;
        BiConsumer<List<Integer>, Integer> biConsumer = List :: add;
        BinaryOperator<List<Integer>> operator = (left, right) -> {
            left.addAll(right);
            return left;
        };
        return list.stream().collect(Collector.of(supplier, biConsumer, operator));
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
        List<Integer> out = collect(list);
        out.forEach(System.out::println);

    }
}
