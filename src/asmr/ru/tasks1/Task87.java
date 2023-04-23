package asmr.ru.tasks1;

public class Task87 {
    public static void loop() {
        String output = "";
        int first = 0;
        int second = 0;
        int sum = 0;
        for (int i = 10; i <= 70 ; i++) {
            // Находим сумму двузначного числа
            first = i / 10;
            second = i % 10;
            sum = first + second;
            if (Math.pow(sum, 3) == Math.pow(i, 2)) {
                output += i;
            }

        }
        System.out.println(output.trim());
    }

    public static void main(String[] args) {
        loop();
    }
}
