package asmr.ru.tasks2;

public class Task92 {
    public static void loop(int a1, int n1, int a2, int n2) {
        String output = "";
        int count = 0;
        int step = 0;
        if ((n2 - n1) == 1) {
            System.out.println("Нет чисел");
        } else {
            count = n2 - n1;
            step = (a2 - a1) / count;
            for (int i = a1 + step; i < (a1 + count * step); i += step) {
                output += i + " ";
            }
            System.out.println(output.trim());
        }
    }

    public static void main(String[] args) {
        loop(2, 1, 8, 4);
    }
}
