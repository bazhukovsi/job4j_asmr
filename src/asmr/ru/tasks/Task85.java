package asmr.ru.tasks;

public class Task85 {
    public static void loop(int money, int percent, int months) {
        double summa = money;
        double proc = 0;
        for (int i = 1; i <= months ; i++) {
            proc = summa * 0.01 * percent;
            summa += proc;
        }
        System.out.printf("%.2f", summa);
        System.out.println();
    }

    public static void main(String[] args) {
        loop(10000, 10, 2);
    }
}
