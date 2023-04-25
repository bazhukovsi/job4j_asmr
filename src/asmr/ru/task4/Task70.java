package asmr.ru.task4;

public class Task70 {
    public static void secondsToMinutes(int seconds) {
        int min = 0;
        int sec = 0;
        if (seconds > 3600) {
            System.out.println("Расчет не производится");
        } else {
            min = seconds / 60;
            sec = seconds % 60;
            System.out.println("Минут: " + min + ", секунд: " + sec);
        }
    }

    public static void main(String[] args) {
        secondsToMinutes(65);
    }
}
