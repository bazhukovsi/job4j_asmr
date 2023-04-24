package asmr.ru.tasks2;

public class Task98 {
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
        System.out.println((max + min) / 2);
    }

    public static void main(String[] args) {
        int[] num = {4, 1, 2, 9, 6};
        loop(num);
    }
}
