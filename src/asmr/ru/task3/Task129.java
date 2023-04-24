package asmr.ru.task3;

public class Task129 {
    public static void loop(int num) {
        int sum = 0;
        String [] strings = String.valueOf(num).split("");
        for (int i = 0; i < strings.length; i++) {
            sum += Integer.parseInt(strings[i]);
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        loop(353);
    }
}
