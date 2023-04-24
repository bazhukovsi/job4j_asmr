package asmr.ru.tasks2;

public class Task118 {
    public static void loop(int num) {
        int count = 0;
        int sum = 0;
        String [] strNums = String.valueOf(num).split("");
        for (int i = 0; i < strNums.length; i++) {
            if (Integer.parseInt(strNums[i]) % 2 == 0) {
                count++;
            } else {
                sum += Integer.parseInt(strNums[i]);
            }
        }

        System.out.println("Количество чет: " + count + ", сумма нечет: " + sum);
    }

    public static void main(String[] args) {
        loop(2235);
    }
}
