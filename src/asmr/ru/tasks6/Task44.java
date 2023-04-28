package asmr.ru.tasks6;

public class Task44 {
    public static void loop() {
        int first = 0;
        int second = 0;
        int third = 0;
        double rezult = 0.0;
        String out = "";
        for (int i = 100; i < 1000; i++) {
            first = i / 100;
            second = i / 10 % 10;
            third = i % 10;
            if (!(second + "" + third).equals("00") &&
                    Integer.parseInt(first + "" + second + "" + third) != Integer.parseInt(third + "" + second + "" + first)) {
                rezult = Math.sqrt(Integer.parseInt(first + "" + second + "" + third) * Integer.parseInt(third + "" + second + "" + first));
                if (rezult % 1 == 0.0) {
                    out += i + " ";
                }
            }
        }
        System.out.println(out.trim());
    }

    public static void main(String[] args) {
        loop();
    }
}
