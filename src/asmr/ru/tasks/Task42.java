package asmr.ru.tasks;

public class Task42 {
    public static void rightCircleShift(int number) {
        int first = 0;
        int second = 0;
        int third = 0;
        int four = 0;
        first = number / 1000;
        second = (number / 100) % 10;
        third = (number / 10) % 10;
        four = number % 10;
        if (String.valueOf(four).equals("0")) {
            System.out.println(String.valueOf(first) + String.valueOf(second) + String.valueOf(third));
        } else {
            System.out.println(String.valueOf(four) + String.valueOf(first) + String.valueOf(second) + String.valueOf(third));
        }
    }


    public static void main(String[] args) {
        rightCircleShift(1230);
    }
}
