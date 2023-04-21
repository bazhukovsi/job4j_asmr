package asmr.ru.tasks;

public class Task41 {
    public static void rightCircleShift(int number) {
        int first = 0;
        int second = 0;
        int third = 0;
        first = number / 100;
        second = (number / 10) % 10;
        third = number % 10;
        if (String.valueOf(third).equals("0")) {
            System.out.println(String.valueOf(first) + String.valueOf(second));
        } else {
            System.out.println(String.valueOf(third) + String.valueOf(first) + String.valueOf(second));
        }
    }

    public static void main(String[] args) {
        rightCircleShift(120);
    }
}
