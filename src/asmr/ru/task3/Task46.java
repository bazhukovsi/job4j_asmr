package asmr.ru.task3;

public class Task46 {
    public static void changeNums(int num1, int num2) {
        if (num1 < num2) {
            System.out.println(num1 + 1);
            System.out.println(num2 - 1);
        } else if (num1 > num2) {
            System.out.println(num1 - 1);
            System.out.println(num2 + 1);
        } else {
            System.out.println(num1 + 1);
            System.out.println(num2 + 1);
        }
    }

    public static void main(String[] args) {
        changeNums(25, 25);
    }
}
