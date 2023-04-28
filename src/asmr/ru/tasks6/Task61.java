package asmr.ru.tasks6;

import java.util.StringJoiner;

public class Task61 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        int first = 0;
        int second = 0;
        int third = 0;
        for (int i = 100; i <= 500; i++) {
            first = i / 100;
            second = i / 10 % 10;
            third = i % 10;
            if ((first * first + third * third) == second * second) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop();
    }
}
