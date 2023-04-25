package asmr.ru.task3;

import java.util.StringJoiner;

public class Task70 {
    public static void array(int[] arr) {
        StringJoiner joiner1 = new StringJoiner(" ");
        StringJoiner joiner2 = new StringJoiner(" ");
        int cicle1 = 0;
        int cicle2 = 0;
        if (arr.length % 2 != 0) {
            cicle1 = arr.length / 2 + 1;
            cicle2 = arr.length - cicle1;
        } else {
            cicle1 = arr.length / 2;
            cicle2 = arr.length / 2;
        }
        for (int i = 0; i < cicle1; i++) {
            joiner1.add(String.valueOf(arr[i]));
        }
        for (int i = cicle1; i < cicle1 + cicle2; i++) {
            joiner2.add(String.valueOf(arr[i]));
        }
        System.out.println(joiner1);
        System.out.println(joiner2);
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        array(arr);
    }
}
