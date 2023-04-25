package asmr.ru.task4;

public class Task77 {
    public static void diffNumAmount(int num) {
        int first = num / 100;
        int second = num / 10 % 10;
        int third = num % 10;
        if (first != second && second != third && first != third) {
            System.out.println(3);
        }
        if (first == second && second != third ) {
            System.out.println(2);
        }
        if (first == third && second != third ) {
            System.out.println(2);
        }
        if (second == third && first != third ) {
            System.out.println(2);
        }
        if (first == second && second == third) {
            System.out.println(0);
        }
    }

    public static void main(String[] args) {
        diffNumAmount(222);
    }
}
