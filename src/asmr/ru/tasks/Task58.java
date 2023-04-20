package asmr.ru.tasks;

public class Task58 {
    public static void loop(int number) {
        int count = 0;
        for (int i = 10; i < 21 ; i++) {
            if (number %i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        loop(60);
    }
}
