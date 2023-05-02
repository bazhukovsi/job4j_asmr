package asmr.ru.sorted;

import java.util.Arrays;

public class ArraysSortWithObject {
    public static String[] sort(String[] data) {
        String [] rezult = new String[data.length];
        Arrays.sort(data);
        for (int i = 0; i < data.length; i++) {
            rezult[i] = data[data.length - i - 1];
        }
        System.out.println(Arrays.toString(rezult));
        return  rezult;
    }

    public static void main(String[] args) {
        String[] input = {"a", "b", "c"};
        String[] result = ArraysSortWithObject.sort(input);
    }
}
