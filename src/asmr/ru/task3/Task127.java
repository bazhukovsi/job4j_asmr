package asmr.ru.task3;

public class Task127 {
    public static void loop(int num) {
        String [] strings = String.valueOf(num).split("");
        System.out.println(strings[0]);
    }

    public static void main(String[] args) {
        loop(2986);
    }
}
