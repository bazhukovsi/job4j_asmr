package asmr.ru.tasks;

public class Task62 {
    public static void loop(int amount, int[] grades) {
        int count = amount / 2 + 1;
        int noPass = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 3) {
                noPass++;
            }
        }
        if (noPass >= count) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        int [] grades = {3,2,3,4,2};
        loop(5, grades);
    }
}
