package asmr.ru.tasks1;

public class Task130 {
    public static void loop(int num) {
        int count = 0;
        String numStr = String.valueOf(num);
        String [] strings = numStr.split("");
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals("0")) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        loop(2020);
    }
}
