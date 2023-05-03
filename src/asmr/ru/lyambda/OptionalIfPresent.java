package asmr.ru.lyambda;

import java.util.Optional;

public class OptionalIfPresent {
    public static void ifPresent(int[] data) {
        Optional<Integer> optional = max(data);
        optional.ifPresent(max -> System.out.println("Max: " + optional.get()));
    }

    private static Optional<Integer> max(int[] data) {
        Optional<Integer> optional = Optional.empty();
        int max = Integer.MIN_VALUE;
        if (data.length > 0) {
            for (int i = 0; i < data.length; i++) {
                if (data[i] > max) {
                    max = data[i];
                }
            }
            optional = Optional.of(max);
        }
        return optional;
    }

    public static void main(String[] args) {
        int[] data = {};
        ifPresent(data);
    }
}
