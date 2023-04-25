package asmr.ru.task4;

public class Task51 {
    public static void fractionType(int num1, int num2) {
        if (num1 < num2) {
            System.out.println("Правильная");
        } else if (num1 > num2) {
            System.out.println("Неправильная");
        } else {
            System.out.println("Целое число");
        }
    }

    public static void main(String[] args) {
        fractionType(7, 3);
    }
}
