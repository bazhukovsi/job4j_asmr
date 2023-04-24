package asmr.ru.tasks2;

public class Task90 {
    public static void loop() {
        int first = 0;
        int second = 0;
        int count = 0;
        int sum = 0;
        String output = "";
        for (int i = 10; i <= 99; i++) {
            first = i / 10;
            second = i % 10;
            if (2 * (first + second) == (first * second)) {
                count++;
                sum += i;
                output += i + " ";
            }
        }
        System.out.println("Числа: " + output.trim() + ", Количество: " + count + ", Сумма: " + sum);
    }

    public static void main(String[] args) {
        loop();
    }
}
