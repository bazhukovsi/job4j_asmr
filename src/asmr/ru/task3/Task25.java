package asmr.ru.task3;

public class Task25 {
    public static void isPositive(int number) {
        if (number > 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        isPositive(10);
    }
}
