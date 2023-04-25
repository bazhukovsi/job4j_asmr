package asmr.ru.task4;

public class Task78 {
    public static void divWithoutRemainder(int num) {
        int first = num / 100;
        int second = num / 10 % 10;
        int third = num % 10;
        String out = "";
        if (first != 0) {
            if (num % first == 0) {
                out += first + " ";
            }
        }
        if (second != 0) {
            if (num % second == 0) {
                out += second + " ";
            }
        }
        if (third != 0) {
            if (num % third == 0) {
                out += third + " ";
            }
        }
        if (out.equals("")) {
            System.out.println("Таких чисел нет");
        } else {
            System.out.println(out.trim());
        }
    }

    public static void main(String[] args) {
        divWithoutRemainder(222);
    }
}
