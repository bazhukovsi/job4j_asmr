package asmr.ru.task3;

import java.util.StringJoiner;

public class Task71 {
    public static void array(int[] arr) {
        StringJoiner chet = new StringJoiner(" ");
        StringJoiner nechet = new StringJoiner(" ");
        for (int i = 0; i < arr.length; i += 2) {
            chet.add(String.valueOf(arr[i]));
        }
        for (int i = 1; i < arr.length; i += 2) {
            nechet.add(String.valueOf(arr[i]));
        }
        System.out.println(chet);
        System.out.println(nechet);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        array(arr);
    }
}
