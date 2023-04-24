package asmr.ru.task3;

public class Task155 {

    public static void loop() {
        int sum = 0; // Сумма делителей
        for (int i = 10; i <= 20 ; i++) {
            for (int j = 1; j < i ; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            System.out.println("Число: " + i + ", сумма делителей: " + sum);
            sum = 0;
        }
    }

    public static void main(String[] args) {
        loop();
    }
}
