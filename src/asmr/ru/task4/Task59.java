package asmr.ru.task4;

public class Task59 {
    public static void getLinearEquation(int a, int b) {
        double x;
        if (a == 0 && b != 0) {
            System.out.println("Нет решения");
        }
        if (a == 0 && b == 0) {
            System.out.println("Бесконечное множество");
        }
        if (a != 0 && b != 0) {
            System.out.println(-b * 1.0 / a);
        }
    }

    public static void main(String[] args) {
        getLinearEquation(2,6);
    }
}
