package asmr.ru.tasks;

public class Task77 {
    public static void loop(int num1, int num2) {
        int sum = 0;
        int number = Math.min(num1, num2);
        for (int i = 1; i <= number; i++) {
            if (num1 %i == 0 && num2 %i == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        loop(12, 24);
    }
}

