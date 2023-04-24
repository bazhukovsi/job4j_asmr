package asmr.ru.tasks2;

public class Task99 {
    public static void loop(int[] num) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
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
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        if ((max + min) / 2 > sum / num.length) {
            System.out.println("Больше");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        int[] num = {10, 8, 5, 4, 2};
        loop(num);
    }
}
