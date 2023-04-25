package asmr.ru.task3;

public class Task42 {
    public static void isPairSymmetric(int number) {
        String out = "Нет";
        int first = number / 1000;
        int second = number / 100 % 10;
        int third = number / 10 % 10;
        int four = number  % 10;
        String numStr1 = first + "" + second;
        String numStr2 = third + "" + four;
        if (numStr1.equals(numStr2)) {
            out = "Да";
        }
        System.out.println(out);
    }

    public static void main(String[] args) {
        isPairSymmetric(5253);
    }
}
