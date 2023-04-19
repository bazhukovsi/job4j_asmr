package asmr.ru.tasks;

public class Task53 {
    public static void loop(int n) {
        for (int i = 1; i <= n; i++) {
            if (i == n) {
                System.out.print((int) Math.pow(2, i));
            } else {
                System.out.print((int) Math.pow(2, i) + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        loop(20);
    }
}
