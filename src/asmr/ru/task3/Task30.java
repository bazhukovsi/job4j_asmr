package asmr.ru.task3;

public class Task30 {
    public static void numModify(int number) {
        if (number < 0) {
            number = Math.abs(number);
            System.out.println(number);
        } else {
            number = 0;
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        numModify(-9);
    }
}
