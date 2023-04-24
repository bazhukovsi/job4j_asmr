package asmr.ru.tasks2;

public class Task101 {
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

        System.out.println("Max: " + max + ", min: " + min);
    }

    public static void main(String[] args) {
        int[] num = {10, -6, 23, 0, -4};
        loop(num);
    }
}
