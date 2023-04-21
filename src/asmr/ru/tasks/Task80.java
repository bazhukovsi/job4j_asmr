package asmr.ru.tasks;

public class Task80 {
    public static void loop(int[] grades) {
        double goodAvg = 0.0;
        double badAvg = 0.0;
        int sumGood = 0;
        int sumBad = 0;
        int good = 0;
        int bad = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 3) {
                good++;
                sumGood += grades[i];
            }
            if (grades[i] <= 2) {
                bad++;
                sumBad += grades[i];
            }
        }
        System.out.println("Средняя удовл. оценка: " + (sumGood == 0 ? 0 : sumGood * 1.0 / good) + ", " +
                "средняя неуд. оценка: " + (sumBad == 0 ? 0 : sumBad * 1.0 / bad));
    }

    public static void main(String[] args) {
        int [] grades = {5, 4, 2, 3, 1};
        loop(grades);
    }
}
