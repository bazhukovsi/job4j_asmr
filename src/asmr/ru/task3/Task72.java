package asmr.ru.task3;

import java.util.StringJoiner;

public class Task72 {
    public static void array(int[] arr) {
        int count1 = 0;
        int count2 = 0;
        StringJoiner chet = new StringJoiner(" ");
        StringJoiner nechet = new StringJoiner(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count1++;
                chet.add(String.valueOf(arr[i]));
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count2++;
                nechet.add(String.valueOf(arr[i]));
            }
        }
        if (count1 > 0) {
            System.out.println(chet);
        }
        if (count2 > 0) {
            System.out.println(nechet);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7};
        array(arr);
    }
}
