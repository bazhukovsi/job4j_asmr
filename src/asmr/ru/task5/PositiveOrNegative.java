package asmr.ru.task5;

public class PositiveOrNegative {
    public static boolean check(int[] data) {
        boolean out = true;
        int negative = 0;
        int positive = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < 0) {
                negative++;
            }
        }
        if (negative / 2 != 0) {
            out = true;
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] < 0) {
                positive++;
            }
        }
        if (positive / 2 != 0) {
            out = false;
        }
        return out;
    }

    public static void main(String[] args) {
        int[] data = {-5, -4, -3, -2, -1, 1, 2, 3, 4, 5};
        boolean ch = check(data);
        System.out.println(ch);
    }
}
