package asmr.ru.task4;

public class Task72 {
    public static void midDigitMore(int num) {
        int first = num / 100;
        int second = num / 10 % 10;
        int third = num % 10;
        if (second > first && second > third) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        midDigitMore(354);
    }
}
