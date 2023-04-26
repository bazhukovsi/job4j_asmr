package asmr.ru.task5;

public class Task54 {
    public static void transform(int number) {
        int first = number / 100;
        int second = number / 10 % 10;
        int third = number % 10;
        if (number % 2 == 0) {
            if (first % 2 == 0) {
                first += 1;
            } else {
                if (first != -9) {
                    first -= 1;
                }
                            }
            if (second % 2 == 0) {
                second += 1;
            } else {
                if (second != -9) {
                    second -= 1;
                }
            }
            if (third % 2 == 0) {
                third += 1;
            } else {
                if (third != -9) {
                    third -= 1;
                }
            }
            System.out.println(first + "" + second + "" + third);
        } else {
            if (first % 2 == 0) {
                first -= 1;
            } else {
                if (first != 9) {
                    first += 1;
                }
            }
            if (second % 2 == 0) {
                second -= 1;
            } else {
                if (second != 9) {
                    second += 1;
                }
            }
            if (third % 2 == 0) {
                third -= 1;
            } else {
                if (third != 9) {
                    third += 1;
                }
            }
            System.out.println(first + "" + second + "" + third);
        }
    }

    public static void main(String[] args) {
        transform(100);
    }
}
