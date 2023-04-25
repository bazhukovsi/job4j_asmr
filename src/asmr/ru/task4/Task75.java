package asmr.ru.task4;

public class Task75 {
    public static void innerNum(int num2, int num4) {
        int count = 0;
        String [] strings = String.valueOf(num4).split("");
        if ((strings[0] + strings[1]).equals(String.valueOf(num2))) {
            count++;
        }
        if ((strings[1] + strings[2]).equals(String.valueOf(num2))) {
            count++;
        }
        if ((strings[2] + strings[3]).equals(String.valueOf(num2))) {
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        innerNum(33, 3331);
    }
}
