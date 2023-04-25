package asmr.ru.task4;

public class Task76 {
    public static void sameNumAmount(int num) {
        int first = num / 100;
        int second = num / 10 % 10;
        int third = num % 10;
        if (first == second && second == third) {
            System.out.println(3);
        } else if (first == second) {
            System.out.println(2);
        } else if (first == third) {
            System.out.println(2);
        } else if (second == third) {
            System.out.println(2);
        } else {
            System.out.println(0);
        }

    }

    public static void main(String[] args) {
        sameNumAmount(123);
    }
}
