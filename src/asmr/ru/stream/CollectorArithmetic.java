package asmr.ru.stream;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class CollectorArithmetic {
    public static Integer collect(List<Integer> list) {
        Supplier<List<Integer>> supplier = LinkedList::new;
        BiConsumer<List<Integer>, Integer> consumer = List::add;
        BinaryOperator<List<Integer>> merger = (xs, ys) -> {
            xs.addAll(ys);
            return xs;
        };
        Function<List<Integer>, Integer> function = (ns) -> {
            int number = 1;
            for (Integer n : ns) {
                number *= n;
            }
            return number;
        };
        return list.stream()
                .collect(Collector.of(supplier, consumer, merger, function));
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
        Integer out = collect(list);
        System.out.println(out);
    }
}
