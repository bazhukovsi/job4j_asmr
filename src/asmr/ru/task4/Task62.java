package asmr.ru.task4;

public class Task62 {
    public static void isRising(int number) {
        int first = number / 100;
        int second = number / 10 % 10;
        int third = number % 10;
        if (first < second && second < third) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        isRising(344);
    }
}
