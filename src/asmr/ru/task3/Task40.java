package asmr.ru.task3;

public class Task40 {
    public static void isDoubleEven(int number) {
        String out = "Нет";
        int first = number / 100;
        int second = number / 10 % 10;
        int third = number % 10;
        if (number % 2 == 0 && (first + second + third) % 2 == 0) {
            out = "Да";
        }
        System.out.println(out);
    }

    public static void main(String[] args) {
        isDoubleEven(337);
    }
}
