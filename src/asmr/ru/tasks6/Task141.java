package asmr.ru.tasks6;

public class Task141 {
    public static void loop(int x, int y) {
        int max = Math.max(x, y);
        int min = Math.min(x, y);
        int temp = max;
        int count = 0;
        String out = "";
        while (temp > min) {
            if (temp % 2 == 0) {
                temp = temp / 2;
                if (temp > min) {
                    out += temp + " ";
                    count++;
                } else {
                    break;
                }
            }
            if (temp % 2 != 0) {
                temp = temp - 1;
                if (temp > min) {
                    out += temp + " ";
                    count++;
                } else {
                    break;
                }
            }
        }
        if (out.equals("")) {
            System.out.println("Числа: " + "0" + ", Количество: " + count);
        } else {
            System.out.println("Числа: " + out.trim() + ", Количество: " + count);
        }
    }

    public static void main(String[] args) {
        loop(2, 3);
    }
}
