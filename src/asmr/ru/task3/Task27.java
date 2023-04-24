package asmr.ru.task3;

public class Task27 {
    public static void isEnough(int pupils, int chairs) {
        if (chairs >= pupils) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        isEnough(10, 10);
    }
}
