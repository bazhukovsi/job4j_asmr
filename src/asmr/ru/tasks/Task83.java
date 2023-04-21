package asmr.ru.tasks;

public class Task83 {
    public static void loop(int num) {
        double a, sum = 0;
        for (int i = 1; i <= num ; i++) {
            a = Math.sqrt(2 * i - 1);
            sum += a;
        }
        System.out.printf("%.2f", sum);
    }

    public static void main(String[] args) {
        loop(4);
    }
}
