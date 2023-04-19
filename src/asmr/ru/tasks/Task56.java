package asmr.ru.tasks;

public class Task56 {
    public static void loop(int[] array) {
        int number = array[0];
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > number) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int [] numbers = {2,2,3,-10};
        loop(numbers);
    }
}
