package asmr.ru.tasks6;

public class Task137 {
    public static void loop(int num) {
        int first = 0;
        int second = 0;
        int temp = 0;
        for (int i = 1; i < 10 ; i++) {
            temp = i;
            for (int j = 1; j < 10; j++) {
                if ((temp + j) == num) {
                    System.out.println(String.valueOf(temp) + "" + String.valueOf(j));
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        loop(9);
    }
}
