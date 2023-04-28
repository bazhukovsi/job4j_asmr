package asmr.ru.tasks6;

public class Task147 {
    public static void loop(int num, int[] tickets) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < tickets.length; i++) {
            num = num - tickets[i];
            if (num >= 0) {
                count1++;
            } else {
                num = num + tickets[i];
                if (num <= 0) {
                    break;
                }
                count2++;
            }
        }
        System.out.println("Покупатели: " + count1 + ", отказано: " + count2);
    }

    public static void main(String[] args) {
        int[] tickets = {8, 2, 1};
        loop(10, tickets);
    }
}
