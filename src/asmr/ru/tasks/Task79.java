package asmr.ru.tasks;

public class Task79 {
    public static void loop(int[] grades) {
        double avg = 0;
        int bad = 0;
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] <= 2) {
                bad++;
            }
            sum += grades[i];
        }
        System.out.println("Средняя оценка: " + sum * 1.0/ grades.length + ", неуд. оценка: " + bad);
    }

    public static void main(String[] args) {
        int [] grades = {3, 4, 2, 3, 5};
        loop(grades);
    }
}
