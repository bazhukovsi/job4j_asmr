package asmr.ru.tasks2;

import java.util.StringJoiner;

public class Task89 {
    public static void loop() {
        int count = 0;
        int first = 0;
        int second = 0;
        int third = 0;
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 100; i <= 999; i++) {
            first = i / 100;
            second = i / 10 % 10;
            third = i % 10;
            if ((first * first * first + second * second * second + third * third * third) == i) {
                count++;
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println("Числа: " + joiner + ", Количество: " + count);
    }

    public static void main(String[] args) {
        loop();
    }
}
