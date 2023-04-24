package asmr.ru.tasks1;

import java.util.StringJoiner;

public class Task111 {
    public static void loop(int num) {
        int sum = 0;
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = num + 1; i < Integer.MAX_VALUE; i++) {
            sum += i;
            if (sum < (num * num)) {
                joiner.add(String.valueOf(i));
            } else {
                break;
            }
        }
        System.out.println(joiner.toString());
    }

    public static void main(String[] args) {
        loop(5);
    }
}
