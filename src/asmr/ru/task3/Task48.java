package asmr.ru.task3;

public class Task48 {
    public static void changeNum(int num1, double num2, int num3) {
        if (num1 % 2 == 0) {
            System.out.println(num1 * num2);
        } else {
            System.out.println(num1 + num3);
        }
    }

    public static void main(String[] args) {
        changeNum(3, 2.5, 3);
    }
}
