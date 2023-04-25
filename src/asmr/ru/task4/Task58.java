package asmr.ru.task4;

public class Task58 {
    public static void isWinning(int number) {
        String out = "Нет";
        String[] strings = String.valueOf(number).split("");
        int number1 = Integer.parseInt(strings[0]) + Integer.parseInt(strings[1]) + Integer.parseInt(strings[2]);
        int number2 = Integer.parseInt(strings[3]) + Integer.parseInt(strings[4]) + Integer.parseInt(strings[5]);
        if (number1 == number2 && number1 % 2 == 0) {
            out = "Да";
        }
        System.out.println(out);
    }

    public static void main(String[] args) {
        isWinning(145505);
    }
}
