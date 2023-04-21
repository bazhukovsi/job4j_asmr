package asmr.ru.tasks;

public class Task74 {
    public static void loop(int num) {
        int sum = 0;
        for (int i = 1; i <= num ; i++) {
            if (num %i == 0) {
                sum += i;
            }
        }
        if (sum %2 == 0 && num%2 == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        loop(28);
    }
}
