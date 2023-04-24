package asmr.ru.tasks2;

public class Task97 {
    public static void loop(int[] num) {
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
                count = i;
            }
        }
        System.out.println("Время: " + min + ", номер: " + count);
    }

    public static void main(String[] args) {
        int[] num = {21, 23, 27, 19, 22};
        loop(num);
    }
}
