package asmr.ru.task3;

import java.util.StringJoiner;

public class Task125 {
    public static void loop(int num) {
        StringJoiner joinerChet = new StringJoiner(" ");
        StringJoiner joinerNechet = new StringJoiner(" ");
        int countChet = 0;
        int countNechet = 0;
        String [] strings = String.valueOf(num).split("");
        for (int i = 0; i < strings.length; i++) {
            if (Integer.parseInt(strings[i]) % 2 == 0) {
                countChet++;
                joinerChet.add(strings[i]);
            }
            if (Integer.parseInt(strings[i]) % 2 != 0) {
                countNechet++;
                joinerNechet.add(strings[i]);
            }
        }
        if (countChet > 0) {
            System.out.println(joinerChet);
        }
        if (countNechet > 0) {
            System.out.println(joinerNechet);
        }
    }

    public static void main(String[] args) {
        loop(548506);
    }
}
