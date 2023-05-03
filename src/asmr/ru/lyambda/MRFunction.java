package asmr.ru.lyambda;

import java.util.function.Function;

public class MRFunction {
    public static Function<Double, Double> apply() {
        return Math :: sqrt;
    }

    public static void main(String[] args) {
        Function<Double, Double> f = MRFunction.apply();
        Double temp = f.apply(4.00);
        System.out.println(temp);
    }
}
