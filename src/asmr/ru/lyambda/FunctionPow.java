package asmr.ru.lyambda;

import java.util.function.Function;

public class FunctionPow {
    public static double calculate(double x) {
        return calculate(i -> i*i, x);
    }

    public static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }

    public static void main(String[] args) {
        System.out.println(FunctionPow.calculate(2));
    }
}
