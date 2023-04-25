package asmr.ru.task3;

public class Task35 {
    public static void gradeCheck(int grade) {
        if (grade >= 1 && grade <= 5) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        gradeCheck(-2);
    }
}
