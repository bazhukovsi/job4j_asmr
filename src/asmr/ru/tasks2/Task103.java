package asmr.ru.tasks2;

public class Task103 {
    public static void loop(int[] num) {
        int min = Integer.MAX_VALUE;
        int first = 0;
        int second = 0;
        int third = 0;
        int index = 0;
        for (int i = 0; i < num.length; i++) {
            first = num[i] / 100;
            second = num[i] / 10 % 10 ;
            third = num[i] % 10;
            if ((first + second + third) < min) {
                min = first + second + third;
                index = i;
            }
        }
        System.out.println(num[index]);
    }

    public static void main(String[] args) {
        int[] num = {129, 567, 911};
        loop(num);
    }
}
