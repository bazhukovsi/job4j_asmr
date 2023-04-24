package asmr.ru.task3;

public class Task149 {
    public static void loop(int[] grades) {
        double avg;
        int sum = 0;
        int count = 0;
        String out = "";
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] <= 5 && grades[i] >= 1) {
                count++;
                sum += grades[i];
            } else {
                avg = sum * 1.0 / count;
                out = String.format("%.2f", avg);
                break;
            }
        }
        System.out.println(out);
    }

    public static void main(String[] args) {
        int[] grades = {2, 5, 3, 5, 6, 3, 4};
        loop(grades);
    }
}
