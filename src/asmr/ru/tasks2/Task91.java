package asmr.ru.tasks2;

public class Task91 {
    public static void loop(int n1, int n2, int n3) {
        int step = 0;
        String output = "";
        if ((n2 - n1) == (n3 - n2)) {
            step = n2 - n1;
            for (int i = n3 + step; i < n3 + (3 * step + 1); i += step) {
                output += i + " ";
            }
            System.out.println(output.trim());
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        loop(2, 4, 3);
    }
}
