package asmr.ru.task4;

public class Task81 {
    public static void isLatin(char s) {
        if ((s >= 65 && s <=90) || (s>=97 && s <= 122)) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        isLatin('Ф');
    }
}

