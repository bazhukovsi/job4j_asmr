package asmr.ru.tasks;

public class Task26 {
    public static void loop(int n) {
        String output = "0 ";
        int start = 0;
        for (int i = 0; i < (2 * n) - 1; i++) {
            if (i == (2 * n) - 2) {
                start -= -8;
                output += "-" + start;
            } else  {
                start -= -8;
                output += "-" + start + " ";
            }
        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        loop(10);
    }
}
