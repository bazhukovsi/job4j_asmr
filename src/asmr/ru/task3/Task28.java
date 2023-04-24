package asmr.ru.task3;

public class Task28 {
    public static void isEnough(int pupils, int desks) {
        if (desks * 2 >= pupils ) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        isEnough(10, 5);
    }
}
