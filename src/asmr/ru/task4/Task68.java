package asmr.ru.task4;

public class Task68 {
    public static void isTriangle(int a, int b, int c) {
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        isTriangle(2,3,1);
    }
}
