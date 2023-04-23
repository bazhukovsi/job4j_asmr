package asmr.ru.tasks1;

public class Task159 {
    public static void loop() {
        int sumDelitel = 0;
        int sumTemp = 0;
        for (int i = 10; i < 10000 ; i++) {
            for (int j = 1; j < i ; j++) {
                if (i%j == 0) {
                    sumTemp += j;
                }
            }
            if (sumTemp > sumDelitel) {
                sumDelitel = sumTemp;
            }
            sumTemp = 0;
        }
        System.out.println(sumDelitel);
    }

    public static void main(String[] args) {
        loop();
    }
}
