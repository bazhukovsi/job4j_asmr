package asmr.ru.tasks2;

public class Task105 {
    public static void loop(int[] num) {
         int max = Integer.MIN_VALUE;
         int index = 0;
         int first = 0;
         int second = 0;
         int third = 0;
        for (int i = 0; i < num.length; i++) {
            first = num[i] / 100;
            second = num[i] / 10 % 10;
            third = num[i] % 10;
            if ((first + second + third) > max) {
                max = first + second + third;
                index = i;
            }
        }
        System.out.println(index);
    }

    public static void main(String[] args) {
        int[] num = {194, 333, 562};
        loop(num);
    }
}
