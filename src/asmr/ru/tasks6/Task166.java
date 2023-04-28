package asmr.ru.tasks6;

public class Task166 {
    public static void loop() {
        int lastNumber = 0;
        int lasNumberDelitel = 0;
        int sum = 0;
        String out = "";
        for (int i = 190; i <= 300; i++) {
            lastNumber = i % 10;
            if (lastNumber == 0) {
                for (int j = 1; j <= i ; j++) {
                    if (i % j == 0 && j % 2 != 0) {
                        sum += j;
                    }
                }
                lasNumberDelitel = sum % 10;
                if (lasNumberDelitel == 0) {
                    out += i + " ";
                }
                sum = 0;
            }
        }
        System.out.println(out.trim());
    }

    public static void main(String[] args) {
        loop();
    }
}
