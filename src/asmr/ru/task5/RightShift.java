package asmr.ru.task5;

import java.util.Arrays;//        System.arrayCopy(from, fromIndex, to, toIndex, count);
//        from - массив, который копируем
//        to - массив в которой копируем
//        fromIndex - индекс в массиве from начиная с которого берем элементы для копирования
//        toIndex - индекс в массиве to начиная с которого вставляем элементы
//        count - количество элементов которые берем из массива from и вставляем в массив to
//        Массив to должен иметь достаточный размер, чтобы в нем уместились все копируемые элементы.

public class RightShift {
    public static void shift(int[] nums, int count) {
        int length = nums.length;
        int[] out = new int[length];
        System.arraycopy(nums, length - count, out, 0, count);
        System.arraycopy(nums, 0, out, count, length - count);
        nums = out;
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        shift(nums, 1);
        shift(nums, 2);
        shift(nums, 5);
    }
}
