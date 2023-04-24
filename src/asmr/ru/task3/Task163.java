package asmr.ru.task3;

import java.util.StringJoiner;

public class Task163 {
    public static void loop() {
        int sum = 0;
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 10; i <= 20; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum % 2 == 0) {
                joiner.add(String.valueOf(i));
            }
            sum = 0;
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop();
    }
}
