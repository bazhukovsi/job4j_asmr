package asmr.ru.tasks;

public class Task63 {
    public static void loop(int[] answers) {
        int countYes = answers.length / 2 + 1;
        int count = 0;
        String output = "";
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == 1) {
                count++;
            }
        }
        if (count >= countYes) {
            output = "Да";
        } else {
            output = "Нет";
        }
        System.out.println( count + ", " + output);
    }

    public static void main(String[] args) {
        int[] answers = {1, 1, 0, 0, 0, 0, 1};
        loop(answers);
    }
}
