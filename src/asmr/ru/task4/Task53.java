package asmr.ru.task4;

public class Task53 {
    public static void transformFraction(int num1, int num2) {
        if (num1 > num2 && num1 % num2 != 0) {
            System.out.println(num1 / num2 + " " + (num1 % num2) + "/" + num2);
        } else if (num1 == num2) {
            System.out.println("1");
        } else if (num1 % num2 == 0) {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Подсчет не производится");
        }
    }

    public static void main(String[] args) {
        transformFraction(9,3);
    }
}
