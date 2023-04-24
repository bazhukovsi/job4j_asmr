package asmr.ru.tasks2;

public class Task88 {
    public static void loop() {
        int count = 0;
        String output = "";
        int first = 0;
        int second = 0;
        for (int i = 10; i <= 99; i++) {
            first = i / 10;
            second = i % 10;
            if (3 * (first * second) == i) {
                count++;
                output += i + " ";
            }
            first = 0;
            second = 0;
        }
        System.out.println("Числа: " + output.trim() + ", Количество: " + count);
    }

    public static void main(String[] args) {
        loop();
    }
}
