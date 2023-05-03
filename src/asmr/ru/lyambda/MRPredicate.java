package asmr.ru.lyambda;

import java.util.function.Predicate;

public class MRPredicate {
    public static Predicate<String> predicate() {
        return String :: isEmpty;
    }

    public static void main(String[] args) {
        Boolean test = predicate().test("213");
        System.out.println(test);
    }
}
