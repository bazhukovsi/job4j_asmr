package asmr.ru.tasks;

public class Task54 {
    public static void loop (int [] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int [] numbers = {1,2,3,-10};
        loop(numbers);
    }
}
