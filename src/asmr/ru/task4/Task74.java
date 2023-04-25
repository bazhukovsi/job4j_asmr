package asmr.ru.task4;

public class Task74 {
    public static void innerNum(int num2, int num4) {
        String [] strings = String.valueOf(num4).split("");
        if ((strings[0] + strings[1]).equals(String.valueOf(num2)) || (strings[1] + strings[2]).equals(String.valueOf(num2))
                            || (strings[2] + strings[3]).equals(String.valueOf(num2))) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        innerNum(35, 1234);
    }
}
