package asmr.ru.tasks6;

public class Task95 {
    public static void loop(int[] math, int[] info) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < math.length; i++) {
            if ((math[i] + info[i]) / 2  >= 7 ) {
                if (math[i] > info[i]) {
                    count1++;
                } else {
                    count2++;
                }
            }
        }
        System.out.println("Зачислено: " + (count1 + count2) + ", ФМ: " + count1 + ", ФИ: " + count2);
    }

    public static void main(String[] args) {
        int [] math = {7, 9, 6, 2, 4};
        int [] info = {7, 8, 9, 5, 6};
        loop(math, info);
    }
}
