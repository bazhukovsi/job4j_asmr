package asmr.ru.tasks;

public class Task72 {
    public static void loop(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        loop(1);
    }
}
