package asmr.ru.task3;

public class Task135 {
    public static void loop(int num) {
        String[] strings = String.valueOf(num).split("");
        for (int i = strings.length - 1; i >= 0; i--) {
            if (!strings[i].equals("0")) {
                System.out.print(strings[i]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        loop(500);
    }
}
