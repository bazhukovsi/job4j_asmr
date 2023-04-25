package asmr.ru.task4;

public class Task102 {
    public static void loop(int[] num) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        if (max > 0 && min < 0) {
            System.out.println("Max: " + max + ", min: " + min);
        } else if (max <= 0 && min < 0) {
            System.out.println("Max: Нет" + ", min: " + min);
        } else if (max > 0 && min >= 0) {
            System.out.println("Max: " + max + ", min: Нет");
        } else {
            System.out.println("Max: Нет" + ", min: Нет");
        }
    }

    public static void main(String[] args) {
        int[] num = {0, 0};
        loop(num);
    }
}
