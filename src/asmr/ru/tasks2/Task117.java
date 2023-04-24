package asmr.ru.tasks2;

public class Task117 {
    public static void loop(int num) {
        int count = 0;
        int sum = 0;
        String [] strNums = String.valueOf(num).split("");
        for (int i = 0; i < strNums.length; i++) {
            if (Integer.parseInt(strNums[i]) % 2 == 0) {
                sum += Integer.parseInt(strNums[i]);
                count++;
            }
        }
        System.out.println("Количество: " + count + ", сумма: " + sum);
    }

    public static void main(String[] args) {
        loop(223);
    }
}
