package asmr.ru.tasks1;

public class Task156 {
    public static void loop(int num) {
        String output = "";
        for (int i = 1; i <= num ; i++) {
            for (int j = 1; j <= i ; j++) {
                if (i%j == 0) {
                    output += "+";
                }
            }
            System.out.println(i + output.trim());
            output = "";
        }
    }

    public static void main(String[] args) {
        loop(4);
    }
}
