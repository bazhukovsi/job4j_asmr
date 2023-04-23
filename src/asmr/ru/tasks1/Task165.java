package asmr.ru.tasks1;

public class Task165 {
    public static void loop(int num) {
        String output = "";
        int count = 0;
        for (int i = 2; i <= num ; i++) {
            if (num % i == 0) {
                for (int j = 1; j <= i ; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    output += i + " ";
                }
            }
            count = 0;
        }
        System.out.println(output.trim());
    }

    public static void main(String[] args) {
        loop(10);
    }
}
