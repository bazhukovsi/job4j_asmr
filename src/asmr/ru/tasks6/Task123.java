package asmr.ru.tasks6;

public class Task123 {
    public static void loop(int num) {
        String[] strNums;
        int temp = num;
        int sum = 0;
        String out = "";
        if (num < 10) {
            System.out.println();
            return;
        }
        for (int i = 1; i < 100; i++) {
            strNums = String.valueOf(temp).split("");
            for (int j = 0; j < strNums.length; j++) {
                sum += Integer.parseInt(strNums[j]);
            }

            if (sum >= 10) {
                out += sum + " ";
                temp = sum;
                sum = 0;
            } else {
                out += sum + " ";
                break;
            }
        }
        System.out.println(out.trim());
    }

    public static void main(String[] args) {
        loop(6);
    }
}
