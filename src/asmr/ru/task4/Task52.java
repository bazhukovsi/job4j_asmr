package asmr.ru.task4;

public class Task52 {
    public static void isEquals(int a1, int a2, int b1, int b2) {
        if ( a1 * 1.0 / a2 == b1 * 1.0 / b2) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        isEquals(2,5,6,15);
    }
}
