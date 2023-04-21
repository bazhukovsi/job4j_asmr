package asmr.ru.tasks;

public class Task44 {
    public static void rightNumChange(int number1, int number2) {
        int last1 = 0;
        int last2 = 0;
        int lengthLast1 = 0;
        int lengthLast2 = 0;
        last1 = number1 % 10;
        last2 = number2 % 10;
        lengthLast1 = String.valueOf(number1).length();
        lengthLast2 = String.valueOf(number2).length();
        System.out.println(String.valueOf(number1).substring(0, lengthLast1 - 1) + last2);
        System.out.println(String.valueOf(number2).substring(0, lengthLast2 - 1) + last1);
    }

    public static void main(String[] args) {
        rightNumChange(123, 4567);  // 127, 4563
    }
}
