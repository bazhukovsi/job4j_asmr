package asmr.ru.tasks1;

public class Task96 {
    public static void loop(int[] num) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
                if (num[i] < min) {
                    min = num[i];
                }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        int[] num = {21, 23, 27, 19, 22};
        loop(num);
    }
}
