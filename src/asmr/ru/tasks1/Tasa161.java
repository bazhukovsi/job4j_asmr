package asmr.ru.tasks1;

public class Tasa161 {
    public static void loop() {
        int count = 0;
        String output = "";
        for (int i = 10; i <= 30; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                output += i + " ";
            }
            count = 0;
        }
        System.out.println(output.trim());
    }

    public static void main(String[] args) {
        loop();
    }
}
