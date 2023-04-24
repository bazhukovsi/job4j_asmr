package asmr.ru.tasks1;

public class Task81 {
    public static void loop(int num) {
        int sum = 0;
        int first = num / 10;
        int second = num % 10;
        int max = Math.max(first, second);
        int min = Math.min(first, second);
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        loop(25);
    }
}
