package asmr.ru.tasks6;

public class Task84 {
    public static void loop(int a1, int a2, int num) {
        int first = a1;
        int second = a2;
        int third = 0;
        int sum = 0;
        for (int i = 2; i < num; i++) {
            third = first + second;
            first = second;
            second = third;
            sum += second;
        }
        System.out.println(sum + a1 + a2);
    }

    public static void main(String[] args) {
        loop(2, 3, 4);
    }
}
