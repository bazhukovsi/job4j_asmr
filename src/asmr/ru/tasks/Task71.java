package asmr.ru.tasks;

public class Task71 {
    public static void loop(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num %i == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        loop(8);
    }
}
