package asmr.ru.tasks6;

public class Task143 {
    public static void loop(int num1, int num2) {
        int min = Math.min (num1, num2);
        for (int i = min; i > 0 ; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        loop(15,50);
    }
}
