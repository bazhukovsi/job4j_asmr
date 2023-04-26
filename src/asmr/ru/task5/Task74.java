package asmr.ru.task5;

public class Task74 {
    public static void array(int[] arr) {
        int len = arr.length / 2;
        String out = "";
        for (int i = 0; i < len; i++) {
            out += arr[i] + " ";
        }
        System.out.println(out.trim());
        out = "";
        for (int i = arr.length - 1; i >= len; i--) {
            out += arr[i] + " ";
        }
        System.out.println(out.trim());
    }

    public static void main(String[] args) {
        int [] arr = {1,2,4,5};
        array(arr);
    }
}
