package asmr.ru.task4;

public class Task79 {
    public static void getCentury(int num) {
        if (num < 1501 || num > 2000) {
            System.out.println("Не попадает в диапазон");
        } else if (num <=1600) {
            System.out.println("16");
        } else if (num <=1700) {
            System.out.println("17");
        } else if (num <=1800) {
            System.out.println("18");
        } else if (num <=1900) {
            System.out.println("19");
        } else {
            System.out.println("20");
        }
    }

    public static void main(String[] args) {
        getCentury(2001);
    }
}
