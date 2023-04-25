package asmr.ru.task4;

public class Task71 {
    public static void change(int money) {
        int ostatok = 0;
        int sto = money / 100;
        int five = 0;
        int ten = 0;

        if (money % 10 != 0) {
            System.out.println("Нельзя");
        } else {
            ostatok = money - sto * 100;
            if (ostatok >= 50) {
                five = 1;
                ten = (ostatok - 50) / 10;
                System.out.println("100: " + sto + ", 50: " + five + ", 10: " + ten);
            }
            if (ostatok < 50) {
                ten = ostatok / 10;
                System.out.println("100: " + sto + ", 50: " + five + ", 10: " + ten);
            }
        }
    }

    public static void main(String[] args) {
        change(25);
    }
}
