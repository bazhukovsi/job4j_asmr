package asmr.ru.task3;

public class Task34 {
    public static void chairsCheck(int pupils, int chairs) {
        if (pupils > chairs) {
            System.out.println("Не хватает стульев: " + (pupils - chairs));
        } else if (pupils < chairs) {
            System.out.println("Лишних стульев: " + (chairs - pupils));
        } else {
            System.out.println("Соответствует");
        }
    }

    public static void main(String[] args) {
        chairsCheck(10, 10);
    }
}
