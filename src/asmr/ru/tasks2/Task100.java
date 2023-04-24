package asmr.ru.tasks2;

public class Task100 {
    public static void loop(int[] num) {
        int max = Integer.MIN_VALUE;
        int first = 0;
        int second = 0;
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            first = num[i] / 10;
            second = num[i] % 10;
            if ((first + second) > max) {
                max = (first + second);
                count = i;
            }
        }
        System.out.println(num[count]);
    }

    public static void main(String[] args) {
        int[] num = {24, 35, 19};
        loop(num);
    }
}
