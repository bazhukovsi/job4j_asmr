package asmr.ru.sorted;

import java.util.Comparator;

public class NaturalOrder {
    public static Comparator<String> naturalOrder() {
        return Comparator.naturalOrder();
    }

    public static void main(String[] args) {
        NaturalOrder.naturalOrder();
    }
}
