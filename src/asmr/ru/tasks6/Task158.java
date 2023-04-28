package asmr.ru.tasks6;

public class Task158 {
    public static void loop(int num) {
        int temp = 0;
        for (int i = 1; i < 10; i++) {
            temp = i * i;
            for (int j = 1; j < 10; j++) {
                if (temp + (j * j) == num) {
                    System.out.println("Да");
                    return;
                }
            }
        }
        System.out.println("Нет");
    }

    public static void main(String[] args) {
        loop(7);
    }
}
