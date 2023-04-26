package asmr.ru.tasks1;

public class Task136 {
    public static void loop(int num) {
        int sq = (int) Math.sqrt(num);
        if (sq * sq == num) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        loop(16);
    }
}
