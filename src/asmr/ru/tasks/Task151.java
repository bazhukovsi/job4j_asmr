package asmr.ru.tasks;

public class Task151 {
    public static void loop() {
        String str = "";
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j != 9) {
                    str += (i * j) + " ";
                } else {
                    str += (i * j);
                }

            }
            System.out.println(str);
            str = "";
        }
    }

    public static void main(String[] args) {
        loop();
    }
}
