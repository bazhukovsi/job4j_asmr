package asmr.ru.tasks6;

public class Task60 {
    public static void loop() {
    int count = 0;
    int first = 0;
    int second = 0;
    for (int i = 10; i <= 20 ; i++) {
        first = i / 10;
        second = i % 10;
        if (second - first <= 3) {
            count++;
        }
    }
    System.out.println(count);
}

    public static void main(String[] args) {
        loop();
    }

}
