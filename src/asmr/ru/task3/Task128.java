package asmr.ru.task3;

public class Task128 {
    public static void loop(int num) {
        String [] strings = String.valueOf(num).split("");
        System.out.println(strings.length);
    }

    public static void main(String[] args) {
        loop(1234);
    }
}
