package asmr.ru.lyambda;

import java.util.function.Supplier;

public class MRSupplier {
    public static Supplier<String> supplier() {
        return String :: new;
    }

    public static void main(String[] args) {
        Supplier<String> supplier = MRSupplier.supplier();
        System.out.println(supplier.get());
    }
}
