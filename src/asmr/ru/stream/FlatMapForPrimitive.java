package asmr.ru.stream;

import java.util.Arrays;

public class FlatMapForPrimitive {
    public static int sum(int[][] matrix) {
         return Arrays.stream(matrix).flatMapToInt(Arrays::stream).sum();
    }

    public static void main(String[] args) {
        int sum = FlatMapForPrimitive.sum(new int[][]{
                {1, 2, 3},
                {4, 5}});
        System.out.println(sum);
    }
}
