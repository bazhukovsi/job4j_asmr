package asmr.ru.task5;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int count = 0;
        if (array.length <= 2) {
            count = 1;
        } else {
            count = 0;
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) {
                count++;
            } else {
                count = 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [] array = {3, 2, 1};
        int out = find(array);
        System.out.println(out);
    }
}
