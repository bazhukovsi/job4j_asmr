package asmr.ru.tasks2;

public class Task51 {
    public static void loop(int n, int m) {
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        String out = "";
        for (int i = min; i <= max; i++) {
            if (i % 2 != 0) {
                out += (i * i) + " ";
            } else {
                out += "0 ";
            }
        }
        System.out.println(out.trim());
    }

    public static void main(String[] args) {
        loop(7, 2);
    }
}
