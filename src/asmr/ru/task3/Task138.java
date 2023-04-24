package asmr.ru.task3;

public class Task138 {
    public static void loop() {
        int first = 0;
        int second = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 10; i < 100; i++) {
            first = i / 10;
            second = i % 10;
            if ((i % (first + second) == 0)) {
                max = i;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        loop();
    }
}
