package asmr.ru.task3;

public class Task23 {
    public static void isExist(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Нет");
        } else {
            System.out.println("Да");
        }
    }

    public static void main(String[] args) {
        isExist(10,2);
    }
}
