package asmr.ru.tasks;

public class Task59 {
    public static void loop(int num, int[] array) {
        int countEqual = 0;
        int countLess = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                countEqual++;
            }
            if (array[i] < num) {
                countLess++;
            }
        }
        System.out.println( "Равно: " + countEqual + ", меньше: " + countLess);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        loop(2,array);
    }
}
