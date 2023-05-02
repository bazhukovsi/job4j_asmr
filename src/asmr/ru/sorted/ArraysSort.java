package asmr.ru.sorted;

import java.util.Arrays;

public class ArraysSort {
    public static long[] sort(long[] data) {
        long [] rezult = new long[data.length];
        Arrays.sort(data);
        for (int i = 0; i < data.length; i++) {
            rezult[i] = data[i];
        }
        return rezult;
    }
}
