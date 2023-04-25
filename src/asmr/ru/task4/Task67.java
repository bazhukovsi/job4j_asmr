package asmr.ru.task4;

public class Task67 {
    public static void isTriangle(int a, int b, int c) {
        if ((a + b + c) == 180) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        isTriangle(60,60,60);
    }
}
