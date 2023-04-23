package asmr.ru.tasks1;

public class Task157 {
    public static void loop() {
        int sum = 0;
        String output = "1 ";
        for (int i = 1; i <= 10000; i++) {
            for (int j = 1; j < i; j++) {
                   if (i%j == 0) {
                       sum += j;
                   }
            }
            if (i == sum) {
                output += i + " ";
            }
            sum = 0;
        }
        System.out.println(output.trim());
    }

    public static void main(String[] args) {
        loop();
    }
}
