package asmr.ru.task4;

public class Task50 {
    public static void maxLastDigit(int num1, int num2) {
        if (num1 % 10 > num2 % 10) {
            System.out.println(num1 % 10);
        } else if (num1 % 10 < num2 % 10) {
            System.out.println(num2 % 10);
        } else {
            System.out.println("Одинаковые");
        }
    }

    public static void main(String[] args) {
        maxLastDigit(257, 3567);
    }
}
