package asmr.ru.tasks6;

public class Task145 {
    public static void loop(int num1, double num2) {
        double current = num1;
        int count = 0;
        String out = "";
        while (Math.sqrt(current) > num2 + 1) {
            count++;
            out +=  String.format("%.1f", Math.sqrt(current)) + " ";
            current = Math.sqrt(current);
        }
        System.out.println("Промежуточные: " + out.trim() + ", Количество: " + count);
    }

    public static void main(String[] args) {
        loop(625, 1.1);
    }
}
