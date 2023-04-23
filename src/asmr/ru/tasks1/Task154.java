package asmr.ru.tasks1;

import java.util.StringJoiner;

public class Task154 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner("");
        String output = "";
        for (int i = 10; i <= 20; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    output += j + " ";
                }
            }
            joiner.add( "Число: " + i + ", делители: " + output.trim() + System.lineSeparator());
            output = "";
        }
        System.out.print(joiner);
    }

    public static void main(String[] args) {
        loop();
    }
}
