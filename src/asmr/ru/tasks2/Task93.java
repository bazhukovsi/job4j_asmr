package asmr.ru.tasks2;

public class Task93 {
    public static void loop(int[] first, int[] second) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < first.length; i++) {
            if ((first[i] + second[i]) >= 80) {
                count++;
                sum += (first[i] + second[i]);
            }
        }
        System.out.println("В финале: "+ count + ", сумма баллов: " + sum);
    }

    public static void main(String[] args) {
        int[] first = {30, 40, 45};
        int[] second = {50, 45, 20};
        loop(first, second);
    }
}
