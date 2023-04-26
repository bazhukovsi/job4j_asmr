package asmr.ru.task5;

public class Task47 {
    public static void changeNum(int number) {
        int first = number / 100;
        int second = number / 10 % 10;
        int third = number % 10;
        if (number > 500) {
            if (third == 0 && second == 0) {
                System.out.println(first);
            } else if (third == 0) {
                System.out.println(second + "" + first);
            } else {
                System.out.println(third + "" + second + "" + first);
            }
        } else {
            System.out.println(first + "" + third + "" + second);
        }
    }

    public static void main(String[] args) {
        changeNum(610);
    }
}
