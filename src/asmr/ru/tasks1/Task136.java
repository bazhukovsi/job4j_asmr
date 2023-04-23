package asmr.ru.tasks1;

public class Task136 {
    public static void loop(int num) {
        double temp = Math.sqrt(num);
        if (Math.pow(temp, 2) == num) {
            System.out.println(Math.sqrt(num));
            System.out.println("Да");
        } else{
            System.out.println(Math.sqrt(num));
            System.out.println(num);
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        loop(17);
    }
}
