package asmr.ru.task5;

public class Task77 {
    public static void array(int[] first, int[] second, int[] third) {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        for (int i = 0; i < first.length; i++) {
            if (i == 0) {
                sum1 += first[0];
            }
            if (i == 1) {
                sum2 += first[1];
            }
            if (i == 2) {
                sum3 += first[2];
            }
        }
        for (int i = 0; i < second.length; i++) {
            if (i == 0) {
                sum1 += second[0];
            }
            if (i == 1) {
                sum2 += second[1];
            }
            if (i == 2) {
                sum3 += second[2];
            }
        }
        for (int i = 0; i < third.length; i++) {
            if (i == 0) {
                sum1 += third[0];
            }
            if (i == 1) {
                sum2 += third[1];
            }
            if (i == 2) {
                sum3 += third[2];
            }
        }

        System.out.println("Первый: " + sum1 + ", второй: " + sum2 + ", третий: " + sum3);
    }

    public static void main(String[] args) {
        int[] first = {10, 20, 30};
        int[] second = {40, 50, 60};
        int[] third = {70, 80, 90};
        array(first, second, third);
    }
}
