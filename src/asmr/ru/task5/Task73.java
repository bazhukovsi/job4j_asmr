package asmr.ru.task5;

public class Task73 {
    public static void array(int[] arr) {
        int len = 0;
        boolean check = false;
        String out = "";
        if (arr.length % 2 != 0) {
            len = arr.length / 2;
            check = true;
        } else {
            len = arr.length / 2;
        }
        for (int i = 0; i < len; i++) {
            out += arr[i] + " " + arr[arr.length - i - 1];
            System.out.println(out);
            out = "";
        }
        if (check) {
            out += arr[len];
            System.out.println(out);
        }

    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 5, 6, 8};
        array(arr);
    }
}
