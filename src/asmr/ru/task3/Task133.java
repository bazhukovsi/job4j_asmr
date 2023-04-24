package asmr.ru.task3;

public class Task133 {
    public static void loop(int num) {
        String output = "";
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (num > 1000) {
                break;
            }
            if (Math.pow(num, i) < 1000) {
                output += String.valueOf((int) Math.pow(num, i)) + " ";
            } else {
                break;
            }
        }
        if (output.equals("")) {
            System.out.print("");
        } else {
            System.out.println(output.trim());
        }
    }

    public static void main(String[] args) {
        loop(1001);
    }
}
