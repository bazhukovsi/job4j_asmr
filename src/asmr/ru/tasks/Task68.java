package asmr.ru.tasks;

public class Task68 {
    public static void loop(int num1, int num2) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 2; i < num1; i++) {
            if (num1 % 2 == 0) {
                count1++;
            }
        }
        for (int i = 1; i <= num2; i++) {
            if (num2 % 2 == 0) {
                count2++;
            }
        }
        if (count1 == count2) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        loop(10, 8);
    }
}
