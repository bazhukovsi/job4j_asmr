package asmr.ru.tasks;

public class Task76 {
    public static void loop(int num1, int num2) {
        int sum = 0;
        int number = Math.max(num1, num2);
        for (int i = 1; i <= number; i++) {
            if (num1 %i == 0 && num2 %i == 0) {
                sum += i;
            }
        }
        if (sum %2 == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        loop(12,24);
    }
}
