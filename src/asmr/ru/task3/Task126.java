package asmr.ru.task3;

import java.util.StringJoiner;

public class Task126 {
    public static void loop(int num) {
        StringJoiner chet = new StringJoiner(" ");
        StringJoiner neChet = new StringJoiner(" ");
        String [] strings = String.valueOf(num).split("");
        for (int i = 0; i < strings.length; i++) {
            if (i % 2 == 0) {
                chet.add(strings[i]);
            }
        }
        for (int i = 0; i < strings.length; i++) {
            if (i % 2 != 0) {
                neChet.add(strings[i]);
            }
        }
        System.out.println(neChet);
        System.out.println(chet);
    }

    public static void main(String[] args) {
        loop(20);
    }
}
