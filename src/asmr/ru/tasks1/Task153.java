package asmr.ru.tasks1;

import java.util.StringJoiner;

public class Task153 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(System.lineSeparator());
        int bull = 0;
        int cow = 0;
        for (int i = 0; i <= 10; i++) {
            joiner.add("Быков: " + i + ", коров: " + (100 - (i * 10)) / 5);
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop();
    }
}
