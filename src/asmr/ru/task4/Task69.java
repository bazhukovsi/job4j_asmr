package asmr.ru.task4;

public class Task69 {
    public static void squareOrRectangle(int a, int b) {
        if (a == b) {
            System.out.println("Квадрат");
        } else {
            System.out.println("Прямоугольник");
        }
    }

    public static void main(String[] args) {
        squareOrRectangle(10,12);
    }
}
