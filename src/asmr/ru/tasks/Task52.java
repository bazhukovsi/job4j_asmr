package asmr.ru.tasks;

public class Task52 {
    public static void loop(int n, int m) {
        String output = "";
        if (n < m) {
            for (int i = m; i < (n + m); i++) {
                if (i == (n + m - 1)) {
                    output += i;
                } else {
                    output += i + " ";
                }
            }
        } else {
            for (int i = n; i < (n + m); i++) {
                if (i == (n + m - 1)) {
                    output += i;
                } else {
                    output += i + " ";
                }
            }
        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        loop(2, 5);
    }
}
