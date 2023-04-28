package asmr.ru.tasks6;

public class Task142 {
    public static void loop(int num) {
        int first = 0;
        int second = 1;
        int third = 0;
        for (int i = 2; i < 100; i++) {
            if (num == 0 || num == 1) {
                System.out.println("Да");
                break;
            }
            third = first + second;
            first = second;
            second = third;
            if (third == num) {
                System.out.println("Да");
                break;
            }
            if (third > num) {
                System.out.println("Нет");
                break;
            }
        }
    }

    public static void main(String[] args) {
        loop(1);
    }
}
