package asmr.ru.tasks;

public class Task78 {
    public static void loop(int[] days, int[] values) {
        int countBad = 0;
        int countTuesday = 0;
        for (int i = 0; i < days.length; i++) {
            if (values[i] >= 7) {
                countBad++;
            }
            if (days[i] == 2 && values[i] <= 5) {
                countTuesday++;
            }
        }
        System.out.println("Опасно: " + countBad + ", спокойный вторник: " + countTuesday);
    }

    public static void main(String[] args) {
        int[] days = {1, 2, 3, 4};
        int[] values = {1, 5, 7, 9};
        loop(days, values);
    }
}
