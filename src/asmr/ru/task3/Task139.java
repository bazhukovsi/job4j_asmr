package asmr.ru.task3;

public class Task139 {
    public static void loop(int num) {
        int output = 0;
        int count = 0;
        for (int i = 1; i <= 25 ; i++) {
            if (num % i == 0) {
                count++;
                output = i;
            }
            if (count == 2) {
                break;
            }
        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        loop(25);
    }
}
