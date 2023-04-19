package asmr.ru.tasks;

public class Task55 {
    public static void loop(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] %2 == 0) {
                count++;
            }
        }
        System.out.println("Четных: " + count + ", нечетных: " + (array.length - count));
    }

    public static void main(String[] args) {
        int [] numbers = {1,2,3,-10};
        loop(numbers);
    }
}
