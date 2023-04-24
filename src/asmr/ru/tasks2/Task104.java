package asmr.ru.tasks2;

public class Task104 {
    public static void loop(int[] num) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
                index = i;
            }
        }
        System.out.println(index);
    }

    public static void main(String[] args) {
        int[] num = {101, 303, 909, 505, 707};
        loop(num);
    }
}
