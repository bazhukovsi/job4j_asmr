package asmr.ru.tasks1;

public class Task113 {
    public static void loop(int[] first, int[] second) {
        int sumArr1 = 0;
        int sumArr2 = 0;
        for (int i = 0; i < first.length; i++) {
               if (first[i] != second[i]) {
                   sumArr1 += first[i];
                   sumArr2 += second[i];
               } else {
                   break;
               }
        }
        System.out.println("Сумма1: " + sumArr1 + ", сумма2: " + sumArr2);
    }

    public static void main(String[] args) {
        int[] first = {2, 3, 4, 4, 6};
        int[] second = {1, 2, 3, 4, 5};
        loop(first, second);
    }
}
